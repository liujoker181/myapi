package club.liujoker.myapi.controller;

import club.liujoker.myapi.domain.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class postApi {

    static Map<Long,User> users = new HashMap<Long,User>();

    /**
     * 使用post方法,新增一个User
     * @param response
     * @param user
     * @return
     */
    @RequestMapping(value = "post-adduser",method = RequestMethod.POST)
    public String postapi_adduser(HttpServletResponse response, @RequestBody User user){
//      @RequestBody注解可用于绑定application/json类型上传的数据
        users.put(user.getId(),user);

        return "success";
    }

    /**
     * 使用get方法，格局id查找User
     * @param id User.id
     * @return
     */
    @RequestMapping(value = "/get-finduser",method = RequestMethod.GET)
    public String getapi_finduser(@RequestParam Long id){

        return "get-finduser success!\n"+users.get(id).toString();
    }
}
