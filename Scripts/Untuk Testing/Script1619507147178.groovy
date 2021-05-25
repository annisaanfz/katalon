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
import groovy.json.JsonOutput as JsonOutput
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

int idx = 0

WS.callTestCase(findTestCase('ESS/Login/Login'), null)

println(GlobalVariable.token)

//	println(data.properties.getAt('columnNames'))
//def builder = new groovy.json.JsonBuilder(datas)
//
//println(builder.toString())
def map = [:]
for (def datas : data.properties.getAt('columnNames')) {
	def input = data.properties.getAt('allData')[1]
		mapAdd = [(datas) : (input[idx])]
		println(mapAdd)
		map.putAll(mapAdd)
		println(map)
		idx = (idx + 1)
}
//data.properties.getAt('allData')
//
//	def map = [(datas) : input[idx]]
//
//	idx = (idx + 1)

println(JsonOutput.toJson(map))

for (i in 0..(data.properties.getAt('rowNumbers')-1)) {
		println(i)
	}