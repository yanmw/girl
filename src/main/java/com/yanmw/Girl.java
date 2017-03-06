package com.yanmw;

import javax.persistence.GeneratedValue;

/**
 * Created by tedu on 2017/2/28.
 */
@javax.persistence.Entity
public class Girl {
    @javax.persistence.Id
    @GeneratedValue
    private Integer id;
    private String cupSize;
    private Integer age;
    public Girl(){

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public Integer getAge() {
        return age;
    }
}
