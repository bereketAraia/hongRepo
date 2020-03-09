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

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_4'))

WebUI.mouseOver(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_div_Add Coversheet'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_a_Single'))

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

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_a_Guided Form'))

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/hero_h1_Medical Record Coversheet'), 
    'Medical Record Coversheet')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/hero_li_Name Last First', 
        [('variable') : '']), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/hero_li_DOB MMDDYYYY'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/hero_li_Enrollee ID 000000_ 00'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/hero_li_Current HMOID H0000'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/hero_li_Sample Year HMOID H0000'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/heroli_MA Contract  Contract 0000'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/hero_li_MA Organization MA Organization'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/hero_li_Submission Deadline'), 
    0)

'header Varified'
WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Cancel'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Next_Guided_Only'), 
    2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_a_Single Form'))

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_h2_Select Upload Type'), 
    'Select Upload Type')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_a_Guided Form'), 'GUIDED FORM')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_a_Single Form'), 'SINGLE FORM')

WebUI.scrollToPosition(0, 500)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_span_Medical Record'), 
    'Medical Record')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_span_Medical Record and CMS-Ge'), 
    'Medical Record and CMS-Generated Attestation')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_span_No Medical Record'), 
    'No Medical Record')

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Medical Record'))

WebUI.scrollToElement(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Choose a file or drag it'), 
    2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Choose a file or drag it'))


Runtime.getRuntime().exec(GlobalVariable.autoIT_firefox)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1000)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_outpatient_small_Physician Specialist Hospital Outpatient'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_Inpatient_small_Hospital Only(Admission  Discharge Dates)'), 
    0)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_outpatient_small_Physician Specialist Hospital Outpatient'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Date of Service'), 
    2)

WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitationM'), '02')

WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitationD'), '03')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_h2_Select visit type to fill out the dates'), 
    'Select visit type to fill out the dates')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_h2_If different update the enrollee information tp match the medical record'), 
    'If different, update the enrollee information to match the medical record')

WebUI.scrollToPosition(0, 1900)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Date of Birth'), 
    'Date of Birth')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientLastName'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientFirstName'), 
    2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientDOBm'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientDOBd'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientDOBy'), 
    2)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_h2_Select all the 20142015 CMS'), 
    'Select all the 2014/2015 CMS-HCCs that support this medical record')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'), 
    2)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Cancel'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Review'), 2)

