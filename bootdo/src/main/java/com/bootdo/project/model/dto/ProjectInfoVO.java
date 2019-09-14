package com.bootdo.project.model.dto;

import com.bootdo.project.model.Contactor;
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
public class ProjectInfoVO extends ProjectInfoWithBLOBs {
    public ProjectInfoVO(ProjectInfoWithBLOBs projectInfoWithBLOBs) {

    }

    /**
     *  用户联系人列表
     * */
    private List<Contactor> contactorList;

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
