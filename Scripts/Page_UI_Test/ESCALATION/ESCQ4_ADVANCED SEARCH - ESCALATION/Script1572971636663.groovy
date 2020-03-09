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

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user10)

WebUI.clearText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'))

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_CMS_LOGO_img'), 0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_small_mrrc_X_ welcome to'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_strong_RADV CDAT CY YYYY'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_Team Library'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_My Account'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_Log Out'), 
    0)

'header Varified'
WebUI.delay(9)

WebUI.click(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Footer_Section/footer_a_Search all escalation cases'))

WebUI.delay(3)

