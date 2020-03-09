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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.planuser50)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_2'))

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Icon_Announcement_img'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Text_strong_Announcement'), 
    0)

'top alert varified'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Text_span_CDAT is the Official System of Record for the Calender'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/CMS_logo_img'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Header_strong_RADV CDAT CY 2015'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Header_a_Plan Library'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Header_a_My Account'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Header_a_Log Out'), 0)

'header Varified'
WebUI.delay(2)

'RM-44.8  : Back to enrollee List page '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_button_Back To  List of Enroll'), 
    0)

'RM-44.1 : Enrollee Submission Management Screen'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_h1_Enrollee Submission Management'), 
    'Enrollee Submission Management')

'RM-44.2 : Name field Present'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_li_Name Last First'), 0)

'RM-44.2 : DOB field Present'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_li_DOB MMDDYYYY'), 0)

'RM-44.2 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_li_Enrollee ID 0000000000'), 
    0)

'RM-44.2 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_li_Current HMOID H0000'), 
    2)

'RM-44.2 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_li_Sample Year HMOID H0000'), 
    0)

'RM-44.2 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_li_MA Contract  Contract 0000'), 
    0)

'RM-44.2 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_li_MA Organization MA Organization'), 
    2)

'RM-44.2 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Hero_li_Submission Deadline 0000000'), 
    0)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Text_h2_Coversheets            Subm'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Text_small_Submitted 1'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Text_small_Available 9'), 2)

//WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/StatusBar_li_00 In Progress'), 2)
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Text_h5_CMS-HCCs 20142015 Filters'), 
    2)

'\'RM-44.9 :List of HCC available  and RM-44.6 : filters for  specific HCC if clicked '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/button_HCC-first'), 0)

'RM-44.4 :search field available '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Search_input_keyword'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Search_button_Search'), 0)

'End of HCC filters and search field'
WebUI.delay(5)

'RM-44.5 :Filters text field available '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Text_h5_Type Filters', [('variable') : '']), 
    'Type Filters:')

'RM-44.5 :Filters text field available '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Filter_button_Medical Record Only'), 
    2)

'RM-44.5 :Filters text field available '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Filter_button_Medical Record  Attestation'), 
    0)

'RM-44.5 :Filters text field available '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Filter_button_No Medical Record'), 
    0)

'RM-44.5 :Filters text field available '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Text_h5_Issue Filters'), 'Issue Filters:')

'RM-44.5 :Filters text field available '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Filter_button_No'), 2)

'RM-44.5 :Filters text field available '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Filter_button_Yes'), 0)

'end of filter '
WebUI.delay(2)

'RM-44.2 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_Rank'), 0)

'RM-44.2 : '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_Type'), 'TYPE')

'RM-44.2 : '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_Coversheet ID'), 'COVERSHEET ID')

'RM-44.2 : '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_Date Submitted'), 'DATE SUBMITTED')

'RM-44.2 : '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_CMS-HCCs'), 'CMS-HCCS')

'RM-44.2 : '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_Issue'), 'ISSUE')

'RM-44.2 : '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_File Format Issue'), 'FILE FORMAT ISSUE')

'RM-44.2 : '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_More'), 'MORE')

//WebUI.scrollToPosition(0, 800)
'RM-44.2 : '
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_8_More'))

WebUI.delay(2)

'RM-44.10 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_8_More - SubmittedBy'), 
    0)

'RM-44.10 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_8_More - Coversheet -Download'), 
    0)

'RM-44.10 : '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_8_More - Filename'), 
    0)

WebUI.delay(3)

'RM-44.3 : '
WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_Rank'), FailureHandling.CONTINUE_ON_FAILURE)

'RM-44.3 : '
WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_Coversheet ID'), FailureHandling.CONTINUE_ON_FAILURE)

'RM-44.3 : '
WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/th_Date Submitted'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_div_Add Coversheet'))

WebUI.delay(2)

'RM-49.1 - Single or guided option to create coversheet  '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_a_Single'), 0)


'RM-49.1 - Single or guided option to create coversheet  '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_a_Guided'), 0)

WebUI.delay(0)

'RM-80.1 : mark as complete button '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_button_Mark as Complete'), 
    0)

