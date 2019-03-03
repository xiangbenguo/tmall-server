package com.tmall.entity;

import java.util.Date;

public class OrderItem {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer oid;

    /**
     * 
     */
    private Integer pid;

    /**
     * 
     */
    private Integer num;

    /**
     * 
     */
    private Integer type;

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
     * @return oid 
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 
     * @param oid 
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 
     * @return pid 
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 
     * @param pid 
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 
     * @return num 
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 
     * @param num 
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 
     * @return type 
     */
    public Integer getType() {
        return type;
    }

    /**
     * 
     * @param type 
     */
    public void setType(Integer type) {
        this.type = type;
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