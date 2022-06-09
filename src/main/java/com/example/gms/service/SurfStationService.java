package com.example.gms.service;

import com.example.gms.entity.SurfStation;
import com.example.gms.entity.TbTrack;

import java.util.List;

public interface SurfStationService {
    Integer addSurfStation(SurfStation surfStation);
    Integer deleteSurfStationById(Integer id);
    Integer updateSurfStationName(Integer id,String name);
    SurfStation findSurfStationById(Integer id);
    TbTrack findTbTrackById(Integer id);
    List<SurfStation> getAllSurfStation();
}
