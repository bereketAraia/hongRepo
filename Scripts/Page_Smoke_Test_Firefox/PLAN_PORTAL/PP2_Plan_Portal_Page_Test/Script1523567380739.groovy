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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.planuser20)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/CMS_LoGO_img'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/Text_strong_RADV CDAT'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_span_plan welcome to RADV CDAT CY YYYY'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_Plan Library'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_My Account'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_Log Out'), 0)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_h1_Plan Portal'), 'Plan Portal')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'), 
    0)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_p_Enrollee documentation for Contract year(CY)..'), 
    'Enrollee documentation for Contract Year (CY) 2015 must be submitted by 12/30/2018 to be considered.')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_h3_Accept the Terms and Conditions'), 
    'Accept the Terms and Conditions to Open CDAT for Health Insurance Company')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_p_I am authorized to add and rtrieve content...'), 
    'I am authorized to add and retrieve content from this site and agree to the following terms and conditions: Your MA organization is utilizing this system to validate sampled risk adjustment data that your MA organization submitted under this designated MA contract in accordance with 42 C.F.R §422.310. Your MA organization must follow all RADV audit procedures. Failure to follow RADV audit procedures will render your MA organization\'s subsequent request for appeal for this designated MA contract invalid.')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'), 2)

WebUI.mouseOver(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2013 Contract-Level'), 2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2014 Contract-Level'), 2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'), 2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Icon_Announcement_img'), 2)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Text_strong_Announcement'), 'Announcement:')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Text_span_CDAT is the Official System of Record for the Calender'), 
    'CDAT is the Official System of Record for the Calendar Year 2015 Contract-Level Risk Adjustment Data Validation Medical Record Submission Process.')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Thead_button_Progress'), 'PROGRESS')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Thead_button_Contract Name'), 'CONTRACT NAME')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Thead_Enrollee List'), 'ENROLLEE LIST')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Thead_More'), 'MORE')

