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

'open browser'
WebUI.openBrowser(GlobalVariable.ApplicationURL)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.planuser147)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(6)

WebUI.scrollToPosition(0, 500)

WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_input_keyword'), 'perry')

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_button_span_icon-search'))

WebUI.delay(4)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_1'))

WebUI.delay(2)

'RM-1278.1 : change Rank'
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_a_Change Rank'))

WebUI.delay(3)

'RM-1278.2 :  Rank Coversheets'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_h1_Rank Coversheets'), 
    'Rank Coversheets')

'RM-1278.2 :  Name'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_DOB'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Enrollee ID'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Current HMOID'), 
    2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Sample Year HMOID'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_MA Contract  Contract'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_MA Organization MA Organization'), 
    2)

'RM-1278.2 :  Submission Deadline'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/hero_li_Submission Deadline'), 
    0)

WebUI.delay(3)

'RM-1278.3 :  Rank '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Rank'), 0)

'RM-1278.3 :  Type'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Type'), 0)

'RM-1278.3 : coversheet ID'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Coversheet ID'), 
    0)

'RM-1278.3 : Date Submitted'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Date Submitted'), 
    0)

'RM-1278.3 : CMS-HCC'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_CMS-HCCs'), 
    0)

'RM-1278.3 : Issue'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_Issue'), 
    0)

'RM-1278.3 : File Format Issue'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_File Format Issue'), 
    0)

'RM-1278.3 : More'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Rank/rank_table_th_More'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/footer_button_Cancel'))

WebUI.delay(2)

'RM-1278.4 : Are you sure you want '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/POP_UP_Modal/p_Are you sure you want to cancel ranking coversheets'), 
    'Are you sure you want to cancel ranking coversheets?')

'RM-1278.4 : Save'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/POP_UP_Modal/a_Save'), 0)

'RM-1278.4 : Dont save '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/POP_UP_Modal/a_Dont Save'), 
    0)

'RM-1278.4 : continue working '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/POP_UP_Modal/button_Continue Ranking'), 
    0)

'RM-1278.4 : X close'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/POP_UP_Modal/span_Save_icon-alert-close'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/POP_UP_Modal/span_Save_icon-alert-close'))

WebUI.delay(2)

'RM-1278.5 : Refresh Order'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_2_Rank_Coversheet_Page/Hero_Header_Footer/footer_button_Refresh Order'), 
    0)

