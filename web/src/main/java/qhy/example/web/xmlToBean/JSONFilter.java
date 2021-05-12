package qhy.example.web.xmlToBean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

import java.util.ArrayList;
import java.util.List;

public class JSONFilter {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a","aaa");
        jsonObject.put("b","bbb");
        jsonObject.put("c","ccc");
        SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter();
        List<String> listStr = new ArrayList<>();
        listStr.add("a");
        simplePropertyPreFilter.getExcludes().addAll(listStr);
//      JSON.toJSONString(jsonObject,simplePropertyPreFilter);
        String s = jsonObject.toJSONString(simplePropertyPreFilter);
        System.out.println(s);
        System.out.println(JSON.toJSONString(jsonObject,simplePropertyPreFilter));

    }
}
