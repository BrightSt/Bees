package com.dms.bees.core.util;

import com.alibaba.fastjson.JSON;
import com.dms.bees.core.exception.BeesException;
import com.dms.bees.core.exception.BeesExceptionEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 渲染工具类
 *
 * @author dms
 * @date 2017-08-25 14:13
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new BeesException(BeesExceptionEnum.WRITE_ERROR);
        }
    }
}
