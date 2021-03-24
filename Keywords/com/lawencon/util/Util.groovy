package com.lawencon.util

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import internal.GlobalVariable

public class Util {
	def setToken(def variable) {
		for(def datas in variable.properties.getAt("allData")) {
			try {
				def data = convertToJsonMap(datas)
				setToken(data.username, data.userPassword)
			} catch (Exception e) {
				e.printStackTrace()
			}
		}
	}

	def setToken(String username, String pass) {
		String token = GlobalVariable.token
		if(token.equals("")) {
			def response = WS.sendRequest(findTestObject('API/Login/POST Login',
					["data": JsonOutput.toJson(["username":username, "userPassword":pass])]))

			def check = WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

			if(check) {
				JsonSlurper slurper = new JsonSlurper()
				Map parsedJson = slurper.parseText(extractResponse(response))

				GlobalVariable.token = parsedJson.get("token")
			}
		}
	}

	def extractResponse(response) {
		return response.properties.get("responseText")
	}

	def convertToJsonStr(def data) {
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(data)
		return JsonOutput.toJson(parsedJson)
	}

	def convertToJsonMap(def data) {
		JsonSlurper slurper = new JsonSlurper()
		return slurper.parseText(data)
	}
}
