package cn.gson.controller;


import cn.gson.zzymvc.annoation.Controller;
import cn.gson.zzymvc.annoation.RequestMapping;
import cn.gson.zzymvc.bean.ModelAndView;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : cn.gson.controller</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月08日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Controller
public class BaseController {
    @RequestMapping(value = "/xx")
    public ModelAndView base() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("base");
        modelAndView.addAttribute("msg", "hello zzy");
        return modelAndView;
    }
}