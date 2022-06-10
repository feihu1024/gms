package com.example.gms.dao;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gms.entity.TileBox;
import com.example.gms.entity.VectorTile;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface VectorTileDao extends BaseMapper {

    // 查询指定表的字段（忽略geom列）
    @Select("select array_to_string(array_agg(column_name),',') as column_string from information_schema.columns where table_name = #{tableName} and column_name !='geom'")
    JSONObject getColumnsByTableName(String tableName);

    // 查询mvt切片
    @Select("select ST_AsMVT (tile.*, #{tileBox.tableName}) tile from (" +
            "select ${columns}, " +
            "ST_AsMVTGeom(st_transform(t.geom,4326),st_makeenvelope ( #{tileBox.xmin},#{tileBox.ymin},#{tileBox.xmax},#{tileBox.ymax}, 4326 ),4096,0,true) " +
            "as tile_geom from ${tileBox.tableName} t" +
            ") as tile where tile.tile_geom IS NOT NULL")
    VectorTile getVectorTileByTableName(@Param("tileBox") TileBox tileBox,String columns);
}