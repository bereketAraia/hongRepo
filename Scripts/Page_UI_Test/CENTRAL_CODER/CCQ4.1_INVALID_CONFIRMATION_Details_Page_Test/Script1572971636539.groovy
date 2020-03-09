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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user50)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(5)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_a_Open (11)'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/button_Invalid Confirmation_filter'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

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

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_h1_Invalid Confirmation'), 
    0)

'RM_597.1 : display coversheetID\r\n'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_li_Coversheet ID CY YYYY Contract'), 
    0)

'RM-597.2 : view submission button is present '
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_a_View Submission'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_button_Details'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/button_Validate'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_a_View Submission'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

'RM-597.2 : EXIT button is present '
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Exit'), 
    0)

'RM-597.2 : ESCALATE button is present '
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Escalate'), 
    0)

'RM-597.2 : SAVE button is present '
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Save'), 
    0)

'RM-597.2 :COMPLETE button is present '
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Complete'), 
    0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Detail_Section/section1_li_Enrollee ID 0000000_00'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Detail_Section/section1_li_Name Last First'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Detail_Section/section1_li_DOB MMDDYYYY'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Detail_Section/section1_li_Provider Type PSHOO'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Detail_Section/section1_li_Date of Service Start'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Detail_Section/section1_li_Date of Service End'), 
    0)

WebUI.delay(2)

