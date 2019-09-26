package com.PMSys3057.system.mapper;

import com.PMSys3057.system.domain.SysRevenue;

import java.util.List;

// 月营业额
public interface SysRevenueMapper
{
    /**
     * 查询某年某月的营业额
     * @param year 某年， month 某月
     * @return 结果
     */
    public float selectMonthRevenueByYearAndMonth(int year, int month);
}