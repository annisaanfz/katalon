import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.apache.poi.ss.usermodel.Sheet
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.keyword.excel.ExcelKeywords as EK
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


//Sheet dataLogin = EK.getExcelSheetByName("C:\\Users\\Lawencon\\Test Cases.xlsx", "Data - Login")
//
//FileInputStream file = new FileInputStream(dataLogin)
//println(dataLogin)
//
//println(dataLogin.getActiveCell())
//println(dataLogin.getLastRowNum())

//println(EK.setValueToCellByIndex(dataLogin, 2, 5, "Test"))

//EK.setValueToCellByAddress(dataLogin, "E2", "Tes")


FileInputStream file = new FileInputStream (new File("C:\\Users\\Lawencon\\Test Cases.xlsx"))
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet("Data - Login")

println(workbook)
println(sheet)

println(sheet.getRow(0).getLastCellNum()-1)

//sheet.getRow(1).createCell(4).setCellValue("Passed")
//FileOutputStream outFile = new FileOutputStream(new File("C:\\Users\\Lawencon\\Test Cases.xlsx"));
//workbook.write(outFile);