import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc2user20)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/TAB_a_Open'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'))

WebUI.selectOptionByValue(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), '1: Object', 
    false)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Request Task'))

WebUI.selectOptionByValue(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), '1: Object', 
    false)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Request Task'))

WebUI.selectOptionByValue(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), '1: Object', 
    false)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Request Task'))

WebUI.selectOptionByValue(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), '1: Object', 
    false)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Request Task'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/a_Log Out'))

