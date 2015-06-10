package com.example.reminder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Oleksandra on 31.03.2015.
 */
public class DateClass {
    /* Инициализация  листов в виде String */
    static ArrayList<String> listeGoldString = new ArrayList<String>();
    static ArrayList<String> listeBlueString = new ArrayList<String>();
    static ArrayList<String> listeGreenString = new ArrayList<String>();
    static ArrayList<String> listeBlackString = new ArrayList<String>();

    /* Инициализация  отсортированных по месяцах листов */
    static ArrayList<Date> listeGoldSearch = new ArrayList<Date>();
    static ArrayList<Date> listeBlueSearch = new ArrayList<Date>();
    static ArrayList<Date> listeGreenSearch = new ArrayList<Date>();
    static ArrayList<Date> listeBlackSearch = new ArrayList<Date>();

    /* Инициализация отсортированных листов в виде Date */
    ArrayList<Date> listeGold = new ArrayList<Date>();
    ArrayList<Date> listeBlue = new ArrayList<Date>();
    ArrayList<Date> listeBlack = new ArrayList<Date>();
    ArrayList<Date> listeGreen = new ArrayList<Date>();

    public void addUndSearch() {
        /* добавление элементов в желтый лист */
        listeGoldAdd(listeGold);
        /* поиск по текущему месяцу*/
        listeGoldSearch(listeGold);
        /* добавление элементов в желтый лист */
        listeBlueAdd(listeBlue);
        /* поиск по текущему месяцу */
        listeBlueSearch(listeBlue);
        /* добавление элементов в черный лист */
        listeBlackAdd(listeBlack);
        /* поиск по текущему месяцу */
        listeBlackSearch(listeBlack);
        /* добавление элементов в зеленый лист */
        listeGreenAdd(listeGreen);
        /* поиск по текущему месяцу */
        listeGreenSearch(listeGreen);
    }

    public void listeGoldAdd(ArrayList<Date> arrayList) {
        arrayList.add(new Date(115, 2, 24, 7, 0, 0));
        arrayList.add(new Date(115, 3, 23, 7, 0, 0));
        arrayList.add(new Date(115, 4, 21, 7, 0, 0));
        arrayList.add(new Date(115, 5, 18, 7, 0, 0));
        arrayList.add(new Date(115, 6, 16, 7, 0, 0));
        arrayList.add(new Date(115, 7, 13, 7, 0, 0));
        arrayList.add(new Date(115, 8, 10, 7, 0, 0));
        arrayList.add(new Date(115, 9, 8, 7, 0, 0));
        arrayList.add(new Date(115, 10, 5, 7, 0, 0));
        arrayList.add(new Date(115, 11, 3, 7, 0, 0));
        arrayList.add(new Date(115, 11, 31, 7, 0, 0));
    }

    public void listeBlueAdd(ArrayList<Date> arrayList) {
        arrayList.add(new Date(115, 2, 24, 7, 0, 0));
        arrayList.add(new Date(115, 3, 23, 7, 0, 0));
        arrayList.add(new Date(115, 4, 21, 7, 0, 0));
        arrayList.add(new Date(115, 5, 18, 7, 0, 0));
        arrayList.add(new Date(115, 6, 16, 7, 0, 0));
        arrayList.add(new Date(115, 7, 13, 7, 0, 0));
        arrayList.add(new Date(115, 8, 10, 7, 0, 0));
        arrayList.add(new Date(115, 9, 8, 7, 0, 0));
        arrayList.add(new Date(115, 10, 5, 7, 0, 0));
        arrayList.add(new Date(115, 11, 3, 7, 0, 0));
        arrayList.add(new Date(115, 11, 31, 7, 0, 0));
    }

