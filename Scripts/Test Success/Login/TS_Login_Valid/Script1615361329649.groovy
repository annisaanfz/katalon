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
import org.apache.poi.ss.usermodel.Sheet as Sheet
import org.openqa.selenium.Keys as Keys
import java.io.FileInputStream as FileInputStream
import java.io.FileOutputStream
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet

int idx = 0

String nilai

for (def datas : data.properties.getAt('allData')) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl('http://dev2.linovhr.com/login')

    if ((datas[0]) == null) {
        WebUI.clearText(findTestObject('WEB/Login/input username'), datas[0])
    } else {
        WebUI.setText(findTestObject('WEB/Login/input username'), datas[0])
    }
    
    WebUI.click(findTestObject('WEB/Login/button Log In'))

    if ((datas[1]) == null) {
        WebUI.clearText(findTestObject('WEB/Login/input password'), datas[1])
    } else {
        WebUI.setText(findTestObject('WEB/Login/input password'), datas[1], FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    WebUI.click(findTestObject('WEB/Login/button Log In'), FailureHandling.CONTINUE_ON_FAILURE)
	
    check = WebUI.verifyElementPresent(findTestObject('WEB/SideBar/side bar workforce'), 15, FailureHandling.CONTINUE_ON_FAILURE)
	
    println(check)

    if (check) {
        nilai = 'Passed'
    } else {
        nilai = 'Failed'
    }
	
	idx = (idx + 1)
	
	CustomKeywords.'com.lawencon.util.ExcelUtils.writeToExcel'('C:\\Users\\Lawencon\\Test Cases - Login.xlsx', 
		'Data - Login', nilai, idx, datas[3])
}