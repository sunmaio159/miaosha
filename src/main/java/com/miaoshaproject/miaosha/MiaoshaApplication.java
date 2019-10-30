package com.miaoshaproject.miaosha;

import com.miaoshaproject.miaosha.dao.UserDOMapper;
import com.miaoshaproject.miaosha.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages ={"com.miaoshaproject"})
@MapperScan("com.miaoshaproject.miaosha.dao")
@RestController
public class MiaoshaApplication {
    @Autowired
    private UserDOMapper userDOMapper;

    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }
    @GetMapping("/hello")
    public String Hello(){
        UserDO user = userDOMapper.selectByPrimaryKey(1);
        if(user==null){
            System.out.println("用户不存在");
        }else{
            System.out.println(user.getName());
        }
        return "hello world";
    }
}
