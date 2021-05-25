<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CompFamilyBasedRating</name>
   <tag></tag>
   <elementGuidId>c241f611-1277-4c44-a23b-9f50ec26fc02</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${host}/competency/dashboard/competency-employee-based-rating?employeeId=${employeeId}&amp;source=${source}&amp;catId=${catId}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.host</defaultValue>
      <description></description>
      <id>4b43e513-1ee2-4180-b5a5-9a146826ad7f</id>
      <masked>false</masked>
      <name>host</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.token</defaultValue>
      <description></description>
      <id>aaac6a5c-ab1a-4971-997d-dc381d4573f0</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>56d5b29e-684e-4a60-a2c3-a58039efee67</id>
      <masked>false</masked>
      <name>employeeId</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>4ee01911-bf48-4587-9373-946c7a9cc95c</id>
      <masked>false</masked>
      <name>source</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>cd8a5b65-bf72-430c-89f8-3f9df8e7ae09</id>
      <masked>false</masked>
      <name>catId</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
