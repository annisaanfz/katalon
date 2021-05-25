<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>JobRoleListBySearch</name>
   <tag></tag>
   <elementGuidId>6e4edf62-b5d4-46f6-9af3-008a986969a8</elementGuidId>
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
   <restUrl>${host}/competency/settings/job-family/details/{id}/search?page=${page}&amp;limit=${limit}&amp;inquiry=${inquiry}</restUrl>
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
      <id>50259697-1e87-41c4-aeed-405744f0eb4a</id>
      <masked>false</masked>
      <name>host</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.token</defaultValue>
      <description></description>
      <id>b1b361d8-75a4-45a0-8089-b3a8f83b5391</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d3b8fa0a-3fd2-43e3-a8e1-7074c8fb1001</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>d7c24b00-7bb2-4a2d-b43d-a128cea427cf</id>
      <masked>false</masked>
      <name>page</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>b4926f34-cf05-4638-9960-1312714c9501</id>
      <masked>false</masked>
      <name>limit</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>29a06bc1-775a-4b0b-b2a1-c521bbb97816</id>
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
