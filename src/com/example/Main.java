package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*Не знаю где стоит писать подобные коментарии , поэтому пишу здесь. Класс Report и Row стоит удалить,
     * потому что их можно спокойно заменить на просто List и String[].Так же не вижу особого смысла в String[].
     * В массиве строк в которых всего лишь 1 символ , можно либо заменить на просто String , и он будет выполнять
     * как бы фунцию row(строки) , или же заменить его на char[], если нужно сохранять отдельные символы*/


    public static void main(String[] args) {
//        Report report = new Report(); // Создание класса в котором есть только List rows
        List<String[]> rows = new ArrayList();

//        Row firstRow = new Row();// Создание класса в котором есть только массив строк cells размером 3
        String[] firstRow = new String[3];
        firstRow[0] = "a";
        firstRow[1] = "b";
        firstRow[2] = "c";
        rows.add(firstRow); // Добавление в Main.rows объекта Row.row1

//        Row secondRow = new Row();
        String[] secondRow = new String[3];
        secondRow[0] = "d";
        secondRow[1] = "e";
        secondRow[2] = "f";
        rows.add(secondRow); // Добавление в Main.rows объекта Row.row2

//        report.rows = rows;//Присваивание объекту report.rows main.rows


        for (String[] row : rows) {
            System.out.println(row[0] + " " + row[1] + " " + row[2]);
        }

//        int i = 0;
//        while (i != 2) {
//            String[] o = rows.get(i);
//            System.out.println(o[0] + " " + o[1] + " " + o[2]);
//            System.out.println();
//        }
    }
}
