package com.PMSys3057.system.service.impl;

import com.PMSys3057.system.mapper.SysRevenueMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class SysRevenueServiceImpl {
    @Autowired
    private SysRevenueMapper revenueMapper;

    public float selectMonthRevenueByYearAndMonth(int year, int month){
        return revenueMapper.selectMonthRevenueByYearAndMonth(year, month);
    }
}
