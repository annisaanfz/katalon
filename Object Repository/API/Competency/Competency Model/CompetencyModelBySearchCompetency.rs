<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CompetencyModelBySearchCompetency</name>
   <tag></tag>
   <elementGuidId>af4fcf17-260b-4f47-a9fb-4c945ab86e83</elementGuidId>
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
   <restUrl>${host}/competency/settings/competency-model/modelis/details/${id}/search-competency?page=${page}&amp;limit=${limit}&amp;inquiry=${inquiry}</restUrl>
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
      <id>65cc6046-b76b-49bf-8d20-c8f9d35f1e37</id>
      <masked>false</masked>
      <name>host</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.token</defaultValue>
      <description></description>
      <id>2780bea6-055c-44f1-bbec-2622ed9079da</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>c655b99b-3751-40d6-86d9-4074d5b23a58</id>
      <masked>false</masked>
      <name>id</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>31420be4-93a8-414b-b26c-27caf09ae0da</id>
      <masked>false</masked>
      <name>page</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>87235751-8fb8-4bc4-903c-b7a0f4800257</id>
      <masked>false</masked>
      <name>limit</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>344b3cf7-e0d8-4118-8f9f-914c401f5048</id>
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
