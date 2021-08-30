package club.liujoker.myapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloApi {

    /**
     * @date 2021-08-30
     * @description 最基本的返回hello的接口
     */
    @RequestMapping("/hello")
    public String helloapi(){
        return "hello";
    }

}
