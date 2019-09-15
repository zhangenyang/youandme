package com.bootdo.project.model.dto;

import com.bootdo.project.model.Contactor;
import com.bootdo.project.model.ContractInfo;
import com.bootdo.project.model.ProjectInfoWithBLOBs;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auth Daniel
 * @Description 项目信息的返回实体类
 * */
@Data
public class ProjectInfoDTO {

    public ProjectInfoDTO(ProjectInfoWithBLOBs projectInfoWithBLOBs) {
        this.other = projectInfoWithBLOBs.getOther();
        this.projectNoticeValue = projectInfoWithBLOBs.getProjectNoticeValue();
        this.id = projectInfoWithBLOBs.getId();
        this.projectStatus = projectInfoWithBLOBs.getProjectStatus();
        this.projectCode = projectInfoWithBLOBs.getProjectCode();
        this.projectName = projectInfoWithBLOBs.getProjectName();
        this.projectYear = projectInfoWithBLOBs.getProjectYear();
        this.customerUnit = projectInfoWithBLOBs.getCustomerUnit();
        this.customerContactorIds = projectInfoWithBLOBs.getCustomerContactorIds();
        this.followerUnit = projectInfoWithBLOBs.getFollowerUnit();
        this.followerIds = projectInfoWithBLOBs.getFollowerIds();
        this.projectParticipateInfo = projectInfoWithBLOBs.getProjectParticipateInfo();
        this.solutionFilePath = projectInfoWithBLOBs.getSolutionFilePath();
        this.projectBudget = projectInfoWithBLOBs.getProjectBudget();
        this.projectNoticeType = projectInfoWithBLOBs.getProjectNoticeType();
        this.regiDate = projectInfoWithBLOBs.getRegiDate();
        this.regiPlace = projectInfoWithBLOBs.getRegiPlace();
        this.regiContactorIds = projectInfoWithBLOBs.getRegiContactorIds();
        this.regiReq = projectInfoWithBLOBs.getRegiReq();
        this.purTenderIds = projectInfoWithBLOBs.getPurTenderIds();
        this.purTenderDate = projectInfoWithBLOBs.getPurTenderDate();
        this.purTenderCost = projectInfoWithBLOBs.getPurTenderCost();
        this.purTenderTravelExpense = projectInfoWithBLOBs.getPurTenderTravelExpense();
        this.tenderFilePath = projectInfoWithBLOBs.getTenderFilePath();
        this.configFilePath = projectInfoWithBLOBs.getConfigFilePath();
        this.qualificationFilePath = projectInfoWithBLOBs.getQualificationFilePath();
        this.businessTechnologyAssessmentFilePath = projectInfoWithBLOBs.getBusinessTechnologyAssessmentFilePath();
        this.surveyPlace = projectInfoWithBLOBs.getSurveyPlace();
        this.surveyDate = projectInfoWithBLOBs.getSurveyDate();
        this.surveyUnitContactorIds = projectInfoWithBLOBs.getSurveyUnitContactorIds();
        this.surveyUnitLeaderIds= projectInfoWithBLOBs.getSurveyUnitLeaderIds();
        this.surveyHasSample= projectInfoWithBLOBs.getSurveyHasSample();
        this.surveySampleDetail= projectInfoWithBLOBs.getSurveySampleDetail();
        this.surveyTestSample= projectInfoWithBLOBs.getSurveyTestSample();
        this.surveyTestDetail= projectInfoWithBLOBs.getSurveyTestDetail();
        this.surveyTravelExpense= projectInfoWithBLOBs.getSurveyTravelExpense();
        this.surveySampleTransforExpense= projectInfoWithBLOBs.getSurveySampleTransforExpense();
        this.tenderPriceFileContactorIds= projectInfoWithBLOBs.getTenderPriceFileContactorIds();
        this.tenderBookFileContactorIds= projectInfoWithBLOBs.getTenderBookFileContactorIds();
        this.proveFileContactorIds= projectInfoWithBLOBs.getProveFileContactorIds();
        this.printTenderCost= projectInfoWithBLOBs.getPrintTenderCost();
        this.tenderCarCost= projectInfoWithBLOBs.getTenderCarCost();
        this.submitTenderFilePath= projectInfoWithBLOBs.getSubmitTenderFilePath();
        this.proveFilePath= projectInfoWithBLOBs.getProveFilePath();
        this.priceFilePath= projectInfoWithBLOBs.getPriceFilePath();
        this.startTenderPlace= projectInfoWithBLOBs.getStartTenderPlace();
        this.startTenderTime= projectInfoWithBLOBs.getStartTenderTime();
        this.startTenderHasSample= projectInfoWithBLOBs.getStartTenderHasSample();
        this.startTenderSampleDetail= projectInfoWithBLOBs.getStartTenderSampleDetail();
        this.startTenderTestSample= projectInfoWithBLOBs.getStartTenderTestSample();
        this.startTenderTestDetail= projectInfoWithBLOBs.getStartTenderTestDetail();
        this.startTenderLeaderIds= projectInfoWithBLOBs.getStartTenderLeaderIds();
        this.startTenderTravelExpense= projectInfoWithBLOBs.getStartTenderTravelExpense();
        this.startTenderSampleTransforExpense= projectInfoWithBLOBs.getStartTenderSampleTransforExpense();
        this.startTenderTotalExpense= projectInfoWithBLOBs.getStartTenderTotalExpense();
        this.tenderPeopleName= projectInfoWithBLOBs.getTenderPeopleName();
        this.tenderPeoplePhone= projectInfoWithBLOBs.getTenderPeoplePhone();
        this.tenderPeopleTrainCost= projectInfoWithBLOBs.getTenderPeopleTrainCost();
        this.tenderPeopleFlightCost= projectInfoWithBLOBs.getTenderPeopleFlightCost();
        this.tenderPeopleStayCost= projectInfoWithBLOBs.getTenderPeopleStayCost();
        this.tenderPeopleSupplyCost= projectInfoWithBLOBs.getTenderPeopleSupplyCost();
        this.tenderPeopleTaxiCost= projectInfoWithBLOBs.getTenderPeopleTaxiCost();
        this.tenderPeopleOtherCost= projectInfoWithBLOBs.getTenderPeopleOtherCost();
        this.tenderPeopleFileTransforCost= projectInfoWithBLOBs.getTenderPeopleFileTransforCost();
        this.tenderPeopleTotalCost= projectInfoWithBLOBs.getTenderPeopleTotalCost();
        this.tenderPayPrice= projectInfoWithBLOBs.getTenderPayPrice();
        this.tenderWin= projectInfoWithBLOBs.getTenderWin();
        this.tenderWinPrice= projectInfoWithBLOBs.getTenderWinPrice();
        this.tenderServiceRate= projectInfoWithBLOBs.getTenderServiceRate();
        this.tenderInterestRate= projectInfoWithBLOBs.getTenderInterestRate();
        this.tenderProjectIntegrateCost= projectInfoWithBLOBs.getTenderProjectIntegrateCost();
        this.incomingRate= projectInfoWithBLOBs.getIncomingRate();
        this.incomingCost= projectInfoWithBLOBs.getIncomingCost();
        this.projectIntegrateTotalCost= projectInfoWithBLOBs.getProjectIntegrateTotalCost();
        this.unitInterest= projectInfoWithBLOBs.getUnitInterest();
        this.corIntegrateCost= projectInfoWithBLOBs.getCorIntegrateCost();
        this.corOtherCost= projectInfoWithBLOBs.getCorOtherCost();
        this.corTotalCost= projectInfoWithBLOBs.getCorTotalCost();
        this.corCanUseCost= projectInfoWithBLOBs.getCorCanUseCost();
        this.contractInfoIds= projectInfoWithBLOBs.getContractInfoIds();
        this.warrantyPeriodStandard= projectInfoWithBLOBs.getWarrantyPeriodStandard();
        this.tenderWarrantyPeriod= projectInfoWithBLOBs.getTenderWarrantyPeriod();
        this.warrantyPriceStandard= projectInfoWithBLOBs.getWarrantyPriceStandard();
        this.tenderWarrantyPrice= projectInfoWithBLOBs.getTenderWarrantyPrice();
        this.canUseWithoutWarrantyPrice= projectInfoWithBLOBs.getCanUseWithoutWarrantyPrice();
    }

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


