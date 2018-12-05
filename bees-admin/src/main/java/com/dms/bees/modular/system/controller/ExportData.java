package com.dms.bees.modular.system.controller;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ExportData {

    @RequestMapping(value = "/exportData")
    public Object exportData(HttpServletRequest request){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("success",true);
        HSSFWorkbook workbook = null;
        String filePath;
        String nameZh = null;
        String currentTime = System.currentTimeMillis()+"";
        String path = request.getSession().getServletContext().getRealPath("/")+"temp/";
        filePath = path + nameZh+currentTime;
        String fileName = nameZh + currentTime;
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);
            workbook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            result.put("success",false);
        } catch (IOException e) {
            e.printStackTrace();
            result.put("success",false);
        }


        return result;
    }
}
