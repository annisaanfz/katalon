package com.lawencon.linov
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Assessment {

	@When("masuk")
	def callTestCaseLogin() {
		WebUI.callTestCase(findTestCase('Login/TS_Login_Valid') , null)
//		CucumberKW.callTestCase(findTestCase('Login/TS_Login_Valid') , null)
//		CucumberKW.runFeatureFileWithTags('Include/features/Login/Login.feature', '@valid_admin')
//		Login login = new Login()
//		login.openBrowser()
//		login.navigateToLoginPage()
//		login.setUsernameValid("admtes000")
//		login.clickButtonLogin()
//		login.setPassword("Password.tes000")
//		login.clickButtonLoginAgain()
//		login.navigateToDashboardWorkforce()
	}

	@When("scroll")
	def scrollSideBar() {
		WebUI.scrollToElement(findTestObject('WEB/Competency/Settings/Assessment/Competency'), 5)
	}

	@And("klik competency")
	def clickButtonCompetency() {
		WebUI.verifyElementPresent(findTestObject('WEB/Competency/Settings/Assessment/Competency'), 5, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('WEB/Competency/Settings/Assessment/Competency'))
	}

//	@Then("navigate dashboard")
//	def navigateDashboard() {
//		WebUI.navigateToUrl('http://dev2.linovhr.com/competency/dashboard')
//	}

	@When("klik settings")
	def klikSetting() {
		WebUI.click(findTestObject('WEB/Competency/Settings/Assessment/Settings'))
	}

	@And("assessment")
	def klikAssessment() {
		WebUI.click(findTestObject('WEB/Competency/Settings/Assessment/Assessment'))
	}

	@Then("assessment detail")
	def assessmentDetail() {
	}
}