    private String projectNoticeValue;

    private String other;

    private Long id;

    private String projectStatus;

    private String projectYear;

    private String projectName;

    private String customerUnit;

    private String customerContactorIds;

    private String followerUnit;

    private String followerIds;

    private String projectParticipateInfo;

    private String solutionFilePath;

    private BigDecimal projectBudget;

    private String projectCode;

    private Boolean projectNoticeType;

    private Date regiDate;

    private String regiPlace;

    private String regiContactorIds;

    private String regiReq;

    private String purTenderIds;

    private Date purTenderDate;

    private BigDecimal purTenderCost;

    private BigDecimal purTenderTravelExpense;

    private String tenderFilePath;

    private String configFilePath;

    private String qualificationFilePath;

    private String businessTechnologyAssessmentFilePath;

    private String surveyPlace;

    private Date surveyDate;

    private String surveyUnitContactorIds;

    private String surveyUnitLeaderIds;

    private Boolean surveyHasSample;

    private String surveySampleDetail;

    private Boolean surveyTestSample;

    private String surveyTestDetail;

    private BigDecimal surveyTravelExpense;

    private BigDecimal surveySampleTransforExpense;

    private String tenderPriceFileContactorIds;

    private String tenderBookFileContactorIds;

    private String proveFileContactorIds;

