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

WebUI.callTestCase(findTestCase('WEB/Organization/Setting/Unit/Unit'), null)

WebUI.click(findTestObject('WEB/Organization/Settings/Unit/button add'))

for (def datas : data.properties.getAt('allData')) {
    WebUI.setText(findTestObject('WEB/Organization/Settings/Unit/add unit - code'), datas[0])
	
	WebUI.setText(findTestObject('WEB/Organization/Settings/Unit/add unit - name'), datas[1])
	
	WebUI.setText(findTestObject('WEB/Organization/Settings/Unit/add unit - desc'), datas[2])
	
	WebUI.click(findTestObject('WEB/Organization/Settings/Unit/add unit - dropdown unit type'))
	
	WebUI.click(findTestObject('WEB/Organization/Settings/Unit/add unit - unit type'))
	
	WebUI.click(findTestObject('WEB/Organization/Settings/Unit/add unit - dropdown head of unit'))
	
	WebUI.click(findTestObject('WEB/Organization/Settings/Unit/add unit - head of unit'))
	
	WebUI.click(findTestObject('WEB/Organization/Settings/Unit/add unit - dropdown parent unit'))
	
	WebUI.click(findTestObject('WEB/Organization/Settings/Unit/add unit - parent unit'))
	
	
}