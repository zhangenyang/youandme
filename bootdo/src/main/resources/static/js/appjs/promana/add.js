$().ready(function() {
    validateRule();
});

$.validator.setDefaults({
    submitHandler : function() {
        save();
    }
});

function calcLogic(){
    // 中标价
    var tenderWinPrice = document.getElementById("tenderWinPrice").value;

    // 计算 中标服务费
    var tenderServiceRate = document.getElementById("tenderServiceRate").value;
    var tenderServiceRateCost;
    if(tenderServiceRate != null && tenderServiceRate !== '' && tenderServiceRate !== undefined){
        if(tenderServiceRate.indexOf("%") !== -1){
            tenderServiceRateCost = parseFloat(tenderWinPrice) * (parseFloat(tenderServiceRate.replace("%",""))/100);
            document.getElementById("tenderServiceRateCost").value = parseFloat(tenderServiceRateCost).toFixed(3);
        }
    }

    // 计算 毛利
    var tenderInterestRate = document.getElementById("tenderInterestRate").value;
    var tenderInterestRateCost = null;

    // 计算 项目协调费用（万元）
    var tenderProjectIntegrateCost = null;
    if(tenderInterestRate != null && tenderInterestRate !== '' && tenderInterestRate !== undefined){
        if(tenderInterestRate.indexOf("%") !== -1){
            tenderInterestRateCost = parseFloat(tenderWinPrice) * (parseFloat(tenderInterestRate.replace("%",""))/100);
            document.getElementById("tenderInterestRateCost").value = parseFloat(tenderInterestRateCost).toFixed(3);
            tenderProjectIntegrateCost = parseFloat(tenderWinPrice) * 0.1 * (parseFloat(tenderInterestRate.replace("%",""))/100);
            document.getElementById("tenderProjectIntegrateCost").value = parseFloat(tenderProjectIntegrateCost).toFixed(3);
        }
    }

    // 计算 提成（增量毛利）（元）
    var incomingCost = null;

    var incomingRate = document.getElementById("incomingRate").value;
    var tenderInterestRateLast = document.getElementById("tenderInterestRateLast").value;
    if((incomingRate != null && incomingRate !== '' && incomingRate !== undefined) &&
        (tenderInterestRateLast != null && tenderInterestRateLast !== '' && tenderInterestRateLast !== undefined)){
        if(tenderInterestRate.indexOf("%") !== -1 && tenderInterestRateLast.indexOf("%") !== -1 && incomingRate.indexOf("%") !== -1){
            incomingCost = parseFloat(tenderWinPrice) * (parseFloat(tenderInterestRate.replace("%",""))/100
                - parseFloat(tenderInterestRateLast.replace("%",""))/100) * (parseFloat(incomingRate.replace("%",""))/100);
            document.getElementById("incomingCost").value = parseFloat(incomingCost).toFixed(3);
        }
    }

    // 计算 项目协调总费用（元）
    var projectIntegrateTotalCost = null;
    if(tenderProjectIntegrateCost != null && incomingCost != null){
        projectIntegrateTotalCost = parseFloat(tenderProjectIntegrateCost) + parseFloat(incomingCost);
        document.getElementById("projectIntegrateTotalCost").value = parseFloat(projectIntegrateTotalCost).toFixed(3);
    }

    // 计算 事业部利润（万元）
    var unitInterest = null;
    if(tenderInterestRateCost != null && projectIntegrateTotalCost != null){
        unitInterest = parseFloat(tenderInterestRateCost) - parseFloat(projectIntegrateTotalCost);
        document.getElementById("unitInterest").value = parseFloat(unitInterest).toFixed(3);
    }

    // 计算 合作方可支配费用（万元）
    var corCanUseCost = null;
    var corTotalCost = document.getElementById("corTotalCost").value;
    if(corTotalCost != null && corTotalCost !== '' && corTotalCost !== undefined){
        corCanUseCost = parseFloat(tenderWinPrice) - parseFloat(corTotalCost);
        document.getElementById("corCanUseCost").value = parseFloat(corCanUseCost).toFixed(3);
    }

    // 计算 经费（万元）
    var tenderWarrantyPrice = null;
    var warrantyPriceStandard = document.getElementById("warrantyPriceStandard").value;
    if(warrantyPriceStandard != null && warrantyPriceStandard !== '' && warrantyPriceStandard !== undefined){
        if(warrantyPriceStandard.indexOf("%") !== -1){
            tenderWarrantyPrice = parseFloat(tenderWinPrice) * (parseFloat(warrantyPriceStandard.replace("%",""))/100);
            document.getElementById("tenderWarrantyPrice").value = parseFloat(tenderWarrantyPrice).toFixed(3);
        }
    }

    // 计算 合作方去除质保金后可支配费用
    var canUseWithoutWarrantyPrice = null;
    if(corCanUseCost != null && tenderWarrantyPrice != null){
        canUseWithoutWarrantyPrice = parseFloat(corCanUseCost) - parseFloat(tenderWarrantyPrice);
        document.getElementById("canUseWithoutWarrantyPrice").value = parseFloat(canUseWithoutWarrantyPrice).toFixed(3);
    }

}

