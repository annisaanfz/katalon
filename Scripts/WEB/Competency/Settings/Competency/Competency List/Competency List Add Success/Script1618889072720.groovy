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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

int idx = 0

String nilai

WebUI.callTestCase(findTestCase('WEB/Competency/Settings/Competency/Competency List/Competency List'), null)

for (def datas : data.properties.getAt('allData')) {
	WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list add'))
	
	if((datas[0])==null) {
		WebUI.clearText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - code'))
	}
	else {
		WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - code'), datas[
			0])
	}
	
	if((datas[1])==null) {
    	WebUI.clearText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - competency name'))
	}
	else {
		WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - competency name'),
			datas[1])
	}

    WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - dropdown type'))

    WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - type'))

    WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/banner pemberitahuan'), FailureHandling.CONTINUE_ON_FAILURE)

    println(datas[3])

    if ((datas[3]).equals('true')) {
        WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - checkbox include performance review'))
    }
    
    println(datas[4])

    if ((datas[4]).equals('true')) {
        WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - max level competency'))

        WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - max level competency'), 
            datas[5])
    } else {
        WebUI.click(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - checkbox level competency'))
    }
	
	if((datas[2]) == null) {
		WebUI.clearText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - description'))
	}
	else {
		WebUI.setText(findTestObject('WEB/Competency/Settings/Competency/Competency List/competency list - add - description'),
			datas[2])
	}
}