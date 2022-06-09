package com.example.gms.service.impl;

import com.example.gms.dao.SurfStationDao;
import com.example.gms.entity.SurfStation;
import com.example.gms.entity.TbTrack;
import com.example.gms.service.SurfStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurfStationServiceImpl implements SurfStationService {

    @Autowired
    private SurfStationDao surfStationDao;

    @Override
    public Integer addSurfStation(SurfStation surfStation) {
        return surfStationDao.insert(surfStation);
    }

    @Override
    public Integer deleteSurfStationById(Integer id) {
        return surfStationDao.deleteById(id);
    }

    @Override
    public Integer updateSurfStationName(Integer id,String name) {
        return surfStationDao.updateSurfStationName(id,name);
    }

    @Override
    public SurfStation findSurfStationById(Integer id) {
        return surfStationDao.selectById(id);
    }

    @Override
    public TbTrack findTbTrackById(Integer id) {
        return surfStationDao.findTbTrackById(id);
    }

    @Override
    public List<SurfStation> getAllSurfStation() {
        return surfStationDao.selectList(null);
    }
}
