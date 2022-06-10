package com.example.gms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor// 创建无参的构造方法
@AllArgsConstructor// 创建满参的构造方法
@Accessors(chain = true)// 使用链式方法
@Data// 重写toString方法等方法

public class TileBox implements Serializable {
    private String tableName;

    private Double xmin;

    private Double ymin;

    private Double xmax;

    private Double ymax;
}
