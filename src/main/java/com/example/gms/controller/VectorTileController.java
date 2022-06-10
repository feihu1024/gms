package com.example.gms.controller;

import com.example.gms.service.VectorTileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/vector")
@CrossOrigin
public class VectorTileController {
    @Autowired
    private VectorTileService vectorTileService;

    // 指定表名称
    @RequestMapping("/layerByTableName/{tableName}/{z}/{x}/{y}")
    public Object getVectorTileByName(@PathVariable("tableName") String tableName, @PathVariable("z") Integer z, @PathVariable("x") Integer x, @PathVariable("y") Integer y, HttpServletResponse response){
        response.setContentType("application/x-protobuf;type=mapbox-vector;chartset=UTF-8");
        return vectorTileService.getVectorTileByTableName(tableName,x, y, z).getTile();
    }
}
