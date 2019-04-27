/**
 * 测试
 */
var remoteUrl = "";
//var directory = "../../../";
var directory = "http://localhost:8081/qy_manage_war_exploded/";
/**
 * 获取Url
 * @param {Object} name
 */
function getUrlCode(name){
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}