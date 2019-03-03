package com.tmall.entity;

import java.util.Date;

public class Property {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer cid;

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
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return cid 
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 
     * @param cid 
     */
    public void setCid(Integer cid) {
        this.cid = cid;
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