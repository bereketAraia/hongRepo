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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.APP_IVV)

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.stPlanUser2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.ivv_password)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/CMS_LoGO_img'), 0)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/Text_strong_RADV CDAT'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_span_plan welcome to RADV CDAT CY YYYY'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_Plan Library'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_My Account'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_Log Out'), 0)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_h1_Plan Portal'), 'Plan Portal')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_h3_Sample_label'), 'Sample:')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'), 
    0)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 IVV Smoke Test Sample'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(4)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_p_Enrollee documentation for Contract year(CY)..'), 
    'Enrollee documentation for CY 2015 Smoke Test Sample must be submitted by 12/30/2019 07:00 PM EDT to be considered.')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_h3_Accept the Terms and Conditions'), 
    0)

'RM - 37.1  varifiy the terms and conditions statement is correct '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Text_p_I am authorized to add and rtrieve content...'), 
    'I am authorized to add and retrieve content from this site and agree to the following terms and conditions: Your MA organization is utilizing this system to validate sampled risk adjustment data that your MA organization submitted under this designated MA contract in accordance with 42 C.F.R §422.310. Your MA organization must follow all RADV audit procedures. Failure to follow RADV audit procedures will render your MA organization\'s subsequent request for appeal for this designated MA contract invalid.')

WebUI.delay(5)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 IVV Smoke Test Sample'))

'RM - 37.2 User ACCEPT the terms and conditions in order to view contracts'
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(4)

WebUI.mouseOver(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 IVV Smoke Test Sample'), 
    2)

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_X_Dismiss_warningBanner'))

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Icon_Announcement_img'), 2)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Text_strong_Announcement'), 'Announcement:')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Text_span_CDAT is the Official System of Record for the Calender'), 
    'CDAT is the Official System of Record for the Smoke Test Sample.')

WebUI.delay(2)

'RM - 36.2  check to the the progress column is there'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Thead_button_Progress'), 'PROGRESS')

'RM -36.2 - check to see if contract name is available'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/thead_button_Contract Name (1)'), 
    0)

'RM -36.2 check to see if the Enrollee List is visible'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Thead_Enrollee List'), 'ENROLLEE LIST')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Thead_More'), 'MORE')

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'), 0)

WebUI.delay(2)

'RM - 36.4  check to see if contract name column is sortable'
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Thead_button_Progress'), FailureHandling.CONTINUE_ON_FAILURE)

'RM -36.5 - check to see if more option is disable'
WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/FirstContract_td_more_tr1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

'RM- 37.3 and 36.3  Varify that their is a contract available to select from the table.'
WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(3)

