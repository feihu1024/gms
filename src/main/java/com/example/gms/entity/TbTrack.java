package com.example.gms.entity;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor// 创建无参的构造方法
@AllArgsConstructor// 创建满参的构造方法
@Accessors(chain = true)// 使用链式方法
@Data// 重写toString方法等方法
@TableName("tb_track")

public class TbTrack implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String street;

    private Double longitude;

    private Double latitude;

    @TableField("coor_type")
    private String coorType;

    @TableField("ad_code")
    private Integer adCode;

}
