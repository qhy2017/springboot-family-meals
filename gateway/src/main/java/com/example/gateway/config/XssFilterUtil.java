package com.example.gateway.config;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auth qhy
 * @email 1242359237@qq.com
 * @date
 */
public class XssFilterUtil {

    /**
     * 使用自带的basicWithImages 白名单
     * 允许的便签有a,b,blockquote,br,cite,code,dd,dl,dt,em,i,li,ol,p,pre,q,small,span,
     * strike,strong,sub,sup,u,ul,img
     * 以及a标签的href,img标签的src,align,alt,height,width,title属性
     */
    private static  Whitelist whitelist = Whitelist.basicWithImages()
            .addAttributes(":all", "script","delete","save","update","or","and","in", "style");

    /** 配置过滤化参数,不对代码进行格式化 */
    private static final Document.OutputSettings outputSettings = new Document.OutputSettings().prettyPrint(false);
    static {
        // 富文本编辑时一些样式是使用style来进行实现的
        // 比如红色字体 style="color:red;"
        // 所以需要给所有标签添加style属性
//        whitelist = whitelist.addAttributes(":all", "script", "style");
    }

    public static String clean(String content) {
        return Jsoup.clean(content, "", whitelist, outputSettings);

    }

    private static final String empty = "";
    public static String cleanSqlKeyWord(String value) {
        String tempValue = value;
        tempValue = tempValue.replaceAll("union|UNION", empty)
                .replaceAll("delete|DELETE", empty)
                .replaceAll("or|OR", empty)
                .replaceAll("and|AND", empty)
                .replaceAll("exec|EXEC", empty)
                .replaceAll("insert|INSERT", empty)
                .replaceAll("select|SELECT", empty)
                .replaceAll("update|UPDATE", empty)
                .replaceAll("count|COUNT", empty)
                .replaceAll("\\*", empty)
                .replaceAll("\\%", empty)
                .replaceAll("chr|CHR", empty)
                .replaceAll("mid|MID", empty)
                .replaceAll("master|MASTER", empty)
                .replaceAll("truncate|TRUNCATE", empty)
                .replaceAll("char|CHAR", empty)
                .replaceAll("declare|declare", empty)
                .replaceAll(";", empty)
                .replaceAll("-", empty)
                .replaceAll("\\+", empty)
                .replaceAll(",", empty)
                .replaceAll("'", empty).trim();
        return tempValue;
    }
    public static void main(String[] args) {

//        System.out.println(clean("<script>alert</script> llll"));
        long l = System.currentTimeMillis();
        String reg = "(\\s+and\\s+)(\\s+in\\s+)(\\s+or\\s+)";
        String regStr = "select and  in  or and ";
        Pattern compile = Pattern.compile(reg);
        while (true) {
            Matcher matcher = compile.matcher(regStr);
            if(matcher.find()) {
//            String s = regStr.replaceAll(reg, "");
                int groupCount = matcher.groupCount();
                for(int i = 0; i < groupCount; i++) {
                    String group = matcher.group(i);
                    regStr = regStr.replace(group.trim(),"");
                    System.out.println("group ---- >  " + group);
                }
            }
            System.out.println("regStr ---- >  " + regStr.trim());
            System.out.println("sss ---- >  " + (System.currentTimeMillis() - l));
        }


    }
}
