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
import groovy.json.JsonOutput as JsonOutput
import groovy.json.JsonSlurper as JsonSlurper

for (def datas : dataLogin.properties.getAt('allData')) {
    def response = WS.sendRequest(findTestObject('ESS/Login/Login', [('host') : GlobalVariable.hostEss, ('token') : GlobalVariable.token
                , ('data') : JsonOutput.toJson([('username') : datas[0], ('password') : datas[1]])]))

    def check = WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

    //set token for global
    if (check) {
        JsonSlurper slurper = new JsonSlurper()

        Map parsedJson = slurper.parseText(response.properties.get('responseText'))

        GlobalVariable.token = parsedJson.get('token').get('accessToken')
    }
    
    println(GlobalVariable.token)
}