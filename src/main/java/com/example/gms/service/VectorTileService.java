package com.example.gms.service;

import com.example.gms.entity.VectorTile;

public interface VectorTileService {
    VectorTile getVectorTileByTableName(String tableName, Integer x, Integer y, Integer z);
}
