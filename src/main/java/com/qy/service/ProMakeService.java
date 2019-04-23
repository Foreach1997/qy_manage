package com.qy.service;

import com.qy.entity.ProMake;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Service
@Transactional
public interface ProMakeService {

    Object insertProMake(MultipartFile file, ProMake proMake,HttpServletRequest request);




}
