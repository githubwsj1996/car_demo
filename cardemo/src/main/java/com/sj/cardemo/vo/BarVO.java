package com.sj.cardemo.vo;

import lombok.Data;

import java.util.List;


@Data
public class BarVO {
    private List<String> name;
    private List<Integer> count;
}
