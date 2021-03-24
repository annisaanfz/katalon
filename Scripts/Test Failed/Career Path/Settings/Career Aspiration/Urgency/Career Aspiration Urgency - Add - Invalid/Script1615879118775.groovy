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

WebUI.callTestCase(findTestCase('Test Success/Career Path/Settings/Career Aspiration/Urgency/Career Aspiration Urgency'), null)

for (def datas : data.properties.getAt('allData')) {
	WebUI.click(findTestObject('WEB/Career Path/Career Aspiration/career aspiration - urgency - add'))
	
	if(datas[0] == null) {
		WebUI.clearText(findTestObject('WEB/Career Path/Career Aspiration/career aspiration - urgency - code'), datas[0])
	}
	else {
		WebUI.setText(findTestObject('WEB/Career Path/Career Aspiration/career aspiration - urgency - code'), datas[0])
	}
	
	if(datas[1] == null) {
		WebUI.clearText(findTestObject('WEB/Career Path/Career Aspiration/career aspiration - urgency - urgency level name'))
	}
	else {
		WebUI.setText(findTestObject('WEB/Career Path/Career Aspiration/career aspiration - urgency - urgency level name'), datas[1])
	}
	
	WebUI.click(findTestObject('WEB/Career Path/Career Aspiration/career aspiration - urgency - save'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('WEB/Career Path/Career Aspiration/cancel aspiration - urgency - cancel'))
}