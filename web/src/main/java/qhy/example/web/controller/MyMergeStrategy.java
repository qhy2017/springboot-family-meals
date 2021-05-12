package qhy.example.web.controller;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.ArrayList;
import java.util.List;

public class MyMergeStrategy extends AbstractMergeStrategy implements MergeStrategy{

    //合并坐标集合
    private List<CellRangeAddress> cellRangeAddresss;
    //构造
    public MyMergeStrategy(List<CellRangeAddress> list) {
//        List<CellRangeAddress> list = new ArrayList<>();
//        //合并 单元格坐标
//        CellRangeAddress item1 = new CellRangeAddress(2, 3, 0, 0);
//        CellRangeAddress item2 = new CellRangeAddress(4, 5, 0, 0);
//        CellRangeAddress item3 = new CellRangeAddress(6, 7, 0, 0);
//        CellRangeAddress item4 = new CellRangeAddress(2, 3, 1, 1);
//        list.add(item1);
//        list.add(item2);
//        list.add(item3);
//        list.add(item4);
        this.cellRangeAddresss = list;
    }
    /**
     * merge
     * @param sheet
     * @param cell
     * @param head
     * @param relativeRowIndex
     */
    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, Integer relativeRowIndex) {
        //合并单元格
        /**
         *  ****加个判断:if (cell.getRowIndex() == 1 && cell.getColumnIndex() == 0) {}****
         * 保证每个cell被合并一次，如果不加上面的判断，因为是一个cell一个cell操作的，
         * 例如合并A2:A3,当cell为A2时，合并A2,A3，但是当cell为A3时，又是合并A2,A3，
         * 但此时A2,A3已经是合并的单元格了
         */
        if (CollectionUtils.isNotEmpty(cellRangeAddresss)) {
            if (cell.getRowIndex() == 1 && cell.getColumnIndex() == 0) {
                for (CellRangeAddress item : cellRangeAddresss) {
                    sheet.addMergedRegionUnsafe(item);
//                    Workbook workbook = sheet.getWorkbook();
//                    CellStyle cellStyle = workbook.createCellStyle();
//                    Font font = workbook.createFont();
//                    font.setBold(true);
//                    font.setColor((short) 0000);
//                    cellStyle.setFont(font);
//                    cell.setCellStyle(cellStyle);
                }
            }
        }
    }

    @Override
    public void setMergeList(List<CellRangeAddress> cellRangeAddresses) {
        this.cellRangeAddresss = cellRangeAddresses;
    }
}
