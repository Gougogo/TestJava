package com.goumi.jsonparse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import net.mindview.atunit.Test;


import java.io.*;
import java.math.BigDecimal;
import java.util.Date;

public class JsonParse {
    @Test
    public void shuiLing(){
        String json = "E:\\gis\\data\\pd20192021-07-08.json";
        File jsonFile = new File(json);
        //通过上面那个方法获取json文件的内容
        String jsonData = CommonUtil.getStr(jsonFile);
        //转json对象
        JSONObject parse = (JSONObject)JSONObject.parse(jsonData);
        //获取主要数据
        JSONArray features = parse.getJSONArray("features");
        //挨个遍历
        for (Object feature : features) {
            JSONObject featureObject =(JSONObject)feature;
            JSONObject properties = featureObject.getJSONObject("properties");
            JSONObject geometry = featureObject.getJSONObject("geometry");
            JSONArray coordinates = geometry.getJSONArray("coordinates");
//            System.out.println(coordinates);
            //通过创建对应的实体类去存储对应数据然后存库
            GisDetails gisDetails = new GisDetails();
            gisDetails.setCreateTime(new Date());
            String date = jsonFile.getName();
            gisDetails.setDatetime(date.substring(date.indexOf("2021"),date.indexOf('.')));
            gisDetails.setId(properties.getString("id"));
            gisDetails.setQ(new BigDecimal(properties.getString("q")));
            gisDetails.setLat(new BigDecimal(coordinates.getString(1))); //维度
            gisDetails.setLon(new BigDecimal(coordinates.getString(0))); // 经度
//            System.out.println(properties);
            //如果数据量大不建议这样入库 直接拼接sql 然后插入一次
/*            int i = gisService.insertGisDetails(gisDetails);
            if (i>=0){
                log.info("==>成功"+gisDetails);
            }else{
                log.info("==》失败"+gisDetails);
            }*/
        }
    }

}
