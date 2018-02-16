package cn.gson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : cn.gson.controller</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月10日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@RequestMapping("/hello")
@Controller
public class HelloController {
    @GetMapping
    public String index() {
        return "index";
    }

    //flashAttribute 类似于session，能够重定向之后还能够接收到参数，设置到session后自动删除
    @GetMapping("/xx")
    public String modelAndView(RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("msg", "直接在地址栏");
        redirectAttributes.addFlashAttribute("xx", "存放在session中");
        return "redirect:post";
    }

    @GetMapping("/post")
    public String post(String msg, @ModelAttribute("xx") String xx) {
        System.out.println(msg);
        System.out.println(xx);
        return "hello";
    }
}