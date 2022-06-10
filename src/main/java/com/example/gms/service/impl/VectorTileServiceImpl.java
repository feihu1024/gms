package com.example.gms.service.impl;

import com.example.gms.entity.TileBox;
import com.example.gms.common.VectorTileUtil;
import com.example.gms.dao.VectorTileDao;
import com.example.gms.entity.VectorTile;
import com.example.gms.service.VectorTileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VectorTileServiceImpl implements VectorTileService {
    @Autowired
    private VectorTileDao vectorTileDao;

    @Override
    public VectorTile getVectorTileByTableName(String tableName, Integer x, Integer y, Integer z) {
        String columns = vectorTileDao.getColumnsByTableName(tableName).getString("column_string");
        TileBox tileBox = VectorTileUtil.tile2BoundingBox(tableName,x,y,z);
        return vectorTileDao.getVectorTileByTableName(tileBox,columns);
    }
}
