package com.example;

public class Row {

    private String[] cells = new String[3];


    Row(String firstCell, String secondCell, String thirdCell) {
        cells[0] = firstCell;
        cells[1] = secondCell;
        cells[2] = thirdCell;
    }

//    public String getCell(int i) {
//        return cells[i];
//    }

    public String[] getCells() {
        return cells;
    }

}
