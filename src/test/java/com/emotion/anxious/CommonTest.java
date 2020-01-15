package com.emotion.anxious;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class CommonTest {

    @Test
    public void dealJson() {
        String json = "";
        JSONObject jsonObject = JSON.parseObject(json);
        JSONArray jsonArray = jsonObject.getJSONObject("paper").getJSONArray("questions");
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject quest = jsonArray.getJSONObject(i);
            System.out.println(quest.getString("content"));
            JSONArray asw = quest.getJSONArray("questionAttrCopys");
            for (int j = 0; j < asw.size(); j++) {
                JSONObject as = asw.getJSONObject(j);
                if ("0".equals(as.getString("type"))) {
                    System.out.println(as.getString("value"));
                }
            }
            System.out.println();
        }
    }
}
