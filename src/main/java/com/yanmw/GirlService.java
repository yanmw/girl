package com.yanmw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tedu on 2017/2/28.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void insertTwo(){
        Girl girl1=new Girl();
        girl1.setAge(15);
        girl1.setCupSize("C");
        girlRepository.save(girl1);

        Girl girl2=new Girl();
        girl2.setAge(17);
        girl2.setCupSize("D");
        girlRepository.save(girl2);
    }
}
