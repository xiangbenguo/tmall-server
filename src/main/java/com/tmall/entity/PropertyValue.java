package com.tmall.entity;

import java.util.Date;

public class PropertyValue {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String value;

    /**
     * 
     */
    private Integer ptid;

    /**
     * 
     */
    private Date createtime;

    /**
     * 
     */
    private Date updatetime;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return value 
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value 
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 
     * @return ptid 
     */
    public Integer getPtid() {
        return ptid;
    }

    /**
     * 
     * @param ptid 
     */
    public void setPtid(Integer ptid) {
        this.ptid = ptid;
    }

    /**
     * 
     * @return createTime 
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 
     * @param createtime 
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 
     * @return updateTime 
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 
     * @param updatetime 
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}