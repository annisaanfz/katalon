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

WebUI.callTestCase(findTestCase('WEB/Login/Login_Valid'), null)

WebUI.scrollToElement(findTestObject('WEB/SideBar/sidebar competency'), 10)

WebUI.click(findTestObject('WEB/SideBar/sidebar competency'))

WebUI.click(findTestObject('WEB/Competency/Settings/button dropdown settings'))

WebUI.mouseOver(findTestObject('WEB/Competency/Settings/Job Competency/dropdown job competency'))

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/dropdown job title'))WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - list to detail'))

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit'))

WebUI.scrollToElement(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit - description'), 10)

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit - competency list add'))

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit - competency list add - group'))

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit - competency list add - group - model'))

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit - competency list add - dropdown competency model'))

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit - competency list add - competency model'))

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit - competency list add - competency model - checkbox 1'))

WebUI.click(findTestObject('WEB/Competency/Settings/Job Competency/Job Title/job title - edit - competency list add - competency model - checkbox 2'))

