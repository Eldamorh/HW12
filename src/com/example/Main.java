package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        List<Row> rows = new ArrayList();

        Row firstRow = new Row("a","b","c");
        rows.add(firstRow);
        Row secondRow = new Row("d","e","f");
        rows.add(secondRow);

        Report report = new Report();
        report.setRows(rows);

        for(Row row: report.getRows()){
            System.out.println(row.getCell(0) + " " + row.getCell(1) + " " + row.getCell(2));
        }
    }
}
