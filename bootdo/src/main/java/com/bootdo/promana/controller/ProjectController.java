package com.bootdo.promana.controller;

import com.bootdo.common.annotation.Log;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.promana.domain.ProjectDO;
import com.bootdo.promana.service.ProjectService;
import com.bootdo.system.domain.RoleDO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequestMapping("/project")
@Controller
public class ProjectController {

    private String prefix = "promana/project";

    @Autowired
    ProjectService projectService;

    @GetMapping("")
    String Project(Model model) {
        return prefix + "/project";
    }

//    @GetMapping("")
//    String addDeptUser() {
//        return prefix + "/deptUser";
//    }
//
//    @GetMapping("")
//    String addFollowUser() {
//        return prefix + "/followUser";
//    }
//
//    @GetMapping("")
//    String addPurchasingUnitUser() {
//        return prefix + "/purchasingUnitUser";
//    }

    @GetMapping("/list")
    @ResponseBody
    PageUtils list(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        Query query = new Query(params);
        List<ProjectDO> projectList = projectService.list(query);
        int total = projectService.count(query);
        PageUtils pageUtil = new PageUtils(projectList, total);
        return pageUtil;
    }

    @Log("添加项目")
    @GetMapping("/add")
    String add(Model model) {
        return prefix + "/add";
    }
}
