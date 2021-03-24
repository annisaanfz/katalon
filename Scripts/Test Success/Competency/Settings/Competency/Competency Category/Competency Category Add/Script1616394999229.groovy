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

WebUI.callTestCase(findTestCase('Test Success/Competency/Settings/Competency/Competency Category/Competency Category'),
	null)

for (def datas : data.properties.getAt('allData')) {
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category add'))

	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - add - code'),
		datas[0])

	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - add - category name'),
		datas[1])

	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - add - description'),
		datas[2])

	WebUI.sendKeys(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - add - save'),
		Keys.chord(Keys.HOME))

	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - add - save'))

	check = WebUI.verifyElementPresent(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - table'),
		5, FailureHandling.CONTINUE_ON_FAILURE)

	if (check) {
		nilai = 'Passed'
	} else {
		nilai = 'Failed'

		WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category back'))
	}
	
	idx = (idx + 1)

	CustomKeywords.'com.lawencon.util.ExcelUtils.writeToExcel'('C:\\Users\\Lawencon\\Test Cases - Competency.xlsx', 'Data - CC - Add',
		nilai, idx, datas[4])

	WebUI.delay(5)
}