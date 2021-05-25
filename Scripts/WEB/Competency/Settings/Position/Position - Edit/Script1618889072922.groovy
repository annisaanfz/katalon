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

WebUI.callTestCase(findTestCase('WEB/Competency/Settings/Position/Position'), null)

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - list to detail'))

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit'))

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit - dropdown job title'))

WebUI.setText(findTestObject('WEB/Competency/Settings/Position/position - edit - search job title'), 'bu')

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit - job title'))

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit - dropdown level'))

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit - level'))

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit - dropdown rating'))

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit - tutup banner'))

WebUI.sendKeys(findTestObject('WEB/Competency/Settings/Position/position - edit - save'), Keys.chord(Keys.HOME))

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit - save'))

WebUI.click(findTestObject('WEB/Competency/Settings/Position/position - edit - rating'))