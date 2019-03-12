package com.gupao.learn.springmvc.controller;

import com.gupao.learn.springmvc.utils.TestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:主页Controller
 *
 * @author 轩辚
 * @date 2019/3/12 18:29
 */
@Controller
public class IndexController {

    /**
     * 跳转到首页
     * 这里使用的双路由，使之都可以跳转到主页
     * @return 首页的路由
     */
    @RequestMapping({"/",""})
    public String indexPage(Model model){
        //直接将自定义的对象返回给Thymeleaf模版。借此实现数据的返回。
        model.addAttribute("string",new TestUtils());
        return "index";
    }

    /**
     * 将message数据返回给前端
     * @return message的数据
     */
    @ModelAttribute(name = "message")
    public String message(){
        return "Hello world";
    }

}
