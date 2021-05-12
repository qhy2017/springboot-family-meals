package qhy.example.web.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;

@RestController
public class ExcelController {


    @RequestMapping(value = "/getTemplate")
    public void getTemplate(HttpServletResponse response) throws Exception{
        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        // 填充list 的时候还要注意 模板中{.} 多了个点 表示list
        String templateFileName = "D:\\excel\\test.xlsx";
        response.reset();
        // 方案1 一下子全部放到内存里面 并填充
        String fileName = "easyexcel_测试" + System.currentTimeMillis() + ".xlsx";
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        fileName = URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        // 这里 会填充到第一个sheet， 然后文件流会自动关闭
//        EasyExcel.write(fileName).withTemplate(templateFileName).sheet().doFill(data());

        // 方案2 分多次 填充 会使用文件缓存（省内存）
//        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).withTemplate(templateFileName).build();
//
//        List<CellRangeAddress> lists = new ArrayList<>();
//        //合并 单元格坐标
//        CellRangeAddress item1 = new CellRangeAddress(2, 3, 0, 0);
//        CellRangeAddress item2 = new CellRangeAddress(4, 5, 0, 0);
//        CellRangeAddress item3 = new CellRangeAddress(6, 7, 0, 0);
//        CellRangeAddress item4 = new CellRangeAddress(2, 3, 1, 1);
//        lists.add(item1);
//        lists.add(item2);
//        lists.add(item3);
//        lists.add(item4);
//
//        MyMergeStrategy myMergeStrategy = new MyMergeStrategy(lists);
//        WriteSheet writeSheet = EasyExcel.writerSheet().registerWriteHandler(new MyMergeStrategy(lists)).build();
//        Map<String,Object> params = new HashMap<>();
//        params.put("name","渠红元");
//        excelWriter.fill(params, writeSheet);
//        List<Map<String,Object>> list = new ArrayList<>();
//        for(int i = 0; i < 13; i++){
//            list.add(new HashMap<String,Object>(){{
//                put("age","渠红元");
//            }});
//        }
//        excelWriter.fill(list, writeSheet);
//
//        // 千万别忘记关闭流
//        excelWriter.finish();
        File file = new File(templateFileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        Row row = sheet.createRow(2);
        Cell cell = row.createCell(0);
        cell.setCellValue("hello world");
        cell.setCellStyle(cellStyle);
        sheet.addMergedRegionUnsafe(new CellRangeAddress(2,3,0,0));
        row = sheet.createRow(4);
         cell = row.createCell(0);
         cell.setCellValue("hello dd world");
         cell.setCellStyle(cellStyle);
        Row row1 = sheet.getRow(10);
        Cell cell1 = row1.getCell(0);
        String stringCellValue = cell1.getStringCellValue();
        workbook.write(response.getOutputStream());
        workbook.close();

    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getList")
    public Object getList(HttpServletResponse response, HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        List<Map<String,String>> list = new ArrayList<>();
        for(int i = 0;i < 15; i++) {
            int finalI = i;
            Random random = new Random();
            list.add(new HashMap<String,String>(){{
                put("name", String.valueOf(decimalFormat.format(random.nextInt(300) + 1)));
                put("age",String.valueOf(decimalFormat.format(random.nextInt(300) + 1)));
                put("a",String.valueOf(decimalFormat.format(random.nextInt(300) + 1)));
                put("b",String.valueOf(decimalFormat.format(random.nextInt(300) + 1)));
                put("c",String.valueOf(decimalFormat.format(random.nextInt(300) + 1)));
                put("d","描述~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +finalI);
            }});
        }
        System.out.println(JSON.toJSONString(list));
        return JSON.toJSONString(list);
    }

    public static void main(String[] args) {
        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        // 填充list 的时候还要注意 模板中{.} 多了个点 表示list
        String templateFileName = "D:\\excel\\test.xlsx";
        // 方案1 一下子全部放到内存里面 并填充
        String fileName = "listFill" + System.currentTimeMillis() + ".xlsx";
        // 这里 会填充到第一个sheet， 然后文件流会自动关闭
//        EasyExcel.write(fileName).withTemplate(templateFileName).sheet().doFill(data());

        // 方案2 分多次 填充 会使用文件缓存（省内存）
        ExcelWriter excelWriter = EasyExcel.write(fileName).withTemplate(templateFileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("date", "2019年10月9日13:28:28");
        map.put("total", 1000);
        excelWriter.fill(map, writeSheet);
        excelWriter.finish();
    }

}
