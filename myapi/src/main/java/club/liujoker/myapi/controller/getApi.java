package club.liujoker.myapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class getApi {

    /**
     * @date 2021-08-30
     * @description httpget方式调用1
     * @param name 名字
     * @apiNote "/get1?name=123"
     */
    @RequestMapping(value = "/get1",method = RequestMethod.GET)
    public String httpgetapi1(@RequestParam String name){
        String response = null;
        response = "get方法1\n" +
                "   hello!Welcome "+name;

        return response;
    }

    /**
     * @date 2021-08-30
     * @description httpget方式调用2
     * @param name 名字
     * @apiNote "/get2/123"
     */
    @RequestMapping(value = "/get2/{name}" ,method = RequestMethod.GET)
    public String httpgetapi2(@PathVariable String name){
        String response = null;
        response = "get方法2\n" +
                "   hello!Welcome "+name;

        return response;
    }
}
