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

WebUI.callTestCase(findTestCase('WEB/Competency/Settings/Competency/Competency Category/Competency Category'),
	null)

WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - list to detail'))

WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category edit'))

for (def datas : data.properties.getAt('allData')) {
	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - category name'),
		datas[0])

	WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - description'),
		datas[1])

	WebUI.scrollToElement(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - description'),
		5)
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - assign to'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - assign to - banner pemberitahuan'), FailureHandling.CONTINUE_ON_FAILURE)
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - assign to - add'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - competency list add - dropdown job role'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - competency list add - job role'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - competency list add - dropdown job title'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - competency list add - job title'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - competency assign to - checkbox 1'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - competency assign to - checkbox 2'))
	
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency Category/competency category - edit - competency assign to - cancel'))
}