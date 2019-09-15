package com.bootdo.project.controller;


import com.alibaba.fastjson.JSON;
import com.bootdo.common.annotation.Log;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.R;
import com.bootdo.project.model.ProjectInfoWithBLOBs;
import com.bootdo.project.model.dto.ProjectInfoDTO;
import com.bootdo.project.model.vo.ProjectInfoVO;
import com.bootdo.project.service.ContactorService;
import com.bootdo.project.service.ContractInfoService;
import com.bootdo.project.service.ProjectInfoService;
import com.bootdo.project.service.ProjectStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/project")
public class ProjectInfoController {

    @Autowired
    private ContactorService contactorService;

    @Autowired
    private ContractInfoService contractInfoService;

    @Autowired
    private ProjectInfoService projectInfoService;

    @Autowired
    private ProjectStatusService projectStatusService;

    private String prefix = "/project";

    @GetMapping("")
    String Project(Model model) {
        return prefix + "/project";
    }

    @GetMapping("/list")
    @ResponseBody
    PageUtils list(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        List<ProjectInfoDTO> projectInfoWithBLOBs =  projectInfoService.getAll();

        PageUtils pageUtil = new PageUtils(projectInfoWithBLOBs, projectInfoWithBLOBs.size());
        return pageUtil;
    }

    @GetMapping("/info")
    @ResponseBody
    ProjectInfoDTO get(Long id) {
        // 查询项目信息数据
        ProjectInfoDTO p =  projectInfoService.getProjectInfoById(id);
        return p;
    }

    @PostMapping("/remove")
    @ResponseBody
    R remove(Long id) {
        if (projectInfoService.deleteById(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @PostMapping("/save")
    @ResponseBody
    R save(@RequestBody ProjectInfoVO projectInfoVO) {

        System.out.println(JSON.toJSONString(projectInfoVO));

        if (projectInfoService.insert(projectInfoVO) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @PostMapping("/edit")
    @ResponseBody
    R edit(ProjectInfoWithBLOBs projectInfoWithBLOBs) {

        if (projectInfoService.updateByPrimaryKey(projectInfoWithBLOBs) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @Log("添加项目")
    @GetMapping("/add")
    String add(Model model) {
        return prefix + "/add";
    }


}
