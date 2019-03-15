package com.tmall.entity;

import java.util.Date;

public class Product {
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
    private Float price;

    /**
     * 
     */
    private Integer stock;

    /**
     *
     */
    private Integer monthSales;

    /**
     *
     */
    private Integer evaluationNum;

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
     * @return price 
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 
     * @param price 
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 
     * @return stock 
     */
    public Integer getStock() {
        return stock;
    }

    /**
     *
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     *
     * @param monthSales
     */
    public void setMonthSales(Integer monthSales) {
        this.monthSales = monthSales;
    }

    /**
     *
     * @return monthSales
     */
    public Integer getMonthSales() {
        return monthSales;
    }

    /**
     *
     * @param evaluationNum
     */
    public void setEvaluationNum(Integer evaluationNum) {
        this.evaluationNum = evaluationNum;
    }

    /**
     *
     * @return evaluationNum
     */
    public Integer getEvaluationNum() {
        return evaluationNum;
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