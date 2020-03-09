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

'open browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.planuser15)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2013 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

//def contraact_Name = getCellText(findTestObject('Object Repository/PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/table_contract'), 2, 2)
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(3)

def enrollee_Name = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_3'))

def enrollee_DOB = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_3 - DOB '))

def enrollee_ID = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_3 - ENROLLEE_ID'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_3'))

def enrollee_HCC1 = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/button_HCC-first'))

WebUI.mouseOver(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_div_Add Coversheet'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/bottom_a_Single'))

//WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Tab_a_Guided Form'))
WebUI.delay(2)

WebUI.scrollToPosition(0, 700)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Medical Record'))

//WebUI.scrollToElement(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Choose a file or drag it'), 2)
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Choose a file or drag it'))

//autoit_prj = 'C:\\eclipse-workspace\\RADVe2eTest\\Resources\\TestUploadFiles\\chromeFileUploadLocal.exe'
Runtime.getRuntime().exec(GlobalVariable.autoIT_chrome)

WebUI.delay(4)

def uploadedFile_Name = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_GoodPDFfile.pdf'))

WebUI.scrollToPosition(0, 1000)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_outpatient_small_Physician Specialist Hospital Outpatient'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_Inpatient_small_Hospital Only(Admission  Discharge Dates)'), 
    0)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_outpatient_small_Physician Specialist Hospital Outpatient'), 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Date of Service'), 2)
WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitationM'), '02')

WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitationD'), '03')

WebUI.scrollToPosition(0, 1900)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_h2_Select all the 20142015 CMS'), 
    'Select all the 2014/2015 CMS-HCCs that support this medical record')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'), 
    2)

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'), 
    FailureHandling.STOP_ON_FAILURE)

'review page reached'
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Review'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'varify patients first and last name'
def hero_Name = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_Name Last First'))

def detail_Name = 'NAME: ' + WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_Last_FirstName'))

WebUI.verifyMatch(hero_Name, detail_Name, false)

'varify enrollee\'s DOB'
def hero_DOB = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_DOB MMDDYYYY'))

def detail_DOB = 'DOB: ' + WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_MMDDYYYY'))

WebUI.verifyMatch(hero_DOB, detail_DOB, false)

//def ListOfEnrolleeTable_DOB = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/hero_li_DOB MMDDYYYY'))
'varify enrollee\'s DOB from table'
def detail_DOB_raw = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_MMDDYYYY'))

WebUI.verifyMatch(enrollee_DOB, detail_DOB_raw, false)

'varify hcc codes from table'
def detail_HCC_Code = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_p_HCC 00000'))

WebUI.verifyMatch(enrollee_HCC1, detail_HCC_Code, false)

'varify upload file name'
def Review_uploadFile_Name = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/Text_Link_h3_medicalRecord_File.pdf'))

WebUI.verifyMatch(uploadedFile_Name, Review_uploadFile_Name, false)

