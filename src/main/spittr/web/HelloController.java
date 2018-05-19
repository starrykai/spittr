package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yaoxiaohui on 2018/5/18.
 */
@Controller //声明一个控制器
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "home"; //视图名为home
    }
}
