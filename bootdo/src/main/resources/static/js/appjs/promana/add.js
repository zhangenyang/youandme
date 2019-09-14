$().ready(function() {
    validateRule();
});

$.validator.setDefaults({
    submitHandler : function() {
        // save();
    }
});
function getCheckedRoles() {
    var adIds = "";
    $("input:checkbox[name=role]:checked").each(function(i) {
        if (0 == i) {
            adIds = $(this).val();
        } else {
            adIds += ("," + $(this).val());
        }
    });
    return adIds;
}
function save() {
    $("#roleIds").val(getCheckedRoles());
    $.ajax({
        cache : true,
        type : "POST",
        url : "/sys/user/save",
        data : $('#signupForm').serialize(),// 你的formid
        async : false,
        error : function(request) {
            parent.layer.alert("Connection error");
        },
        success : function(data) {
            if (data.code == 0) {
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
function validateRule() {
    var icon = "<i class='fa fa-times-circle'></i> ";
    $("#signupForm").validate({
        rules : {
            name : {
                required : true
            },
            username : {
                required : true,
                minlength : 2,
                remote : {
                    url : "/sys/user/exit", // 后台处理程序
                    type : "post", // 数据发送方式
                    dataType : "json", // 接受数据格式
                    data : { // 要传递的数据
                        username : function() {
                            return $("#username").val();
                        }
                    }
                }
            },
            password : {
                required : true,
                minlength : 6
            },
            confirm_password : {
                required : true,
                minlength : 6,
                equalTo : "#password"
            },
            email : {
                required : true,
                email : true
            },
            topic : {
                required : "#newsletter:checked",
                minlength : 2
            },
            agree : "required"
        },
        messages : {

            name : {
                required : icon + "请输入姓名"
            },
            username : {
                required : icon + "请输入您的用户名",
                minlength : icon + "用户名必须两个字符以上",
                remote : icon + "用户名已经存在"
            },
            password : {
                required : icon + "请输入您的密码",
                minlength : icon + "密码必须6个字符以上"
            },
            confirm_password : {
                required : icon + "请再次输入密码",
                minlength : icon + "密码必须6个字符以上",
                equalTo : icon + "两次输入的密码不一致"
            },
            email : icon + "请输入您的E-mail",
        }
    })
}

var openDept = function(){
    layer.open({
        type:2,
        title:"选择部门",
        area : [ '300px', '450px' ],
        content:"/system/sysDept/treeView"
    })
}
function loadDept( deptId,deptName){
    $("#deptId").val(deptId);
    $("#deptName").val(deptName);
}

function uploadPartInfo(){

}
function uploadProjectNoticeFile(){

}
function uploadProjectNoticeImg(){

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

function addContractAction() {
    var table = document.getElementById("contractTable");
    var newTr = table.insertRow(addContractCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "contract_"+ addContractCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addContractCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"price"+addContractCount+"\"/></td>\n";

    addContractCount++;
}

function addStartTenderLeaderAction() {
    var table = document.getElementById("startTenderLeaderTable");
    var newTr = table.insertRow(addStartTenderLeaderCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "tenderPriceFileContactor_"+ addStartTenderLeaderCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addStartTenderLeaderCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addStartTenderLeaderCount+"\"/></td>\n";

    addStartTenderLeaderCount++;
}

function addTenderPriceFileContactorAction() {
    var table = document.getElementById("tenderPriceFileContactorTable");
    var newTr = table.insertRow(addTenderPriceFileContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "tenderPriceFileContactor_"+ addTenderPriceFileContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addTenderPriceFileContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addTenderPriceFileContactorCount+"\"/></td>\n";

    addTenderPriceFileContactorCount++;
}

function addTenderBookFileContactorAction() {
    var table = document.getElementById("tenderBookFileContactorTable");
    var newTr = table.insertRow(addTenderBookFileContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "tenderBookFileContactor_"+ addTenderBookFileContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addTenderBookFileContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addTenderBookFileContactorCount+"\"/></td>\n";

    addTenderBookFileContactorCount++;
}

function addProveFileContactorAction() {
    var table = document.getElementById("proveFileContactorTable");
    var newTr = table.insertRow(addProveFileContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "proveFileContactor_"+ addProveFileContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addProveFileContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addProveFileContactorCount+"\"/></td>\n";

    addProveFileContactorCount++;
}

function addSurveyUnitLeaderAction() {
    var table = document.getElementById("surveyUnitLeaderTable");
    var newTr = table.insertRow(addSurveyUnitLeaderCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "surveyUnitLeader_"+ addSurveyUnitLeaderCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addSurveyUnitLeaderCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addSurveyUnitLeaderCount+"\"/></td>\n";

    addSurveyUnitLeaderCount++;
}

function addSurveyUnitContactorAction() {
    var table = document.getElementById("surveyUnitContactorTable");
    var newTr = table.insertRow(addSurveyUnitContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "surveyUnitContactor_"+ addSurveyUnitContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addSurveyUnitContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addSurveyUnitContactorCount+"\"/></td>\n";

    addSurveyUnitContactorCount++;
}

function addContactorAction() {
    var table = document.getElementById("contactorTable");
    var newTr = table.insertRow(addContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "contactor_"+ addContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"title"+addContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"fixedPhone"+addContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addContactorCount+"\"/></td>\n";

    addContactorCount++;
}

function addFollowerAction() {
    var table = document.getElementById("followerTable");
    var newTr = table.insertRow(addFollowerCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "follower_"+ addFollowerCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addFollowerCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"title"+addFollowerCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"fixedPhone"+addFollowerCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addFollowerCount+"\"/></td>\n";

    addFollowerCount++;
}

function addRegiContactorAction() {
    var table = document.getElementById("regiContactorTable");
    var newTr = table.insertRow(addRegiContactorCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "regiContactor_"+ addRegiContactorCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addRegiContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"title"+addRegiContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"fixedPhone"+addRegiContactorCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addRegiContactorCount+"\"/></td>\n";

    addRegiContactorCount++;
}

function addPurTenderAction() {
    var table = document.getElementById("purTenderTable");
    var newTr = table.insertRow(addPurTenderCount + 1);//添加新行，trIndex就是要添加的位置
    newTr.id = "purTender_"+ addPurTenderCount;

    newTr.innerHTML = "                                        <td><input type=\"text\" id=\"name"+addPurTenderCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"title"+addPurTenderCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"fixedPhone"+addPurTenderCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"fax"+addPurTenderCount+"\"/></td>\n" +
        "                                        <td><input type=\"text\" id=\"phone"+addPurTenderCount+"\"/></td>\n";

    addPurTenderCount++;
}