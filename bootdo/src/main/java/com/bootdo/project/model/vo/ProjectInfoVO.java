package com.bootdo.project.model.vo;

import com.bootdo.project.model.Contactor;
import com.bootdo.project.model.ContractInfo;
import com.bootdo.project.model.ProjectInfoWithBLOBs;
import lombok.Data;

import java.util.List;

/**
 * @Auth Daniel
 * @Description 新增项目的入参
 * */
@Data
public class ProjectInfoVO extends ProjectInfoWithBLOBs {
    /**
     *  用户单位联系人列表
     * */
    private List<Contactor> customerContactorList;
    /**
     *  跟进人列表
     * */
    private List<Contactor> followerList;
    /**
     *  招标机构联系人列表
     * */
    private List<Contactor> regiContactorList;
    /**
     *  购买标书联系人列表
     * */
    private List<Contactor> purTenderContactorList;
    /**
     *  踏勘单位联系人列表
     * */
    private List<Contactor> surveyUnitContactorList;
    /**
     *  踏勘负责人列表
     * */
    private List<Contactor> surveyUnitLeaderList;
    /**
     *  价格文件负责人列表
     * */
    private List<Contactor> tenderPriceFileContactorList;
    /**
     *  投标书负责人列表
     * */
    private List<Contactor> tenderBookFileContactorList;
    /**
     *  资格证明文件负责人列表
     * */
    private List<Contactor> proveFileContactorList;
    /**
     *  开标负责人列表
     * */
    private List<Contactor> startTenderLeaderList;
    /**
     *  合同信息列表
     * */
    private List<ContractInfo> contractInfoList;
}
