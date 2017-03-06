package com.yanmw;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by tedu on 2017/2/28.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<Girl> findByCupSize(String cupSize);
}
