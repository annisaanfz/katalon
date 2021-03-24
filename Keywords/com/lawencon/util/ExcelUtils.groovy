package com.lawencon.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

public class ExcelUtils {
	def writeToExcel(String pathTo, String sheetName, String value, int idx, String ER) {

		FileInputStream file = new FileInputStream(new File(pathTo))

		XSSFWorkbook workbook = new XSSFWorkbook(file)

		XSSFSheet sheet = workbook.getSheet(sheetName)

		int createdColumn = sheet.getRow(0).getLastCellNum() - 4
		int actualResultColumn = sheet.getRow(0).getLastCellNum() - 3
		int statusColumn = sheet.getRow(0).getLastCellNum() - 2

		sheet.getRow(idx).createCell(createdColumn).setCellValue(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))

		sheet.getRow(idx).createCell(actualResultColumn).setCellValue(value)

		String status
		println(value)
		println(ER)
		if(value.equals(ER)) {
			status = 'OK'
		}
		else {
			status = 'Not OK'
		}
		sheet.getRow(idx).createCell(statusColumn).setCellValue(status)

		FileOutputStream outFile = new FileOutputStream(new File(pathTo))

		workbook.write(outFile)
	}
}
