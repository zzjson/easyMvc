package cn.gson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : 获取请求附带信息</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月16日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Controller
@RequestMapping("/cookie")
@SessionAttributes("error")
public class CookieController {
    //   获取请求头和cookie
    @GetMapping
    public ModelAndView index(@RequestHeader("User-Agent") String userAgent,
                              @CookieValue("JSESSIONID") String jsession,
                              ModelAndView modelAndView
    ) {
        modelAndView.setViewName("redirect:/index.jsp");
        modelAndView.addObject("userAgent", userAgent);
        modelAndView.addObject("error", jsession);
        return modelAndView;
    }
}