package com.hogwartsmini.demo.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

//分页请求响应对象类
@Data
public class PageTableResponse<T> implements Serializable {
    private static final long serialVersionUID = 620421858510718076L;

    private Integer recordsTotal;
    private List<T> data;
}
