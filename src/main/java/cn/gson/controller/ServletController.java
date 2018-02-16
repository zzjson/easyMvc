package cn.gson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : servlet基本操作</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月14日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@RequestMapping("/servlet")
@Controller
public class ServletController {
    public void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("").forward(request, response);
        response.sendRedirect("/WEB-INF/jsp/index.jsp");
        request.setAttribute("msg", "baseMessage");
        //输出JSON格式
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().print("");
    }
}