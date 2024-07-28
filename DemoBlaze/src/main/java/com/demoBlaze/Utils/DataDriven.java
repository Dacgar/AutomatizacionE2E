package com.demoBlaze.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataDriven {
    public String[] obtainDatasExcel() {
        String archivoExcel = "Datos.xlsx";
        String name = null; String country = null; String city = null;
        String credit = null; String month = null; String year = null;

        try {
            FileInputStream file1 = new FileInputStream(new File(archivoExcel));
            XSSFWorkbook libro1 = new XSSFWorkbook(file1);
            XSSFSheet hoja = libro1.getSheet("datosFormulario");

            Row fila;
            Cell celda;

            fila = hoja.getRow(1);
            celda = fila.getCell(0); name = celda.toString();
            celda = fila.getCell(1); country = celda.toString();
            celda = fila.getCell(2); city = celda.toString();
            celda = fila.getCell(3); credit = celda.toString();
            celda = fila.getCell(4); month = celda.toString();
            celda = fila.getCell(5); year = celda.toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String datos[] = {name, country, city, credit, month,
                year,

        };
        return datos;
    }
}
