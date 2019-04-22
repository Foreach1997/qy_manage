package com.qy.util;

import javax.servlet.http.HttpServletRequest;

public class SystemContent {

    public static final String path = "C:\\Users\\Public";

    public static final String getFullAddressOnline(HttpServletRequest request){
        String strBackUrl = "http://" + request.getServerName()+":"+request.getServerPort()+"/file/";
        return strBackUrl;
    }
}
