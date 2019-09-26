package com.PMSys3057.web.controller.monitor;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// 预算管理
@Controller
@RequestMapping("/monitor/budget")
public class BudgetController {

    private String prefix = "monitor/budget";

    @RequiresPermissions("monitor:budget:view")
    @GetMapping()
    public String operlog()
    {
        return prefix + "/budget";
    }
}