// 用户单位联系人
var addContactorCount = 0;
// 跟进人
var addFollowerCount = 0;
// 招标机构联系人
var addRegiContactorCount = 0;
// 购买标书情况联系人
var addPurTenderCount = 0;
// 踏勘单位联系人
var addSurveyUnitContactorCount = 0;
// 踏勘负责人
var addSurveyUnitLeaderCount = 0;
// 价格文件负责人
var addTenderPriceFileContactorCount = 0;
// 投标书负责人
var addTenderBookFileContactorCount = 0;
// 资格证明文件负责人
var addProveFileContactorCount = 0;
// 开标是否携带样和测试 负责人
var addStartTenderLeaderCount = 0;

// 合同信息
var addContractCount = 0;

function validateRule() {
    var icon = "<i class='fa fa-times-circle'></i> ";
    $("#signupForm").validate({
        rules : {
            projectYear : "required",
            projectName : "required",
            customerUnit : "required",
            followerUnit : "required",
            projectCode : "required",
            projectNoticePath: "required"
        },
        messages : {
            projectYear : {
                required : icon + "请输入年度"
            },
            projectName : {
                required : icon + "请输入项目名称"
            },
            customerUnit : {
                required : icon + "请输入用户单位"
            },
            followerUnit : {
                required : icon + "请输入跟进单位"
            },
            projectCode : {
                required : icon + "请输入项目编号"
            },
            projectNoticePath : {
                required : icon + "请输入项目公告链接地址"
            }
        }
    })
}

function uploadPartInfo(){

}
function uploadProjectNoticeFile(){

}
function uploadProjectNoticeImg(){

}

