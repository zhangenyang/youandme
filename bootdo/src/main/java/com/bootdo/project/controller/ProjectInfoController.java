package com.bootdo.project.controller;


import com.bootdo.common.config.Constant;
import com.bootdo.common.utils.MD5Utils;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.project.model.ProjectInfoWithBLOBs;
import com.bootdo.project.model.ProjectStatus;
import com.bootdo.project.model.dto.ProjectInfoVO;
import com.bootdo.project.service.ContactorService;
import com.bootdo.project.service.ContractInfoService;
import com.bootdo.project.service.ProjectInfoService;
import com.bootdo.project.service.ProjectStatusService;
import com.bootdo.system.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("projectInfo")
public class ProjectInfoController {

    @Autowired
    private ContactorService contactorService;

    @Autowired
    private ContractInfoService contractInfoService;

    @Autowired
    private ProjectInfoService projectInfoService;

    @Autowired
    private ProjectStatusService projectStatusService;

    @GetMapping("/list")
    @ResponseBody
    PageUtils list(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        List<ProjectInfoVO> projectInfoWithBLOBs =  projectInfoService.getAll();

        PageUtils pageUtil = new PageUtils(projectInfoWithBLOBs, projectInfoWithBLOBs.size());
        return pageUtil;
    }

    @DeleteMapping("/remove")
    @ResponseBody
    R remove(Long id) {
        if (projectInfoService.deleteById(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @PostMapping("/save")
    @ResponseBody
    R save(ProjectInfoWithBLOBs projectInfoWithBLOBs) {

        if (projectInfoService.insert(projectInfoWithBLOBs) > 0) {
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


}
