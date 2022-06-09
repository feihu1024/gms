package com.example.gms.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gms.entity.SurfStation;
import com.example.gms.entity.TbTrack;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface SurfStationDao extends BaseMapper<SurfStation> {

    @Update("update china_sufr_station set name=#{name} where id=#{id}")
    Integer updateSurfStationName(Integer id,String name);

    @DS("track_record")
    @Select("select * from tb_track where id=#{id}")
    TbTrack findTbTrackById(Integer id);
}
