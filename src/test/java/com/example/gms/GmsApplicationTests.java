package com.example.gms;

import com.example.gms.entity.VectorTile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmsApplicationTests {

    @Test
    void parseIntTest() {
        String y= "234.mvt";
        String test = y.replaceAll("[^0-9]", "");

        Integer tileY = Integer.parseInt(test);
        System.out.println(test+"----------->>"+tileY);
    }
}