    public void listeGreenAdd(ArrayList<Date> arrayList) {
        arrayList.add(new Date(115, 2, 5, 7, 0, 0));
        arrayList.add(new Date(115, 2, 20, 7, 0, 0));
        arrayList.add(new Date(115, 3, 2, 7, 0, 0));
        arrayList.add(new Date(115, 3, 17, 7, 0, 0));
        arrayList.add(new Date(115, 4, 2, 7, 0, 0));
        arrayList.add(new Date(115, 4, 16, 7, 0, 0));
        arrayList.add(new Date(115, 4, 30, 7, 0, 0));
        arrayList.add(new Date(115, 5, 12, 7, 0, 0));
        arrayList.add(new Date(115, 5, 26, 7, 0, 0));
        arrayList.add(new Date(115, 6, 10, 7, 0, 0));
        arrayList.add(new Date(115, 6, 24, 7, 0, 0));
        arrayList.add(new Date(115, 7, 7, 7, 0, 0));
        arrayList.add(new Date(115, 7, 21, 7, 0, 0));
        arrayList.add(new Date(115, 8, 4, 7, 0, 0));
        arrayList.add(new Date(115, 8, 18, 7, 0, 0));
        arrayList.add(new Date(115, 9, 2, 7, 0, 0));
        arrayList.add(new Date(115, 9, 16, 7, 0, 0));
        arrayList.add(new Date(115, 9, 30, 7, 0, 0));
        arrayList.add(new Date(115, 10, 13, 7, 0, 0));
        arrayList.add(new Date(115, 10, 27, 7, 0, 0));
        arrayList.add(new Date(115, 11, 11, 7, 0, 0));
        arrayList.add(new Date(115, 11, 24, 7, 0, 0));
    }

    public void listeBlackAdd(ArrayList<Date> arrayList) {
        arrayList.add(new Date(115, 2, 13, 7, 0, 0));
        arrayList.add(new Date(115, 2, 27, 7, 0, 0));
        arrayList.add(new Date(115, 3, 11, 7, 0, 0));
        arrayList.add(new Date(115, 3, 24, 7, 0, 0));
        arrayList.add(new Date(115, 4, 8, 7, 0, 0));
        arrayList.add(new Date(115, 4, 22, 7, 0, 0));
        arrayList.add(new Date(115, 5, 6, 7, 0, 0));
        arrayList.add(new Date(115, 5, 19, 7, 0, 0));
        arrayList.add(new Date(115, 6, 3, 7, 0, 0));
        arrayList.add(new Date(115, 6, 17, 7, 0, 0));
        arrayList.add(new Date(115, 6, 31, 7, 0, 0));
        arrayList.add(new Date(115, 7, 14, 7, 0, 0));
        arrayList.add(new Date(115, 7, 28, 7, 0, 0));
        arrayList.add(new Date(115, 8, 11, 7, 0, 0));
        arrayList.add(new Date(115, 8, 25, 7, 0, 0));
        arrayList.add(new Date(115, 9, 9, 7, 0, 0));
        arrayList.add(new Date(115, 9, 23, 7, 0, 0));
        arrayList.add(new Date(115, 10, 6, 7, 0, 0));
        arrayList.add(new Date(115, 10, 20, 7, 0, 0));
        arrayList.add(new Date(115, 11, 4, 7, 0, 0));
        arrayList.add(new Date(115, 11, 18, 7, 0, 0));
    }

    public void listeGoldSearch(ArrayList<Date> arrayList) {
        /* выбор текущей даты */
        Date cuurentTime = new Date();
        /* перебор всех элементов листа */
        for (Date ausgabe : arrayList) {
            /* сравнение текущей даты с месяцем элементом */
            if (cuurentTime.getMonth() == ausgabe.getMonth()) {
                SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE");
                /* Перевети с формата Data в формат String */
                String sDate = sdf.format(ausgabe);
                /* покласть в другой лист,в формате String */
                listeGoldString.add(sDate);
                 /* покласть в другой лист,в формате Data */
                listeGoldSearch.add(ausgabe);
            }
        }
    }

    public void listeBlueSearch(ArrayList<Date> arrayList) {
        Date cuurentTime = new Date();

        for (Date ausgabe : arrayList) {
            if (cuurentTime.getMonth() == ausgabe.getMonth()) {
                SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE");
                String sDate = sdf.format(ausgabe);
                listeBlueString.add(sDate);
                listeBlueSearch.add(ausgabe);
            }
        }
    }

    public void listeGreenSearch(ArrayList<Date> arrayList) {
        Date cuurentTime = new Date();

        for (Date ausgabe : arrayList) {
            if (cuurentTime.getMonth() == ausgabe.getMonth()) {
                SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE");
                String sDate = sdf.format(ausgabe);
                listeGreenString.add(sDate);
                listeGreenSearch.add(ausgabe);
            }
        }
    }

    public void listeBlackSearch(ArrayList<Date> arrayList) {
        Date cuurentTime = new Date();

        for (Date ausgabe : arrayList) {
            if (cuurentTime.getMonth() == ausgabe.getMonth()) {
                SimpleDateFormat sdf = new SimpleDateFormat("d  MMMM, EEEE");

                String sDate = sdf.format(ausgabe);
                listeBlackString.add(sDate);
                listeBlackSearch.add(ausgabe);
            }
        }
    }
}





