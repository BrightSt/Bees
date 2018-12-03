package com.dms.bees.modular.system.warpper;

import com.dms.bees.core.base.warpper.BaseControllerWarpper;
import com.dms.bees.core.common.constant.factory.ConstantFactory;
import com.dms.bees.core.constant.IsMenu;

import java.util.List;
import java.util.Map;

/**
 * 菜单列表的包装类
 *
 * @author dms
 * @date 2017年2月19日15:07:29
 */
public class MenuWarpper extends BaseControllerWarpper {

    public MenuWarpper(List<Map<String, Object>> list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("statusName", ConstantFactory.me().getMenuStatusName((Integer) map.get("status")));
        map.put("isMenuName", IsMenu.valueOf((Integer) map.get("ismenu")));
    }

}
