package com.qy.util;

import javax.servlet.http.HttpServletRequest;

public class SystemContent {

    public static final String path = "D:\\ww\\";

    public static final String getFullAddressOnline(HttpServletRequest request){
        String strBackUrl = "http://" + request.getServerName()+":"+request.getServerPort()+"/file/";
        return strBackUrl;
    }
}
