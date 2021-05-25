import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.lang.annotation.Documented as Documented
import java.sql.Driver as Driver
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement as Keys

import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('WEB/Career Path/Settings/Match Color/Match Color'), null)

for (def datas : data.properties.getAt('allData')) {
    WebUI.click(findTestObject('WEB/Career Path/Match Color/match color - add'))

    WebUI.setText(findTestObject('WEB/Career Path/Match Color/match color - lower limit'), datas[0])

    WebUI.setText(findTestObject('WEB/Career Path/Match Color/match color - upper limit'), datas[1])

    WebUI.setText(findTestObject('WEB/Career Path/Match Color/match color - color name'), datas[2])

    WebUI.click(findTestObject('WEB/Career Path/Match Color/match color - input color'))

    WebUI.delay(1)

    WebElement element = WebUiCommonHelper.findWebElement(findTestObject
		('WEB/Career Path/Match Color/match color - color'), 10)
    WebUI.executeJavaScript("arguments[0].innerText = '#002aff'", Arrays.asList(element))
}