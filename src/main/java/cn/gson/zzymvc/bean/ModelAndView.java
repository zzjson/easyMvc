package cn.gson.zzymvc.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2018 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : cn.gson.zzymvc.bean</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2018年02月09日</li>
 * <li>@author     : zzy0_0</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class ModelAndView {
    //视图名称
    private String viewName;

    private Map<String, Object> model = new HashMap<>();

    public void addAttribute(String key, String value) {
        model.put(key, value);
    }

    public ModelAndView() {
    }


    public ModelAndView(String viewName, Map<String, Object> model) {
        this.viewName = viewName;
        this.model = model;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}