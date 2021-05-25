<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>JobFamilyBySearch</name>
   <tag></tag>
   <elementGuidId>a9f69fec-45ed-48b3-af36-1fbc750dab56</elementGuidId>
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
   <restUrl>${host}/competency/settings/job-family/search?page=${page}&amp;limit=${limit}&amp;inquiry=${inquiry}</restUrl>
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
      <id>4c0e2fa8-e73e-47c0-b2f2-fc6549bbb187</id>
      <masked>false</masked>
      <name>host</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.token</defaultValue>
      <description></description>
      <id>5f7211eb-b641-47e7-866e-0346b20b57ba</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>c76cc613-97f4-4115-9847-c3d791fb72e4</id>
      <masked>false</masked>
      <name>page</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>b59402ee-4fab-4d1f-846d-bb91fd984a3a</id>
      <masked>false</masked>
      <name>limit</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>5cd9ad1d-1a42-41b5-9340-87729eaac6c2</id>
      <masked>false</masked>
      <name>inquiry</name>
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
