package cn.gson.controller;

import cn.gson.model.Dog;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : JSON操作</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月20日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Controller
@RequestMapping("/json")
public class JsonController {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Dog index() {
        return new Dog();
    }
}