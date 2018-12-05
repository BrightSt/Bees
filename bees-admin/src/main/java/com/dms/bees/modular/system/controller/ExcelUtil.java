package com.dms.bees.modular.system.controller;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.SimpleFormatter;

/**
 * 导出工具类
 */
public class ExcelUtil {

    /**
     * 创建excel文件
     * @param list 数据list
     * @param cls 类.class
     * @param colMap 对应表头，以及配置哪些字段需要导出
     * @param <T>
     * @return
     */
    public synchronized static <T> HSSFWorkbook createWb(List<T> list, Class<T> cls, Map<String,String> colMap) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 格式化方法
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // 第一步，创建一个workbook，一个workbook即对应一个execel文件
        HSSFWorkbook workbook = new HSSFWorkbook();

        // 第二步，在workbook中添加一个sheet，对应excel文件中的sheet页
        HSSFSheet sheet = workbook.createSheet("表格1");

        // 第三步，创建单元格，并设置表头，设置表头居中
        HSSFCellStyle style_center = workbook.createCellStyle();
        style_center.setAlignment(HorizontalAlignment.CENTER); // 居中

        // 第四步 在sheet中添加表头，第0行
        HSSFRow row = sheet.createRow(0);

        // 创建列
        HSSFCell cell;
        int cols = 0;
        // 第一行名称设置
        for(Map.Entry<String,String> m:colMap.entrySet()){
            cell = row.createCell(cols);
            cell.setCellValue(m.getValue());
            cell.setCellStyle(style_center);
            cols++;
        }

        if(null == list || list.size()==0){
            return workbook;
        }

        int rows  = 0;
        for(T obj:list){
            row = sheet.createRow(rows+1);
            cols = 0;
            for(Map.Entry<String,String> m:colMap.entrySet()){
                cell = row.createCell(cols);
                String test ="get"+(m.getKey().charAt(0)+"").toUpperCase()+m.getKey().substring(1);
                System.out.println(test);
                Object value = cls.getDeclaredMethod("get"+(m.getKey().charAt(0)+"").toUpperCase()+m.getKey().substring(1)).invoke(obj,null);
                if(value != null){
                    if(value instanceof Date){
                        cell.setCellValue(simpleDateFormat.format(value));
                    }else if(value instanceof Double){
                        cell.setCellValue(decimalFormat.format(value));
                    }else{
                        cell.setCellValue(value.toString());
                    }
                }else{
                    cell.setCellValue("");
                }
                cell.setCellStyle(style_center);
                cols++;
            }
            rows++;
        }
        return workbook;
    }
}
