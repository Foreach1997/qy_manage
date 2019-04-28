
$(function () {
    // if (sessionStorage.getItem("role")==3){
    //     $('#pro').show();
    // }
   var roleId = sessionStorage.getItem("roleId");
   debugger
   if (roleId==1){
       $('#emp').show();
       $('#proSpeedManage').show();
       $('#proFeeManage').show();
       $('#department').show();
       $('#proAll').show();
       $('#addDep').show();
       $('#noAgree').show();
   } else if (roleId==2){
       $('#emp').show();
       $('#proAll').show();
       $('#noAgree').show();
   } else if (roleId==3){
       $('#task').show();
       $('#addPro').show();
       $('#proAll').show();
       $('#pro').show();
   }
})