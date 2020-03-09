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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

int randomInt = new Random().nextInt((99 - 10) + 1) + 10

System.out.println(randomInt)

String username = 'plan-user' + randomInt.toString()

WebUI.delay(3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), username)

//WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.planuser16)
WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_5'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_div_Add Coversheet'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_a_Single'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Medical Record'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Choose a file or drag it'))

WebUI.delay(2)

Runtime.getRuntime().exec(GlobalVariable.autoIT_chrome)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1000)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_outpatient_small_Physician Specialist Hospital Outpatient'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_Inpatient_small_Hospital Only(Admission  Discharge Dates)'), 
    0)

//WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_outpatient_small_Physician Specialist Hospital Outpatient'), 
//FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Outpatient'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitation'))

WebUI.delay(3)

WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitation'), '12-19')

WebUI.delay(2)

WebUI.scrollToPosition(0, 1900)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_h2_Select all the 20142015 CMS'), 
    'Select all the 2013/2014 CMS-HCCs that support this medical record *')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'), 
    2)

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'), 
    FailureHandling.STOP_ON_FAILURE)

'review page reached'
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Review'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

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

WebUI.scrollToPosition(0, 200)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_h1_Review Coversheet'), 'Review Coversheet')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_Name Last First', [('variable') : '']), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_DOB MMDDYYYY'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_Enrollee ID 000000_00'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_Current HMOID H0000'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_Sample Year HMOID H0000'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_MA Contract  Contract 0000'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_MA Organization MA Organization'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_Submission Deadline mmddyyyy'), 
    0)

'hero part Varified'
WebUI.delay(2)

'RM 50.1 : Review text is correct.'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_Review the information below'), 
    'Review the information below to confirm that your coversheet selections, entries and uploaded document(s) accurately represent what you intend to submit.')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_h4_Your upload has passed all crieteria_message'), 
    0)

'RM 50.3 : MD record name is correct.'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_Link_h3_medicalRecord_File.pdf'), 
    'GoodPDFfile.pdf')

WebUI.delay(3)

'RM-50.4'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_h2_Medical Record'), 'Medical Record')

WebUI.delay(2)

'RM-50.5 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_h2_Visit type and dates'), 
    0)

'RM-50.5 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_Outpatient or _inpatient'), 
    0)

'RM-50.5 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_The date of service was 0102'), 
    0)

WebUI.delay(2)

'RM-50.6 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_h2_Name and date of birth on t'), 
    0)

'RM-50.6 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_h5_Name'), 0)

'RM-50.6 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_Last_FirstName'), 0)

'RM-50.6 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_h5_Date of Birth'), 0)

'RM-50.6 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_MMDDYYYY'), 0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_h2_20142015 CMS-HCCs associate'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_HCC 00000'), 0)

WebUI.delay(2)

'RM-50.7 :'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/button_Edit'), 0)

WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/button_Edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

'RM-50.11 :'
WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/button_Submit'))

WebUI.delay(2)

