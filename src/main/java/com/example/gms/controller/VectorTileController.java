package com.example.gms.controller;

import com.example.gms.service.VectorTileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/vector")
@CrossOrigin
public class VectorTileController {
    @Autowired
    private VectorTileService vectorTileService;

    // 指定表名称
    @RequestMapping("/layerByTableName/{tableName}/{z}/{x}/{y}")
    @ResponseBody
    public byte [] getVectorTileByName(@PathVariable("tableName") String tableName, @PathVariable("z") Integer z, @PathVariable("x") Integer x, @PathVariable("y") String y, HttpServletResponse response){
        // response.setContentType("application/x-protobuf;type=mapbox-vector;chartset=UTF-8");
        // inline：直接在页面显示 attchment：以附件形式下载
        response.setHeader("content-disposition","inline;filename="+y);
        Integer tileY = Integer.valueOf(y.replaceAll("[^0-9]", ""));
        return vectorTileService.getVectorTileByTableName(tableName,x, tileY, z).getTile();
    }
}
