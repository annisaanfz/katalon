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

for (def datas : data.properties.getAt('allData')) {
	WebUI.callTestCase(findTestCase('Test Success/Competency/Settings/Competency/Competency List/Competency List Add Success'), null)
	
	WebUI.scrollToElement(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - description'),
		5)
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/competency list add - behaviour - add'))
	
    WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - dropdown level'))

    WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - level'))

    WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - behaviour'), 
        datas[0])
	
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - rating 1'),
		datas[1])
	
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - rating 2'),
		datas[2])
	
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - rating 3'),
		datas[3])
	
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - rating 4'),
		datas[4])
	
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - rating 5'),
		datas[5])
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - submit'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - concern - add'))
	
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - concern - concern'), datas[6])
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/Behaviour/behaviour - concern - submit'))
	
	WebUI.sendKeys(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - save'), Keys.chord(Keys.HOME))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - save'))
	
	check = WebUI.verifyElementPresent(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - table'),
		5, FailureHandling.CONTINUE_ON_FAILURE)

	if (check) {
		nilai = 'Passed'	
	} else {
		nilai = 'Failed'
		WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - back'))
	}
	
	idx = (idx + 1)

	CustomKeywords.'com.lawencon.util.ExcelUtils.writeToExcel'('C:\\Users\\Lawencon\\Test Cases - Competency.xlsx', 'Data - CL - Add B',
		nilai, idx, datas[8])
	
	WebUI.delay(5)
	
	
}