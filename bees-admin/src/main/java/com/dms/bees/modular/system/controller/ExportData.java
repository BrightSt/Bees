package com.dms.bees.modular.system.controller;

import com.dms.bees.modular.system.model.User;
import com.dms.bees.modular.system.service.IUserService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 利用poi+反射机制 对导出模块进行封装。
 * @author dms66
 */
@RestController
public class ExportData {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/exportData")
    public Object exportData(HttpServletRequest request){
        Map<String,Object> result = new HashMap<String,Object>();
        String filePath;
        String nameZh = null;
        String currentTime = System.currentTimeMillis()+"";
        result.put("success",true);
        HSSFWorkbook workbook = null;
        try {
            // TODO 通过此方式可以实现多数据表的导出。
            if("用户信息".equalsIgnoreCase("用户信息")){
                List<User> list = userService.selectList(null);
                nameZh = "用户信息"+currentTime+".xlsx";
                workbook = ExcelUtil.createWb(list,User.class,User.colMap);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //String path = request.getSession().getServletContext().getRealPath("/")+"temp/";
        String path = "D:/temp/";
        filePath = path + nameZh;
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
        result.put("fileName",nameZh);
        return result;
    }
}
