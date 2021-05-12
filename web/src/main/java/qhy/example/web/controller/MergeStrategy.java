package qhy.example.web.controller;

import org.apache.poi.ss.util.CellRangeAddress;

import java.util.List;

public interface MergeStrategy {

    void setMergeList(List<CellRangeAddress> cellRangeAddresses);
}


