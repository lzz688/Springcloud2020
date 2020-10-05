package com.lzz.springcloud.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//数据库表实体类
public class Payment implements Serializable {

    private Long id;
    private String serial;
}
