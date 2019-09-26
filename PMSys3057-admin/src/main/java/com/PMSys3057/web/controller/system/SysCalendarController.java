package com.PMSys3057.web.controller.system;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 日历管理
@Controller
@RequestMapping("/system/calendar")
public class SysCalendarController {

    private String prefix = "system/calendar";

    @RequiresPermissions("system:calendar:view")
    @GetMapping()
    public String operlog()
    {
        return prefix + "/calendar";
    }
}
