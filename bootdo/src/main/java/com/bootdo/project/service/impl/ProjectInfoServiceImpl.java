package com.bootdo.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.bootdo.common.utils.StringUtils;
import com.bootdo.project.dao.ContactorMapper;
import com.bootdo.project.dao.ContractInfoMapper;
import com.bootdo.project.dao.ProjectInfoMapper;
import com.bootdo.project.model.*;
import com.bootdo.project.model.dto.ProjectInfoDTO;
import com.bootdo.project.model.vo.ProjectInfoVO;
import com.bootdo.project.service.ContactorService;
import com.bootdo.project.service.ContractInfoService;
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

    @Autowired
    private ContactorService contactorService;

    @Autowired
    private ContractInfoService contractInfoService;

    @Override
    public ProjectInfoDTO getProjectInfoById(Long id){

        ProjectInfoWithBLOBs p =  projectInfoMapper.selectByPrimaryKey(id);
        if (p == null) {
            return null;
        }
        ProjectInfoDTO projectInfoDTO = getProjectInfoDTO(p);
        return projectInfoDTO;

    }

    @Override
    public List<ProjectInfoDTO> getAll() {
        List<ProjectInfoWithBLOBs> list = projectInfoMapper.selectAll();
        List<ProjectInfoDTO> responseList = new ArrayList<>();
        for(ProjectInfoWithBLOBs p : list){
            ProjectInfoDTO projectInfoDTO = getProjectInfoDTO(p);

            responseList.add(projectInfoDTO);
        }

        return responseList;
    }

    private ProjectInfoDTO getProjectInfoDTO(ProjectInfoWithBLOBs p) {
        ProjectInfoDTO projectInfoDTO = new ProjectInfoDTO(p);

        projectInfoDTO.setCustomerContactorList(getContactorsByIds(p.getCustomerContactorIds()));
        projectInfoDTO.setFollowerList(getContactorsByIds(p.getFollowerIds()));
        projectInfoDTO.setRegiContactorList(getContactorsByIds(p.getRegiContactorIds()));
        projectInfoDTO.setPurTenderContactorList(getContactorsByIds(p.getPurTenderIds()));
        projectInfoDTO.setSurveyUnitContactorList(getContactorsByIds(p.getSurveyUnitContactorIds()));
        projectInfoDTO.setSurveyUnitLeaderList(getContactorsByIds(p.getSurveyUnitLeaderIds()));
        projectInfoDTO.setTenderPriceFileContactorList(getContactorsByIds(p.getTenderPriceFileContactorIds()));
        projectInfoDTO.setTenderBookFileContactorList(getContactorsByIds(p.getTenderBookFileContactorIds()));
        projectInfoDTO.setProveFileContactorList(getContactorsByIds(p.getProveFileContactorIds()));
        projectInfoDTO.setStartTenderLeaderList(getContactorsByIds(p.getStartTenderLeaderIds()));

        if (StringUtils.isNotBlank(p.getContractInfoIds())) {
            List<Long> contractInfoIds = JSON.parseArray(p.getContractInfoIds(),Long.class);
            ContractInfoExample contractInfoExample = new ContractInfoExample();
            ContractInfoExample.Criteria contractInfoExampleCriteria = contractInfoExample.createCriteria();
            contractInfoExampleCriteria.andIdIn(contractInfoIds);
            List<ContractInfo> contractInfos = contractInfoMapper.selectByExample(contractInfoExample);

            projectInfoDTO.setContractInfoList(contractInfos);
        }
        return projectInfoDTO;
    }

    /**
     * 根据id集合获取不同类型的联系人
     * @param ids
     * @return
     */
    private List<Contactor> getContactorsByIds(String ids) {
        if (StringUtils.isBlank(ids)) {
            return new ArrayList<>();
        }
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

    private List<Long> saveContactorEditVO(List<Contactor> contactorList) {
        List<Long> contactorIds = new ArrayList<>();
        for (Contactor c : contactorList) {
            try {
                contactorService.insert(c);
                contactorIds.add(c.getId());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return  contactorIds;
    }

    @Override
    public int insert(ProjectInfoVO projectInfoVO) {
        // 保存联系人信息
        List<Contactor> customerContactorList = projectInfoVO.getCustomerContactorList();
        List<Long> customerContactorIds = saveContactorEditVO(customerContactorList);
        projectInfoVO.setCustomerContactorIds(JSON.toJSONString(customerContactorIds));

        List<Contactor> followerList = projectInfoVO.getFollowerList();
        List<Long> followerIds = saveContactorEditVO(followerList);
        projectInfoVO.setFollowerIds(JSON.toJSONString(followerIds));

        List<Contactor> regiContactorList = projectInfoVO.getRegiContactorList();
        List<Long> regiContactorIds = saveContactorEditVO(regiContactorList);
        projectInfoVO.setRegiContactorIds(JSON.toJSONString(regiContactorIds));

        List<Contactor> purTenderContactorList = projectInfoVO.getPurTenderContactorList();
        List<Long> purTenderContactorIds = saveContactorEditVO(purTenderContactorList);
        projectInfoVO.setPurTenderIds(JSON.toJSONString(purTenderContactorIds));

        List<Contactor> surveyUnitContactorList = projectInfoVO.getSurveyUnitContactorList();
        List<Long> surveyUnitContactorIds = saveContactorEditVO(surveyUnitContactorList);
        projectInfoVO.setSurveyUnitContactorIds(JSON.toJSONString(surveyUnitContactorIds));

        List<Contactor> surveyUnitLeaderList = projectInfoVO.getSurveyUnitLeaderList();
        List<Long> surveyUnitLeaderIds = saveContactorEditVO(surveyUnitLeaderList);
        projectInfoVO.setSurveyUnitLeaderIds(JSON.toJSONString(surveyUnitLeaderIds));

        List<Contactor> tenderPriceFileContactorList = projectInfoVO.getTenderPriceFileContactorList();
        List<Long> tenderPriceFileContactorIds = saveContactorEditVO(tenderPriceFileContactorList);
        projectInfoVO.setTenderPriceFileContactorIds(JSON.toJSONString(tenderPriceFileContactorIds));

        List<Contactor> tenderBookFileContactorList = projectInfoVO.getTenderBookFileContactorList();
        List<Long> tenderBookFileContactorIds = saveContactorEditVO(tenderBookFileContactorList);
        projectInfoVO.setTenderBookFileContactorIds(JSON.toJSONString(tenderBookFileContactorIds));

        List<Contactor> proveFileContactorList = projectInfoVO.getProveFileContactorList();
        List<Long> proveFileContactorIds = saveContactorEditVO(proveFileContactorList);
        projectInfoVO.setProveFileContactorIds(JSON.toJSONString(proveFileContactorIds));

        List<Contactor> startTenderLeaderList = projectInfoVO.getStartTenderLeaderList();
        List<Long> startTenderLeaderIds = saveContactorEditVO(startTenderLeaderList);
        projectInfoVO.setStartTenderLeaderIds(JSON.toJSONString(startTenderLeaderIds));

        // 保存合同信息
        List<ContractInfo> contractInfos = projectInfoVO.getContractInfoList();
        List<Long> contractInfoIds = new ArrayList<>();
        for (ContractInfo contractInfo : contractInfos) {
            try {
                contractInfoService.insert(contractInfo);
                contractInfoIds.add(contractInfo.getId());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        projectInfoVO.setContractInfoIds(JSON.toJSONString(contractInfoIds));
        // 保存projectInfo主表信息

        return projectInfoMapper.insert((ProjectInfoWithBLOBs) projectInfoVO);
    }

    @Override
    public int insertSelective(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ProjectInfoWithBLOBs record) {
        return projectInfoMapper.updateByPrimaryKeySelective(record);
    }

    private List<Contactor> getContactorsByParam(ProjectInfoVO projectInfoVO) {
        List<Contactor> contactors = new ArrayList<>();
        List<Contactor> customerContactorList = projectInfoVO.getCustomerContactorList();
        List<Contactor> followerList = projectInfoVO.getFollowerList();
        List<Contactor> regiContactorList = projectInfoVO.getRegiContactorList();
        List<Contactor> purTenderContactorList = projectInfoVO.getPurTenderContactorList();
        List<Contactor> surveyUnitContactorList = projectInfoVO.getSurveyUnitContactorList();
        List<Contactor> surveyUnitLeaderList = projectInfoVO.getSurveyUnitLeaderList();
        List<Contactor> tenderPriceFileContactorList = projectInfoVO.getTenderPriceFileContactorList();
        List<Contactor> tenderBookFileContactorList = projectInfoVO.getTenderBookFileContactorList();
        List<Contactor> proveFileContactorList = projectInfoVO.getProveFileContactorList();
        List<Contactor> startTenderLeaderList = projectInfoVO.getStartTenderLeaderList();
        contactors.addAll(customerContactorList);
        contactors.addAll(followerList);
        contactors.addAll(regiContactorList);
        contactors.addAll(purTenderContactorList);
        contactors.addAll(surveyUnitContactorList);
        contactors.addAll(surveyUnitLeaderList);
        contactors.addAll(tenderPriceFileContactorList);
        contactors.addAll(tenderBookFileContactorList);
        contactors.addAll(proveFileContactorList);
        contactors.addAll(startTenderLeaderList);
        return contactors;
    }
    @Override
    public int updateByPrimaryKey(ProjectInfoVO projectInfoVO) {
        List<Contactor> contactors = getContactorsByParam(projectInfoVO);
        for (Contactor c : contactors) {
            try {
                contactorService.updateByPrimaryKey(c);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        // 保存合同信息
        List<ContractInfo> contractInfos = projectInfoVO.getContractInfoList();
        for (ContractInfo contractInfo : contractInfos) {
            try {
                contractInfoService.updateByPrimaryKey(contractInfo);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return projectInfoMapper.updateByPrimaryKey(((ProjectInfoWithBLOBs)projectInfoVO));
    }
}
