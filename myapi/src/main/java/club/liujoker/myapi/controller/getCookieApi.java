package club.liujoker.myapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class getCookieApi {

    /**
     *
     * @param response
     * @return
     */
    @RequestMapping(value = "getcookie",method = RequestMethod.GET)
    public String getCookie(HttpServletResponse response, @RequestParam String user){
        Cookie cookie = new Cookie("user",user);
        response.addCookie(cookie);

        return response.toString();
    }

    @RequestMapping(value = "usecookie",method = RequestMethod.GET)
    public String useCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie:cookies){
            if (cookie.getName().equals("user")&&cookie.getValue().equals("joker")){
                return "使用cookie登陆成功";
            }
        }
        return "未携带对应cookie,登陆失败";
    }
}
