package com.mmc.common.controller;

import com.mmc.common.base.JSONUtil;
import org.junit.Test;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@ResponseBody
public class IndexController {
    @Test
    public void test() throws Exception {
        String str = "{name:'mmc'}";
        Map<String, Object> m = JSONUtil.getJSONField(str);
        for(Object key : m.keySet()){   //只能遍历key
            System.out.print(m.get("name"));
        }
    }
}
