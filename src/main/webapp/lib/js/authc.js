
$(function () {
    // if (sessionStorage.getItem("role")==3){
    //     $('#pro').show();
    // }
   var roleId = sessionStorage.getItem("roleId");

   if (roleId==1){
       $('#emp').show();
       $('#proSpeedManage').show();
       $('#proFeeManage').show();
       $('#department').show();
       $('#proAll').show();
       $('#addDep').show();
       $('#noAgree').show();
       $('#notice').show();
   } else if (roleId==2){
       $('#emp').show();
       $('#proAll').show();
       $('#noAgree').show();
       $('#notice').show();
       $('#proFeeManage').show();
   } else if (roleId==3){
       $('#task').show();
       $('#addPro').show();
       $('#proFeeManage').show();
       $('#proAll').show();
       $('#pro').show();
   }
})