    private BigDecimal printTenderCost;

    private BigDecimal tenderCarCost;

    private String submitTenderFilePath;

    private String proveFilePath;

    private String priceFilePath;

    private String startTenderPlace;

    private Date startTenderTime;

    private Boolean startTenderHasSample;

    private String startTenderSampleDetail;

    private Boolean startTenderTestSample;

    private String startTenderTestDetail;

    private String startTenderLeaderIds;

    private BigDecimal startTenderTravelExpense;

    private BigDecimal startTenderSampleTransforExpense;

    private BigDecimal startTenderTotalExpense;

    private String tenderPeopleName;

    private String tenderPeoplePhone;

    private BigDecimal tenderPeopleTrainCost;

    private BigDecimal tenderPeopleFlightCost;

    private BigDecimal tenderPeopleStayCost;

    private BigDecimal tenderPeopleSupplyCost;

    private BigDecimal tenderPeopleTaxiCost;

    private BigDecimal tenderPeopleOtherCost;

    private BigDecimal tenderPeopleFileTransforCost;

    private BigDecimal tenderPeopleTotalCost;

    private BigDecimal tenderPayPrice;

    private Boolean tenderWin;

    private BigDecimal tenderWinPrice;

    private BigDecimal tenderServiceRate;

    private BigDecimal tenderInterestRate;

    private BigDecimal tenderProjectIntegrateCost;

    private BigDecimal incomingRate;

    private BigDecimal incomingCost;

    private BigDecimal projectIntegrateTotalCost;

    private BigDecimal unitInterest;

    private BigDecimal corIntegrateCost;

    private BigDecimal corOtherCost;

    private BigDecimal corTotalCost;

    private BigDecimal corCanUseCost;

    private String contractInfoIds;

    private String warrantyPeriodStandard;

    private String tenderWarrantyPeriod;

    private BigDecimal warrantyPriceStandard;

    private BigDecimal tenderWarrantyPrice;

    private BigDecimal canUseWithoutWarrantyPrice;
}
