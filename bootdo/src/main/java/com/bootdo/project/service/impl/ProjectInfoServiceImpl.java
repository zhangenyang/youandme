package com.bootdo.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.bootdo.project.dao.ContactorMapper;
import com.bootdo.project.dao.ContractInfoMapper;
import com.bootdo.project.dao.ProjectInfoMapper;
import com.bootdo.project.model.*;
import com.bootdo.project.model.dto.ProjectInfoVO;
import com.bootdo.project.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {

    @Autowired
    private ProjectInfoMapper projectInfoMapper;
    @Autowired
    private ContactorMapper contactorMapper;
    @Autowired
    private ContractInfoMapper contractInfoMapper;

    @Override
    public ProjectInfoWithBLOBs getProjectInfoById(Long id){
        return projectInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProjectInfoVO> getAll() {
        List<ProjectInfoWithBLOBs> list = projectInfoMapper.selectAll();
        List<ProjectInfoVO> responseList = new ArrayList<>();
        for(ProjectInfoWithBLOBs p : list){
            ProjectInfoVO projectInfoVO = new ProjectInfoVO(p);

            projectInfoVO.setCustomerContactorList(getContactorsByIds(p.getCustomerContactorIds()));
            projectInfoVO.setFollowerList(getContactorsByIds(p.getFollowerIds()));
            projectInfoVO.setRegiContactorList(getContactorsByIds(p.getRegiContactorIds()));
            projectInfoVO.setPurTenderContactorList(getContactorsByIds(p.getPurTenderIds()));
            projectInfoVO.setSurveyUnitContactorList(getContactorsByIds(p.getSurveyUnitContactorIds()));
            projectInfoVO.setSurveyUnitLeaderList(getContactorsByIds(p.getSurveyUnitLeaderIds()));
            projectInfoVO.setTenderPriceFileContactorList(getContactorsByIds(p.getTenderPriceFileContactorIds()));
            projectInfoVO.setTenderBookFileContactorList(getContactorsByIds(p.getTenderBookFileContactorIds()));
            projectInfoVO.setProveFileContactorList(getContactorsByIds(p.getProveFileContactorIds()));
            projectInfoVO.setStartTenderLeaderList(getContactorsByIds(p.getStartTenderLeaderIds()));

            List<Long> contractInfoIds = JSON.parseArray(p.getContractInfoIds(),Long.class);
            ContractInfoExample contractInfoExample = new ContractInfoExample();
            ContractInfoExample.Criteria contractInfoExampleCriteria = contractInfoExample.createCriteria();
            contractInfoExampleCriteria.andIdIn(contractInfoIds);
            List<ContractInfo> contractInfos = contractInfoMapper.selectByExample(contractInfoExample);

            projectInfoVO.setContractInfoList(contractInfos);

            responseList.add(projectInfoVO);
        }

        return responseList;
    }

    /**
     * 根据id集合获取不同类型的联系人
     * @param ids
     * @return
     */
    private List<Contactor> getContactorsByIds(String ids) {
        List<Long> contactorIds =  JSON.parseArray(ids,Long.class);
        ContactorExample example = new ContactorExample();
        ContactorExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(contactorIds);
        List<Contactor> contactors = contactorMapper.selectByExample(example);
        return contactors;
    }

    @Override
    public List<ProjectInfoWithBLOBs> getProjectInfoByIds(List<Long> ids) {
        ProjectInfoExample example = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);

        return projectInfoMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public int deleteById(Long id) {
        return projectInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.updateByPrimaryKey(record);
    }
}
