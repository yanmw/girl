package com.yanmw;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by tedu on 2017/2/27.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class girlProperties {
    private String cupsize;
    private Integer age;

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupsize() {
        return cupsize;
    }

    public Integer getAge() {
        return age;
    }
}