function addContractAction() {
    var table = document.getElementById("contractTable");
    var newTr = table.insertRow(addContractCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "contract_"+ addContractCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"contract_name"+addContractCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" step=\"0.001\" id=\"contract_price"+addContractCount+"\"/></td>\n";

    addContractCount++;
}

function addStartTenderLeaderAction() {
    var table = document.getElementById("startTenderLeaderTable");
    var newTr = table.insertRow(addStartTenderLeaderCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "startTenderLeader_"+ addStartTenderLeaderCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"startTenderLeader_name"+addStartTenderLeaderCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"startTenderLeader_phone"+addStartTenderLeaderCount+"\"/></td>\n";

    addStartTenderLeaderCount++;
}

function addTenderPriceFileContactorAction() {
    var table = document.getElementById("tenderPriceFileContactorTable");
    var newTr = table.insertRow(addTenderPriceFileContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "tenderPriceFileContactor_"+ addTenderPriceFileContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"tenderPriceFileContactor_name"+addTenderPriceFileContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"tenderPriceFileContactor_phone"+addTenderPriceFileContactorCount+"\"/></td>\n";

    addTenderPriceFileContactorCount++;
}

function addTenderBookFileContactorAction() {
    var table = document.getElementById("tenderBookFileContactorTable");
    var newTr = table.insertRow(addTenderBookFileContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "tenderBookFileContactor_"+ addTenderBookFileContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"tenderBookFileContactor_name"+addTenderBookFileContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"tenderBookFileContactor_phone"+addTenderBookFileContactorCount+"\"/></td>\n";

    addTenderBookFileContactorCount++;
}

function addProveFileContactorAction() {
    var table = document.getElementById("proveFileContactorTable");
    var newTr = table.insertRow(addProveFileContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "proveFileContactor_"+ addProveFileContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"proveFileContactor_name"+addProveFileContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"proveFileContactor_phone"+addProveFileContactorCount+"\"/></td>\n";

    addProveFileContactorCount++;
}

function addSurveyUnitLeaderAction() {
    var table = document.getElementById("surveyUnitLeaderTable");
    var newTr = table.insertRow(addSurveyUnitLeaderCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "surveyUnitLeader_"+ addSurveyUnitLeaderCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"surveyUnitLeader_name"+addSurveyUnitLeaderCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"surveyUnitLeader_phone"+addSurveyUnitLeaderCount+"\"/></td>\n";

    addSurveyUnitLeaderCount++;
}

function addSurveyUnitContactorAction() {
    var table = document.getElementById("surveyUnitContactorTable");
    var newTr = table.insertRow(addSurveyUnitContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "surveyUnitContactor_"+ addSurveyUnitContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"surveyUnitContactor_name"+addSurveyUnitContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"surveyUnitContactor_phone"+addSurveyUnitContactorCount+"\"/></td>\n";

    addSurveyUnitContactorCount++;
}

function addContactorAction() {
    var table = document.getElementById("contactorTable");
    var newTr = table.insertRow(addContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "contactor_"+ addContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"contactor_name"+addContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"contactor_title"+addContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"contactor_fixedPhone"+addContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"contactor_phone"+addContactorCount+"\"/></td>\n";

    addContactorCount++;
}

function addFollowerAction() {
    var table = document.getElementById("followerTable");
    var newTr = table.insertRow(addFollowerCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "follower_"+ addFollowerCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"follower_name"+addFollowerCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"follower_title"+addFollowerCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"follower_fixedPhone"+addFollowerCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"follower_phone"+addFollowerCount+"\"/></td>\n";

    addFollowerCount++;
}

function addRegiContactorAction() {
    var table = document.getElementById("regiContactorTable");
    var newTr = table.insertRow(addRegiContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "regiContactor_"+ addRegiContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"regiContactor_name"+addRegiContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"regiContactor_title"+addRegiContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"regiContactor_fixedPhone"+addRegiContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"regiContactor_phone"+addRegiContactorCount+"\"/></td>\n";

    addRegiContactorCount++;
}

function addPurTenderAction() {
    var table = document.getElementById("purTenderTable");
    var newTr = table.insertRow(addPurTenderCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "purTender_"+ addPurTenderCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"purTender_name"+addPurTenderCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"purTender_title"+addPurTenderCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"purTender_fixedPhone"+addPurTenderCount+"\"/></td>\n" +
        "                                        <td><input type=\"number\" id=\"purTender_phone"+addPurTenderCount+"\"/></td>\n";

    addPurTenderCount++;
}

function clickSurveyHasSample(result){
    document.getElementById("surveyHasSample").value = result;
}

function clickSurveyTestSample(result){
    document.getElementById("surveyTestSample").value = result;
}

function clickStartTenderHasSample(result){
    document.getElementById("startTenderHasSample").value = result;
}

function clickStartTenderTestSample(result){
    document.getElementById("startTenderTestSample").value = result;
}

function clickTenderWin(result){
    document.getElementById("tenderWin").value = result;
}

function save() {
    var signupForm = $('#signupForm').serializeArray();
    var data = {};
    $.each(signupForm,function(i,v){
        data[v.name] = v.value;
    });
    // 获取各种联系人的信息并组装

    // 用户单位联系人
    var list = [];
    var one={};
    var i;
    for(i=0; i< addContactorCount ; i++){
        one["name"] = document.getElementById("contactor_name"+i).value;
        one["title"] = document.getElementById("contactor_title"+i).value;
        one["fixedPhone"] = document.getElementById("contactor_fixedPhone"+i).value;
        one["phone"] = document.getElementById("contactor_phone"+i).value;
        list[i] = one;
    }
    data["customerContactorList"] = list;

    // 跟进人
    list = [];
    one = {};
    for(i=0; i< addFollowerCount ; i++){
        one["name"] = document.getElementById("follower_name"+i).value;
        one["title"] = document.getElementById("follower_title"+i).value;
        one["fixedPhone"] = document.getElementById("follower_fixedPhone"+i).value;
        one["phone"] = document.getElementById("follower_phone"+i).value;
        list[i] = one;
    }
    data["followerList"] = list;

    // 招标机构联系人
    list = [];
    one = {};
    for(i=0; i< addRegiContactorCount ; i++){
        one["name"] = document.getElementById("regiContactor_name"+i).value;
        one["title"] = document.getElementById("regiContactor_title"+i).value;
        one["fixedPhone"] = document.getElementById("regiContactor_fixedPhone"+i).value;
        one["phone"] = document.getElementById("regiContactor_phone"+i).value;
        list[i] = one;
    }
    data["regiContactorList"] = list;

    // 购买标书情况联系人
    list = [];
    one = {};
    for(i=0; i< addPurTenderCount ; i++){
        one["name"] = document.getElementById("purTender_name"+i).value;
        one["title"] = document.getElementById("purTender_title"+i).value;
        one["fixedPhone"] = document.getElementById("purTender_fixedPhone"+i).value;
        one["phone"] = document.getElementById("purTender_phone"+i).value;
        list[i] = one;
    }
    data["purTenderContactorList"] = list;

    // 踏勘单位联系人
    list = [];
    one = {};
    for(i=0; i< addSurveyUnitContactorCount ; i++){
        one["name"] = document.getElementById("surveyUnitContactor_name"+i).value;
        one["phone"] = document.getElementById("surveyUnitContactor_phone"+i).value;
        list[i] = one;
    }
    data["surveyUnitContactorList"] = list;

    // 踏勘负责人列表
    list = [];
    one = {};
    for(i=0; i< addSurveyUnitLeaderCount ; i++){
        one["name"] = document.getElementById("surveyUnitLeader_name"+i).value;
        one["phone"] = document.getElementById("surveyUnitLeader_phone"+i).value;
        list[i] = one;
    }
    data["surveyUnitLeaderList"] = list;

    // 价格文件负责人列表
    list = [];
    one = {};
    for(i=0; i< addTenderPriceFileContactorCount ; i++){
        one["name"] = document.getElementById("tenderPriceFileContactor_name"+i).value;
        one["phone"] = document.getElementById("tenderPriceFileContactor_phone"+i).value;
        list[i] = one;
    }
    data["tenderPriceFileContactorList"] = list;

    // 投标书负责人列表
    list = [];
    one = {};
    for(i=0; i< addTenderBookFileContactorCount ; i++){
        one["name"] = document.getElementById("tenderBookFileContactor_name"+i).value;
        one["phone"] = document.getElementById("tenderBookFileContactor_phone"+i).value;
        list[i] = one;
    }
    data["tenderBookFileContactorList"] = list;

    // 资格证明文件负责人列表
    list = [];
    one = {};
    for(i=0; i< addProveFileContactorCount ; i++){
        one["name"] = document.getElementById("proveFileContactor_name"+i).value;
        one["phone"] = document.getElementById("proveFileContactor_phone"+i).value;
        list[i] = one;
    }
    data["proveFileContactorList"] = list;

    // 开标负责人列表
    list = [];
    one = {};
    for(i=0; i< addStartTenderLeaderCount ; i++){
        one["name"] = document.getElementById("startTenderLeader_name"+i).value;
        one["phone"] = document.getElementById("startTenderLeader_phone"+i).value;
        list[i] = one;
    }
    data["startTenderLeaderList"] = list;

    // 合同信息列表
    list = [];
    one = {};
    for(i=0; i< addContractCount ; i++){
        one["name"] = document.getElementById("contract_name"+i).value;
        one["price"] = document.getElementById("contract_price"+i).value;
        list[i] = one;
    }
    data["contractInfoList"] = list;

    data["surveyHasSample"] = document.getElementById("surveyHasSample").value;

    data["surveyTestSample"] = document.getElementById("surveyTestSample").value;

    data["startTenderHasSample"] = document.getElementById("startTenderHasSample").value;

    data["startTenderTestSample"] = document.getElementById("startTenderTestSample").value;

    data["tenderWin"] = document.getElementById("tenderWin").value;

    $.ajax({
        dataType: 'json',
        contentType: 'application/json',
        cache : true,
        type : "POST",
        url : "/project/save",
        data : JSON.stringify(data),
        async : false,
        error : function(request) {
            parent.layer.alert("Connection error");
        },
        success : function(data) {
            if (data.code === 0) {
                parent.layer.msg("操作成功");
                parent.reLoad();
                var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
                parent.layer.close(index);

            } else {
                parent.layer.alert(data.msg)
            }

        }
    });

}