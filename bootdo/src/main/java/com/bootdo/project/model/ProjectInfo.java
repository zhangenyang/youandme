package com.bootdo.project.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProjectInfo {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus == null ? null : projectStatus.trim();
    }

    public String getProjectYear() {
        return projectYear;
    }

    public void setProjectYear(String projectYear) {
        this.projectYear = projectYear == null ? null : projectYear.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getCustomerUnit() {
        return customerUnit;
    }

    public void setCustomerUnit(String customerUnit) {
        this.customerUnit = customerUnit == null ? null : customerUnit.trim();
    }

    public String getCustomerContactorIds() {
        return customerContactorIds;
    }

    public void setCustomerContactorIds(String customerContactorIds) {
        this.customerContactorIds = customerContactorIds == null ? null : customerContactorIds.trim();
    }

    public String getFollowerUnit() {
        return followerUnit;
    }

    public void setFollowerUnit(String followerUnit) {
        this.followerUnit = followerUnit == null ? null : followerUnit.trim();
    }

    public String getFollowerIds() {
        return followerIds;
    }

    public void setFollowerIds(String followerIds) {
        this.followerIds = followerIds == null ? null : followerIds.trim();
    }

    public String getProjectParticipateInfo() {
        return projectParticipateInfo;
    }

    public void setProjectParticipateInfo(String projectParticipateInfo) {
        this.projectParticipateInfo = projectParticipateInfo == null ? null : projectParticipateInfo.trim();
    }

    public String getSolutionFilePath() {
        return solutionFilePath;
    }

    public void setSolutionFilePath(String solutionFilePath) {
        this.solutionFilePath = solutionFilePath == null ? null : solutionFilePath.trim();
    }

    public BigDecimal getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(BigDecimal projectBudget) {
        this.projectBudget = projectBudget;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public Boolean getProjectNoticeType() {
        return projectNoticeType;
    }

    public void setProjectNoticeType(Boolean projectNoticeType) {
        this.projectNoticeType = projectNoticeType;
    }

    public Date getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(Date regiDate) {
        this.regiDate = regiDate;
    }

    public String getRegiPlace() {
        return regiPlace;
    }

    public void setRegiPlace(String regiPlace) {
        this.regiPlace = regiPlace == null ? null : regiPlace.trim();
    }

    public String getRegiContactorIds() {
        return regiContactorIds;
    }

    public void setRegiContactorIds(String regiContactorIds) {
        this.regiContactorIds = regiContactorIds == null ? null : regiContactorIds.trim();
    }

    public String getRegiReq() {
        return regiReq;
    }

    public void setRegiReq(String regiReq) {
        this.regiReq = regiReq == null ? null : regiReq.trim();
    }

    public String getPurTenderIds() {
        return purTenderIds;
    }

    public void setPurTenderIds(String purTenderIds) {
        this.purTenderIds = purTenderIds == null ? null : purTenderIds.trim();
    }

    public Date getPurTenderDate() {
        return purTenderDate;
    }

    public void setPurTenderDate(Date purTenderDate) {
        this.purTenderDate = purTenderDate;
    }

    public BigDecimal getPurTenderCost() {
        return purTenderCost;
    }

    public void setPurTenderCost(BigDecimal purTenderCost) {
        this.purTenderCost = purTenderCost;
    }

    public BigDecimal getPurTenderTravelExpense() {
        return purTenderTravelExpense;
    }

    public void setPurTenderTravelExpense(BigDecimal purTenderTravelExpense) {
        this.purTenderTravelExpense = purTenderTravelExpense;
    }

    public String getTenderFilePath() {
        return tenderFilePath;
    }

    public void setTenderFilePath(String tenderFilePath) {
        this.tenderFilePath = tenderFilePath == null ? null : tenderFilePath.trim();
    }

    public String getConfigFilePath() {
        return configFilePath;
    }

    public void setConfigFilePath(String configFilePath) {
        this.configFilePath = configFilePath == null ? null : configFilePath.trim();
    }

    public String getQualificationFilePath() {
        return qualificationFilePath;
    }

    public void setQualificationFilePath(String qualificationFilePath) {
        this.qualificationFilePath = qualificationFilePath == null ? null : qualificationFilePath.trim();
    }

    public String getBusinessTechnologyAssessmentFilePath() {
        return businessTechnologyAssessmentFilePath;
    }

    public void setBusinessTechnologyAssessmentFilePath(String businessTechnologyAssessmentFilePath) {
        this.businessTechnologyAssessmentFilePath = businessTechnologyAssessmentFilePath == null ? null : businessTechnologyAssessmentFilePath.trim();
    }

    public String getSurveyPlace() {
        return surveyPlace;
    }

    public void setSurveyPlace(String surveyPlace) {
        this.surveyPlace = surveyPlace == null ? null : surveyPlace.trim();
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public String getSurveyUnitContactorIds() {
        return surveyUnitContactorIds;
    }

    public void setSurveyUnitContactorIds(String surveyUnitContactorIds) {
        this.surveyUnitContactorIds = surveyUnitContactorIds == null ? null : surveyUnitContactorIds.trim();
    }

    public String getSurveyUnitLeaderIds() {
        return surveyUnitLeaderIds;
    }

    public void setSurveyUnitLeaderIds(String surveyUnitLeaderIds) {
        this.surveyUnitLeaderIds = surveyUnitLeaderIds == null ? null : surveyUnitLeaderIds.trim();
    }

    public Boolean getSurveyHasSample() {
        return surveyHasSample;
    }

    public void setSurveyHasSample(Boolean surveyHasSample) {
        this.surveyHasSample = surveyHasSample;
    }

    public String getSurveySampleDetail() {
        return surveySampleDetail;
    }

    public void setSurveySampleDetail(String surveySampleDetail) {
        this.surveySampleDetail = surveySampleDetail == null ? null : surveySampleDetail.trim();
    }

    public Boolean getSurveyTestSample() {
        return surveyTestSample;
    }

    public void setSurveyTestSample(Boolean surveyTestSample) {
        this.surveyTestSample = surveyTestSample;
    }

    public String getSurveyTestDetail() {
        return surveyTestDetail;
    }

    public void setSurveyTestDetail(String surveyTestDetail) {
        this.surveyTestDetail = surveyTestDetail == null ? null : surveyTestDetail.trim();
    }

    public BigDecimal getSurveyTravelExpense() {
        return surveyTravelExpense;
    }

    public void setSurveyTravelExpense(BigDecimal surveyTravelExpense) {
        this.surveyTravelExpense = surveyTravelExpense;
    }

    public BigDecimal getSurveySampleTransforExpense() {
        return surveySampleTransforExpense;
    }

    public void setSurveySampleTransforExpense(BigDecimal surveySampleTransforExpense) {
        this.surveySampleTransforExpense = surveySampleTransforExpense;
    }

    public String getTenderPriceFileContactorIds() {
        return tenderPriceFileContactorIds;
    }

    public void setTenderPriceFileContactorIds(String tenderPriceFileContactorIds) {
        this.tenderPriceFileContactorIds = tenderPriceFileContactorIds == null ? null : tenderPriceFileContactorIds.trim();
    }

    public String getTenderBookFileContactorIds() {
        return tenderBookFileContactorIds;
    }

    public void setTenderBookFileContactorIds(String tenderBookFileContactorIds) {
        this.tenderBookFileContactorIds = tenderBookFileContactorIds == null ? null : tenderBookFileContactorIds.trim();
    }

    public String getProveFileContactorIds() {
        return proveFileContactorIds;
    }

    public void setProveFileContactorIds(String proveFileContactorIds) {
        this.proveFileContactorIds = proveFileContactorIds == null ? null : proveFileContactorIds.trim();
    }

    public BigDecimal getPrintTenderCost() {
        return printTenderCost;
    }

    public void setPrintTenderCost(BigDecimal printTenderCost) {
        this.printTenderCost = printTenderCost;
    }

    public BigDecimal getTenderCarCost() {
        return tenderCarCost;
    }

    public void setTenderCarCost(BigDecimal tenderCarCost) {
        this.tenderCarCost = tenderCarCost;
    }

    public String getSubmitTenderFilePath() {
        return submitTenderFilePath;
    }

    public void setSubmitTenderFilePath(String submitTenderFilePath) {
        this.submitTenderFilePath = submitTenderFilePath == null ? null : submitTenderFilePath.trim();
    }

    public String getProveFilePath() {
        return proveFilePath;
    }

    public void setProveFilePath(String proveFilePath) {
        this.proveFilePath = proveFilePath == null ? null : proveFilePath.trim();
    }

    public String getPriceFilePath() {
        return priceFilePath;
    }

    public void setPriceFilePath(String priceFilePath) {
        this.priceFilePath = priceFilePath == null ? null : priceFilePath.trim();
    }

    public String getStartTenderPlace() {
        return startTenderPlace;
    }

    public void setStartTenderPlace(String startTenderPlace) {
        this.startTenderPlace = startTenderPlace == null ? null : startTenderPlace.trim();
    }

    public Date getStartTenderTime() {
        return startTenderTime;
    }

    public void setStartTenderTime(Date startTenderTime) {
        this.startTenderTime = startTenderTime;
    }

    public Boolean getStartTenderHasSample() {
        return startTenderHasSample;
    }

    public void setStartTenderHasSample(Boolean startTenderHasSample) {
        this.startTenderHasSample = startTenderHasSample;
    }

    public String getStartTenderSampleDetail() {
        return startTenderSampleDetail;
    }

    public void setStartTenderSampleDetail(String startTenderSampleDetail) {
        this.startTenderSampleDetail = startTenderSampleDetail == null ? null : startTenderSampleDetail.trim();
    }

    public Boolean getStartTenderTestSample() {
        return startTenderTestSample;
    }

    public void setStartTenderTestSample(Boolean startTenderTestSample) {
        this.startTenderTestSample = startTenderTestSample;
    }

    public String getStartTenderTestDetail() {
        return startTenderTestDetail;
    }

    public void setStartTenderTestDetail(String startTenderTestDetail) {
        this.startTenderTestDetail = startTenderTestDetail == null ? null : startTenderTestDetail.trim();
    }

    public String getStartTenderLeaderIds() {
        return startTenderLeaderIds;
    }

    public void setStartTenderLeaderIds(String startTenderLeaderIds) {
        this.startTenderLeaderIds = startTenderLeaderIds == null ? null : startTenderLeaderIds.trim();
    }

    public BigDecimal getStartTenderTravelExpense() {
        return startTenderTravelExpense;
    }

    public void setStartTenderTravelExpense(BigDecimal startTenderTravelExpense) {
        this.startTenderTravelExpense = startTenderTravelExpense;
    }

    public BigDecimal getStartTenderSampleTransforExpense() {
        return startTenderSampleTransforExpense;
    }

    public void setStartTenderSampleTransforExpense(BigDecimal startTenderSampleTransforExpense) {
        this.startTenderSampleTransforExpense = startTenderSampleTransforExpense;
    }

    public BigDecimal getStartTenderTotalExpense() {
        return startTenderTotalExpense;
    }

    public void setStartTenderTotalExpense(BigDecimal startTenderTotalExpense) {
        this.startTenderTotalExpense = startTenderTotalExpense;
    }

    public String getTenderPeopleName() {
        return tenderPeopleName;
    }

    public void setTenderPeopleName(String tenderPeopleName) {
        this.tenderPeopleName = tenderPeopleName == null ? null : tenderPeopleName.trim();
    }

    public String getTenderPeoplePhone() {
        return tenderPeoplePhone;
    }

    public void setTenderPeoplePhone(String tenderPeoplePhone) {
        this.tenderPeoplePhone = tenderPeoplePhone == null ? null : tenderPeoplePhone.trim();
    }

    public BigDecimal getTenderPeopleTrainCost() {
        return tenderPeopleTrainCost;
    }

    public void setTenderPeopleTrainCost(BigDecimal tenderPeopleTrainCost) {
        this.tenderPeopleTrainCost = tenderPeopleTrainCost;
    }

    public BigDecimal getTenderPeopleFlightCost() {
        return tenderPeopleFlightCost;
    }

    public void setTenderPeopleFlightCost(BigDecimal tenderPeopleFlightCost) {
        this.tenderPeopleFlightCost = tenderPeopleFlightCost;
    }

    public BigDecimal getTenderPeopleStayCost() {
        return tenderPeopleStayCost;
    }

    public void setTenderPeopleStayCost(BigDecimal tenderPeopleStayCost) {
        this.tenderPeopleStayCost = tenderPeopleStayCost;
    }

    public BigDecimal getTenderPeopleSupplyCost() {
        return tenderPeopleSupplyCost;
    }

    public void setTenderPeopleSupplyCost(BigDecimal tenderPeopleSupplyCost) {
        this.tenderPeopleSupplyCost = tenderPeopleSupplyCost;
    }

    public BigDecimal getTenderPeopleTaxiCost() {
        return tenderPeopleTaxiCost;
    }

    public void setTenderPeopleTaxiCost(BigDecimal tenderPeopleTaxiCost) {
        this.tenderPeopleTaxiCost = tenderPeopleTaxiCost;
    }

    public BigDecimal getTenderPeopleOtherCost() {
        return tenderPeopleOtherCost;
    }

    public void setTenderPeopleOtherCost(BigDecimal tenderPeopleOtherCost) {
        this.tenderPeopleOtherCost = tenderPeopleOtherCost;
    }

    public BigDecimal getTenderPeopleFileTransforCost() {
        return tenderPeopleFileTransforCost;
    }

    public void setTenderPeopleFileTransforCost(BigDecimal tenderPeopleFileTransforCost) {
        this.tenderPeopleFileTransforCost = tenderPeopleFileTransforCost;
    }

    public BigDecimal getTenderPeopleTotalCost() {
        return tenderPeopleTotalCost;
    }

    public void setTenderPeopleTotalCost(BigDecimal tenderPeopleTotalCost) {
        this.tenderPeopleTotalCost = tenderPeopleTotalCost;
    }

    public BigDecimal getTenderPayPrice() {
        return tenderPayPrice;
    }

    public void setTenderPayPrice(BigDecimal tenderPayPrice) {
        this.tenderPayPrice = tenderPayPrice;
    }

    public Boolean getTenderWin() {
        return tenderWin;
    }

    public void setTenderWin(Boolean tenderWin) {
        this.tenderWin = tenderWin;
    }

    public BigDecimal getTenderWinPrice() {
        return tenderWinPrice;
    }

    public void setTenderWinPrice(BigDecimal tenderWinPrice) {
        this.tenderWinPrice = tenderWinPrice;
    }

    public BigDecimal getTenderServiceRate() {
        return tenderServiceRate;
    }

    public void setTenderServiceRate(BigDecimal tenderServiceRate) {
        this.tenderServiceRate = tenderServiceRate;
    }

    public BigDecimal getTenderInterestRate() {
        return tenderInterestRate;
    }

    public void setTenderInterestRate(BigDecimal tenderInterestRate) {
        this.tenderInterestRate = tenderInterestRate;
    }

    public BigDecimal getTenderProjectIntegrateCost() {
        return tenderProjectIntegrateCost;
    }

    public void setTenderProjectIntegrateCost(BigDecimal tenderProjectIntegrateCost) {
        this.tenderProjectIntegrateCost = tenderProjectIntegrateCost;
    }

    public BigDecimal getIncomingRate() {
        return incomingRate;
    }

    public void setIncomingRate(BigDecimal incomingRate) {
        this.incomingRate = incomingRate;
    }

    public BigDecimal getIncomingCost() {
        return incomingCost;
    }

    public void setIncomingCost(BigDecimal incomingCost) {
        this.incomingCost = incomingCost;
    }

    public BigDecimal getProjectIntegrateTotalCost() {
        return projectIntegrateTotalCost;
    }

    public void setProjectIntegrateTotalCost(BigDecimal projectIntegrateTotalCost) {
        this.projectIntegrateTotalCost = projectIntegrateTotalCost;
    }

    public BigDecimal getUnitInterest() {
        return unitInterest;
    }

    public void setUnitInterest(BigDecimal unitInterest) {
        this.unitInterest = unitInterest;
    }

    public BigDecimal getCorIntegrateCost() {
        return corIntegrateCost;
    }

    public void setCorIntegrateCost(BigDecimal corIntegrateCost) {
        this.corIntegrateCost = corIntegrateCost;
    }

    public BigDecimal getCorOtherCost() {
        return corOtherCost;
    }

    public void setCorOtherCost(BigDecimal corOtherCost) {
        this.corOtherCost = corOtherCost;
    }

    public BigDecimal getCorTotalCost() {
        return corTotalCost;
    }

    public void setCorTotalCost(BigDecimal corTotalCost) {
        this.corTotalCost = corTotalCost;
    }

    public BigDecimal getCorCanUseCost() {
        return corCanUseCost;
    }

    public void setCorCanUseCost(BigDecimal corCanUseCost) {
        this.corCanUseCost = corCanUseCost;
    }

    public String getContractInfoIds() {
        return contractInfoIds;
    }

    public void setContractInfoIds(String contractInfoIds) {
        this.contractInfoIds = contractInfoIds == null ? null : contractInfoIds.trim();
    }

    public String getWarrantyPeriodStandard() {
        return warrantyPeriodStandard;
    }

    public void setWarrantyPeriodStandard(String warrantyPeriodStandard) {
        this.warrantyPeriodStandard = warrantyPeriodStandard == null ? null : warrantyPeriodStandard.trim();
    }

    public String getTenderWarrantyPeriod() {
        return tenderWarrantyPeriod;
    }

    public void setTenderWarrantyPeriod(String tenderWarrantyPeriod) {
        this.tenderWarrantyPeriod = tenderWarrantyPeriod == null ? null : tenderWarrantyPeriod.trim();
    }

    public BigDecimal getWarrantyPriceStandard() {
        return warrantyPriceStandard;
    }

    public void setWarrantyPriceStandard(BigDecimal warrantyPriceStandard) {
        this.warrantyPriceStandard = warrantyPriceStandard;
    }

    public BigDecimal getTenderWarrantyPrice() {
        return tenderWarrantyPrice;
    }

    public void setTenderWarrantyPrice(BigDecimal tenderWarrantyPrice) {
        this.tenderWarrantyPrice = tenderWarrantyPrice;
    }

    public BigDecimal getCanUseWithoutWarrantyPrice() {
        return canUseWithoutWarrantyPrice;
    }

    public void setCanUseWithoutWarrantyPrice(BigDecimal canUseWithoutWarrantyPrice) {
        this.canUseWithoutWarrantyPrice = canUseWithoutWarrantyPrice;
    }
}