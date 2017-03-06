package com.yanmw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tedu on 2017/2/28.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping("/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 新增一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @GetMapping("/addGirl")
    public Girl addgirl(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 删除一个女孩
     * @param id
     */
    @GetMapping("/deleteGirl/{id}")
    public void deleteGirl(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }
    @GetMapping("/updateGirl/{id}")
    public Girl updateGilr(@PathVariable("id") Integer id,@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    @GetMapping("/findByCupSize/{cupSize}")
    public List<Girl> findByCupSize(@PathVariable("cupSize")String cupSize){
        return girlRepository.findByCupSize(cupSize);
    }
    @GetMapping("/girls/two")
    public void saveTwo(){
        girlService.insertTwo();
    }
}
