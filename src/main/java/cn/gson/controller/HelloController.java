package cn.gson.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("hello");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/jsp/hello.jsp");
        modelAndView.addObject("msg", "fuck");
        return modelAndView;
    }
}