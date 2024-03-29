package com.PMSys3057.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.PMSys3057.common.annotation.Excel;
import com.PMSys3057.common.base.BaseEntity;

// 字典数据表 sys_dict_data
public class SysDictData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    @Excel(name = "字典编码")
    private Long dictCode;

    @Excel(name = "字典排序")
    private Long dictSort;

    @Excel(name = "字典标签")
    private String dictLabel;

    @Excel(name = "字典键值")
    private String dictValue;

    @Excel(name = "字典类型")
    private String dictType;

    @Excel(name = "字典样式")
    private String cssClass;

    private String listClass;

    @Excel(name = "是否默认", readConverterExp = "Y=是,N=否")
    private String isDefault;

    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public Long getDictCode()
    {
        return dictCode;
    }

    public void setDictCode(Long dictCode)
    {
        this.dictCode = dictCode;
    }

    public Long getDictSort()
    {
        return dictSort;
    }

    public void setDictSort(Long dictSort)
    {
        this.dictSort = dictSort;
    }

    public String getDictLabel()
    {
        return dictLabel;
    }

    public void setDictLabel(String dictLabel)
    {
        this.dictLabel = dictLabel;
    }

    public String getDictValue()
    {
        return dictValue;
    }

    public void setDictValue(String dictValue)
    {
        this.dictValue = dictValue;
    }

    public String getDictType()
    {
        return dictType;
    }

    public void setDictType(String dictType)
    {
        this.dictType = dictType;
    }

    public String getCssClass()
    {
        return cssClass;
    }

    public void setCssClass(String cssClass)
    {
        this.cssClass = cssClass;
    }

    public String getListClass()
    {
        return listClass;
    }

    public void setListClass(String listClass)
    {
        this.listClass = listClass;
    }

    public String getIsDefault()
    {
        return isDefault;
    }

    public void setIsDefault(String isDefault)
    {
        this.isDefault = isDefault;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
    
	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dictCode", getDictCode())
            .append("dictSort", getDictSort())
            .append("dictLabel", getDictLabel())
            .append("dictValue", getDictValue())
            .append("dictType", getDictType())
            .append("cssClass", getCssClass())
            .append("listClass", getListClass())
            .append("isDefault", getIsDefault())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
