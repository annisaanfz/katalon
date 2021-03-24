package com.lawencon.linov
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
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



class Login {
	@When("user membuka browser")
	def openBrowser() {
		WebUI.openBrowser('')
	}

	@Then("diarahkan ke halaman login")
	def navigateToLoginPage() {
		WebUI.navigateToUrl('http://dev2.linovhr.com/login')
	}

	@When("input valid username (.*)")
	def setUsernameValid(String username) {
		username = valInput(username)

		WebUI.setText(findTestObject('WEB/Login/input username'), username)
	}

	@And("klik tombol login")
	def clickButtonLogin() {
		WebUI.click(findTestObject('WEB/Login/button Log In'))
	}

	@When("input valid password (.*)")
	def setPassword(String password) {
		password = valInput(password)

		WebUI.setText(findTestObject('WEB/Login/input password'), password)
	}

	@And("klik tombol login lagi")
	def clickButtonLoginAgain() {
		WebUI.click(findTestObject('WEB/Login/button Log In'))
	}

//	@Then("navigates to The Dashboard Workforce")
//	def navigateToDashboardWorkforce() {
//		WebUI.verifyElementPresent(findTestObject('WEB/Competency/Settings/Assessment/a_Workbench'), 5)
//	}

	def valInput(def val) {
		if(val.equals("[blank]")) return ""
		return val;
	}
}