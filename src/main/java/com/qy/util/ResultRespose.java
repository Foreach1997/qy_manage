package com.qy.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Lang;

public class ResultRespose {

    /**
     * 不分页
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static JSONObject rsult(Integer code,String msg,Object data){
        JSONObject res = new JSONObject();
        res.put("code",code);//200
        res.put("msg",msg);
        res.put("data",data);
        return res;
    }

    /**
     * 分页
     * @param code
     * @param msg
     * @param data
     * @param count
     * @return
     */
    public static JSONObject rsultRespose(Integer code, String msg, Object data, long count){
        JSONObject res = new JSONObject();
        res.put("code",code);
        res.put("msg",msg);
        res.put("data",data);
        res.put("count",count);
        return res;
    }




}
