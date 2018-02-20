package cn.gson.controller;

import cn.gson.model.Cat;
import cn.gson.model.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : 多参数传参</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月17日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Controller
@RequestMapping("/dog")
public class DataBinderController {
    @GetMapping({"form"})
    public ModelAndView index() {
        return new ModelAndView("form");
    }

//    @InitBinder("dog")//自定义数据绑定注册，把请求参数转化到对应对象的属性中去
    protected void initDogBinder(WebDataBinder binder) {
        //设置字段前缀
        binder.setFieldDefaultPrefix("dog.");
    }

//    @InitBinder("cat")//自定义数据绑定注册，把请求参数转化到对应对象的属性中去
    protected void initCatBinder(WebDataBinder binder) {
        //设置字段前缀
        binder.setFieldDefaultPrefix("cat.");
    }

    @PostMapping({"list"})
    public ModelAndView index(Dog dog, Cat cat) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dog", dog);
        modelAndView.addObject("cat", cat);
        System.out.println(dog);
        System.out.println(cat);
        modelAndView.setViewName("index");
        return modelAndView;
    }

}