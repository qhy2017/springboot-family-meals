package qhy.example.web.poi;

import org.apache.poi.ooxml.POIXMLDocumentPart;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFChart;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.drawingml.x2006.chart.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test {
    public static void main(String[] args) throws Exception{
      new Test().run();
//        DecimalFormat decimalFormat = new DecimalFormat("##.##");
//        String format = decimalFormat.format(2.9676764);
//        String format1 = decimalFormat.format(2.999545);
//        System.out.println(format);
//        System.out.println(format1);

//        System.out.println(Double.valueOf("0.0000"));
//        final Double aDouble = Double.valueOf("0.0000");
//        double a = 0D;
//        System.out.println(a == 0);
//        float x = 302.01f;
//        System.out.println(Double.valueOf(x) == 302.01);
//        System.out.println(x == 302.01f);
//
//        System.out.println(new ArrayList<>().isEmpty());


    }
    public void run()  throws Exception{
        XMLSlideShow slideShow = null;
        try {
//             slideShow = new  XMLSlideShow(OPCPackage.open(new File("D:\\resources\\java\\springboot-family-meals\\web\\src\\main\\resources\\templates\\market_wcsckfztqk.pptx")));
             slideShow = new  XMLSlideShow(OPCPackage.open(new File("C:\\Users\\12423\\Desktop\\新建文件夹\\aa.pptx")));
int u =0;
            for (Object o : slideShow.getSlides()) {
                XSLFSlide slider = (XSLFSlide) o;

                // 第一页
                if (slider.getSlideNumber() == 1 || slider.getSlideNumber() == 2) {
                    List<POIXMLDocumentPart.RelationPart> relationParts = slider.getRelationParts();
                    for (POIXMLDocumentPart.RelationPart part : slider.getRelationParts()) {
                        POIXMLDocumentPart documentPart = part.getDocumentPart();
                        // 是图表
                        if (documentPart instanceof XSLFChart) {
                            XSLFChart chart = (XSLFChart) documentPart;

                            // 查看里面的图表数据，才能知道是什么图表
                            CTPlotArea plot = chart.getCTChart().getPlotArea();

                            // 测试数据
                            List<SeriesData> seriesDatas = Arrays.asList(
                                    new SeriesData("", Arrays.asList(
                                            new NameDouble("行1", 1.23),
                                            new NameDouble("行2", 2.33),
                                            new NameDouble("行3", 30.44)

                                    ))
                            );
                            XSSFWorkbook workbook = chart.getWorkbook();
                            XSSFSheet sheet = workbook.getSheetAt(0);

                            // 柱状图
                            if (!plot.getBarChartList().isEmpty()) {
                                CTBarChart barChart = plot.getBarChartArray(0);
                                updateChartExcelV(seriesDatas, workbook, sheet);
                                workbook.write(chart.getPackagePart().getOutputStream());

                                int i = 0;
                                for (CTBarSer ser : barChart.getSerList()) {
                                    updateChartCatAndNum(seriesDatas.get(i), ser.getTx(), ser.getCat(), ser.getVal());
                                    ++i;
                                    FileOutputStream out = new FileOutputStream("D://测试" + u +".xlsx");
                                    workbook.write(out);
                                    u++;
                                }
                            }

                            // 饼图
                            if (!plot.getPieChartList().isEmpty()) {
                                // 示例饼图只有一列数据
                                updateChartExcelV(Arrays.asList(seriesDatas.get(0)), workbook, sheet);
                                workbook.write(chart.getPackagePart().getOutputStream());

                                CTPieChart pieChart = plot.getPieChartArray(0);
                                int i = 0;
                                for (CTPieSer ser : pieChart.getSerList()) {
                                    updateChartCatAndNum(seriesDatas.get(i), ser.getTx(), ser.getCat(), ser.getVal());
                                    ++i;
                                }
                            }                            // 饼图
                            if (!plot.getPie3DChartList().isEmpty()) {
                                // 示例饼图只有一列数据
                                updateChartExcelV(Arrays.asList(seriesDatas.get(0)), workbook, sheet);
                                workbook.write(chart.getPackagePart().getOutputStream());

                                CTPie3DChart pie3DChartArray = plot.getPie3DChartArray(0);
                                int i = 0;
                                for (CTPieSer ser : pie3DChartArray.getSerList()) {
                                    updateChartCatAndNum(seriesDatas.get(i), ser.getTx(), ser.getCat(), ser.getVal());
                                    ++i;
                                }
                            }


                        }
                    }
                }

            }

            try {
                try (FileOutputStream out = new FileOutputStream("D://测试.pptx")) {
                    slideShow.write(out);
                }
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
//
//        FileOutputStream fileOutputStream = new FileOutputStream(new File("D://测试.pptx"));
//
//        slideShow.write(fileOutputStream);
//        slideShow.close();
    }

    /**
     * 更新图表的关联 excel， 值是纵向的
     *
     * @param workbook
     * @param sheet
     */
    protected static void updateChartExcelV(List<SeriesData> seriesDatas, XSSFWorkbook workbook, XSSFSheet sheet) {


        XSSFRow title = sheet.getRow(0);
        for (int i = 0; i < seriesDatas.size(); i++) {
            SeriesData data = seriesDatas.get(i);
            if (data.name != null && !data.name.isEmpty()) {
                // 系列名称，不能修改，修改后无法打开 excel
                //                title.getCell(i + 1).setCellValue(data.name);
            }
            int size = data.value.size();
            for (int j = 0; j < size; j++) {
                XSSFRow row = sheet.getRow(j + 1);
                if (row == null) {
                    row = sheet.createRow(j + 1);
                }
                NameDouble cellValu = data.value.get(j);
                XSSFCell cell = row.getCell(0);
                if (cell == null) {
                    cell = row.createCell(0);
                }
                cell.setCellValue(cellValu.name);

                cell = row.getCell(i + 1);
                if (cell == null) {
                    cell = row.createCell(i + 1);
                }
                cell.setCellValue(cellValu.value);
            }
            int lastRowNum = sheet.getLastRowNum();
//            if (lastRowNum > size) {
//                for (int idx = lastRowNum; idx > size; idx--) {
//                    sheet.removeRow(sheet.getRow(idx));
//                }
//            }
        }
    }

    /**
     * 更新 chart 的缓存数据
     *
     * @param data          数据
     * @param serTitle      系列的标题缓存
     * @param catDataSource 条目的数据缓存
     * @param numDataSource 数据的缓存
     */
    protected void updateChartCatAndNum(SeriesData data, CTSerTx serTitle, CTAxDataSource catDataSource,
                                        CTNumDataSource numDataSource) {

        // 更新系列标题
        //        serTitle.getStrRef().setF(serTitle.getStrRef().getF()); //
        //        serTitle.getStrRef().getStrCache().getPtArray(0).setV(data.name);

        // TODO cat 也可能是 numRef
        long ptCatCnt = catDataSource.getStrRef().getStrCache().getPtCount().getVal();
        long ptNumCnt = numDataSource.getNumRef().getNumCache().getPtCount().getVal();
        int dataSize = data.value.size();
        for (int i = 0; i < dataSize; i++) {
            NameDouble cellValu = data.value.get(i);
            CTStrVal cat = ptCatCnt > i ? catDataSource.getStrRef().getStrCache().getPtArray(i)
                    : catDataSource.getStrRef().getStrCache().addNewPt();
            cat.setIdx(i);
            cat.setV(cellValu.name);

            CTNumVal val = ptNumCnt > i ? numDataSource.getNumRef().getNumCache().getPtArray(i)
                    : numDataSource.getNumRef().getNumCache().addNewPt();
            val.setIdx(i);
            val.setV(String.format("%.2f", cellValu.value));

        }

        // 更新对应 excel 的range
        catDataSource.getStrRef().setF(
                replaceRowEnd(catDataSource.getStrRef().getF(),
                        ptCatCnt,
                        dataSize));
        numDataSource.getNumRef().setF(
                replaceRowEnd(numDataSource.getNumRef().getF(),
                        ptNumCnt,
                        dataSize));

        // 删除多的
        if (ptNumCnt > dataSize) {
            for (int idx = dataSize; idx < ptNumCnt; idx++) {
                catDataSource.getStrRef().getStrCache().removePt(dataSize);
                numDataSource.getNumRef().getNumCache().removePt(dataSize);
            }
        }
        // 更新个数
        catDataSource.getStrRef().getStrCache().getPtCount().setVal(dataSize);
        numDataSource.getNumRef().getNumCache().getPtCount().setVal(dataSize);
    }

    /**
     * 替换 形如： Sheet1!$A$2:$A$4 的字符
     *
     * @param range
     * @return
     */
    public static String replaceRowEnd(String range, long oldSize, long newSize) {
        Pattern pattern = Pattern.compile("(:\\$[A-Z]+\\$)(\\d+)");
        Matcher matcher = pattern.matcher(range);
        if (matcher.find()) {
            long old = Long.parseLong(matcher.group(2));
            return range.replaceAll("(:\\$[A-Z]+\\$)(\\d+)", "$1" + Long.toString(old - oldSize + newSize));
        }
        return range;
    }

    /**
     * 一个系列的数据
     */
    public static class SeriesData {

        /**
         * value 系列的名字
         */
        public String name;

        public List<NameDouble> value;

        public SeriesData(java.util.List<NameDouble> value) {
            this.value = value;
        }

        public SeriesData(String name, List<NameDouble> value) {
            this.name = name;
            this.value = value;
        }

        public SeriesData() {
        }
    }


    /**
     *
     */
    public static class NameDouble {

        public String name;

        /**
         */
        public double value;

        public NameDouble(String name, double value) {
            this.name = name;
            this.value = value;
        }

        @SuppressWarnings("unused")
        public NameDouble() {
        }

    }
}
