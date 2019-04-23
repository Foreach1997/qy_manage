package com.qy.service.serviceImpl;

import com.qy.dao.ProMakeMapper;
import com.qy.entity.ProMake;
import com.qy.service.ProMakeService;
import com.qy.util.ResultRespose;
import com.qy.util.SystemContent;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class ProMakeServiceImpl implements ProMakeService {

    @Resource
    private ProMakeMapper proMakeMapper;

    @Override
    public Object insertProMake(MultipartFile file, ProMake proMake, HttpServletRequest request) {
        proMake.setCreateTime(new Date());
        proMake.setUserId((int)request.getSession().getAttribute("userId"));
        String path = SystemContent.path;
        String name = UUID.randomUUID().toString() +file.getOriginalFilename();
        if (!file.isEmpty()) {
            File newPath = new File(path, name);
            if (!file.isEmpty()) {
                try {
                    InputStream in = file.getInputStream();
                    FileOutputStream out = new FileOutputStream(newPath);
                    byte buffer[] = new byte[1024];
                    int len = 0;
                    while ((len = in.read(buffer)) > 0) {

                        out.write(buffer, 0, len);
                    }
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return ResultRespose.rsult(200, "提交失败", null);
                }
            }
            proMake.setMakeFile(newPath.toString());
            int count =  proMakeMapper.insert(proMake);
            if (count!=0){
                return ResultRespose.rsult(200, "提交成功", null);
            }
        }
        return  ResultRespose.rsult(200, "提交失败", null);
    }
}
