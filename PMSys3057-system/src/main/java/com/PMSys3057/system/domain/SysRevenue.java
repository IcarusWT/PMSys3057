package com.PMSys3057.system.domain;

import com.PMSys3057.common.annotation.Excel;
import com.PMSys3057.common.base.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

// 营业额表 sys_revenue
public class SysRevenue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    @Excel(name = "年分")
    private int Year;

    @Excel(name = "一月")
    private float Jan;

    @Excel(name = "二月")
    private float Feb;

    @Excel(name = "三月")
    private float Mar;

    @Excel(name = "四月")
    private float Apr;

    @Excel(name = "五月")
    private float May;

    @Excel(name = "六月")
    private float June;

    @Excel(name = "七月")
    private float July;

    @Excel(name = "八月")
    private float Aug;

    @Excel(name = "九月")
    private float Sept;

    @Excel(name = "十月")
    private float Oct;

    @Excel(name = "十一月")
    private float Nov;

    @Excel(name = "十二月")
    private float Dec;

    public int getYear(){
        return Year;
    }

    public void setYear(int year){
        Year = year;
    }

    public float getJan() {
        return Jan;
    }

    public void setJan(float jan) {
        Jan = jan;
    }

    public float getFeb() {
        return Feb;
    }

    public void setFeb(float feb) {
        Feb = feb;
    }

    public float getMar() {
        return Mar;
    }

    public void setMar(float mar) {
        Mar = mar;
    }

    public float getApr() {
        return Apr;
    }

    public void setApr(float apr) {
        Apr = apr;
    }

    public float getMay() {
        return May;
    }

    public void setMay(float may) {
        May = may;
    }

    public float getJune() {
        return June;
    }

    public void setJune(float june) {
        June = june;
    }

    public float getJuly() {
        return July;
    }

    public void setJuly(float july) {
        July = july;
    }

    public float getAug() {
        return Aug;
    }

    public void setAug(float aug) {
        Aug = aug;
    }

    public float getSept() {
        return Sept;
    }

    public void setSept(float sept) {
        Sept = sept;
    }

    public float getOct() {
        return Oct;
    }

    public void setOct(float oct){
        Oct = oct;
    }

    public float getNov() {
        return Nov;
    }

    public void setNov(float nov) {
        Nov = nov;
    }

    public float getDec() {
        return Dec;
    }

    public void setDec(float dec) {
        Dec = dec;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("Year", getYear())
                .append("Jan", getJan())
                .append("Feb", getFeb())
                .append("Mar", getMar())
                .append("Apr", getApr())
                .append("May", getMay())
                .append("June", getJune())
                .append("July", getJuly())
                .append("Aug", getAug())
                .append("Sept", getSept())
                .append("Oct", getOct())
                .append("Nov", getNov())
                .append("Dec", getDec())
                .toString();
    }
}
