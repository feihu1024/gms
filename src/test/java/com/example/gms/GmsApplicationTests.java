package com.example.gms;

import com.example.gms.entity.SurfStation;
import com.example.gms.entity.TbTrack;
import com.example.gms.service.SurfStationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmsApplicationTests {

    @Autowired
    SurfStationService surfStationService;

    @Test
    void findSurfStationByIdTest() {
        SurfStation surfStation = surfStationService.findSurfStationById(12);
        System.out.println(surfStation);
    }

    @Test
    void addTest() {
        SurfStation surfStation = new SurfStation();
        surfStation.setName("测试站点");
        surfStationService.addSurfStation(surfStation);
    }

    @Test
    void updateTest() {
        surfStationService.updateSurfStationName(2170,"测试站点2");
    }

    @Test
    void deleteTest() {
        surfStationService.deleteSurfStationById(2170);
        List<SurfStation> surfStationList = surfStationService.getAllSurfStation();
        System.out.println(surfStationList);
    }

    @Test
    void testFindTrackTest() {
        TbTrack tbTrack =  surfStationService.findTbTrackById(26);
        System.out.println(tbTrack);
    }


}
