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

int idx = 0

String nilai

WebUI.callTestCase(findTestCase('Test Success/Competency/Settings/Competency/Competency List/Competency List'), null)

WebUI.delay(1)

for (def datas : data.properties.getAt('allData')) {
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - list to detail'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/competency list - add - edit'))
	
    println(datas[0])

    if ((datas[0]) == null) {
    } else {
        WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - edit- code'), 
            datas[0])
    }
    
    if ((datas[1]) == null) {
    } else {
        WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - edit - competency name'), 
            datas[1])
    }
    
    if ((datas[2]) == null) {
    } else {
        WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - edit - description'), 
            datas[2])
    }
    
    WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/banner pemberitahuan'), FailureHandling.CONTINUE_ON_FAILURE)

    if ((datas[3]) != null) {
        if ((datas[3]).equals('true')) {
            WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - edit - checkbox include performance review'))
        }
    }
    
    if ((datas[4]) != null) {
        if ((datas[4]).equals('true')) {
            WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - edit - status'))
        }
    }
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - edit - save'))
    
    check = WebUI.verifyElementPresent(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - table'), 
        5, FailureHandling.CONTINUE_ON_FAILURE)

    if (check) {
        nilai = 'Passed'
    } else {
        nilai = 'Failed'

        WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - back'))
    }
    
    idx = (idx + 1)

    CustomKeywords.'com.lawencon.util.ExcelUtils.writeToExcel'('C:\\Users\\Lawencon\\Test Cases - Competency.xlsx', 'Data - CL - Edit', 
        nilai, idx, datas[7])

    WebUI.delay(5)
}