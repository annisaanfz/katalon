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

WebUI.callTestCase(findTestCase('WEB/Competency/Settings/Competency/Competency Model/Competency Model'), null)

for (def datas : data.properties.getAt('allData')) {
    WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - add'))

    WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - add - code'), datas[
        0])

    WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - add - model name'), 
        datas[1])

    WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - add - description'), 
        datas[2])

    WebUI.scrollToElement(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - add - competency list header'), 
        5)
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - dropdown type'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - type'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - dropdown category'))
	
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - search category'), datas[3])
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - category'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - category close'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - dropdown competency'))
	
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - search competency'), datas[4])
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - competency'))

	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - competency close'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - competency list add - submit'))
	
	WebUI.sendKeys(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - add - save'), Keys.chord(Keys.HOME))
	
    WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model - add - save'))

    check = WebUI.verifyElementPresent(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model table'), 
        15, FailureHandling.CONTINUE_ON_FAILURE)

    if (check) {
        nilai = 'Passed'
    } else {
        nilai = 'Failed'

        WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Model/competency model back'))
    }
    
    idx = (idx + 1)

    CustomKeywords.'com.lawencon.util.ExcelUtils.writeToExcel'('C:\\Users\\Lawencon\\Katalon Studio\\Linov\\Test Cases - Competency.xlsx', 
        'Data - CM - Add CL', nilai, idx, datas[6])

    WebUI.delay(5)
}