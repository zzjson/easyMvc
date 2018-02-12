package cn.gson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @GetMapping("/xx")
    public String modelAndView() {
        return "hello";
    }

}