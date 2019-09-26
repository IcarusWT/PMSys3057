package com.PMSys3057.system.service;

public interface ISysRevenueService {
    /**
     * 查询某年某月的营业额
     * @param year 某年， month 某月
     * @return 结果
     */
    public float selectMonthRevenueByYearAndMonth(int year, int month);
}
