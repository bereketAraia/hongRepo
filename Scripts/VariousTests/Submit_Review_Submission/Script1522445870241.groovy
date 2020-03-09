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

//WebUI.delay(2)
WebUI.waitForAngularLoad(4)

WebUI.scrollToPosition(0, 500)

csName = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_3_CY YYYY Contract-Level RADV'))

WebUI.delay(4)

println(csName)

//WebUI.openBrowser('')
//WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc2user55)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_mrrc_QA)

WebUI.delay(2)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_dropDown_button_CY XXXX'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

// WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/filter_button_Submission Review'))
//def coversheet_ID = WebUI.getText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/td_1_coversheet_ID'))
def submissionDate = WebUI.getText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/td_1_Submission_Date'))

def stepType = WebUI.getText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/td_1__STEP'))

def openCount = WebUI.getText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero_Tab_a_Open ()'))

//for (int count = 5; count > 0; count--) {
// if (stepType == 'Submission Review') {
//println('submission review')
//WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/filter_button_Submission Review'))
WebUI.delay(4)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/hero_button_Submission'))

WebUI.delay(6)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_A CMS-generated attestation'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_A medical record'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_A non-CMS-generated attestation'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_textarea_comments'))

WebUI.delay(2)

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_textarea_comments'), 
    'hello submission test')

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/Article_pages/article1_button_90 CW'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/Article_pages/article1_button_180'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/footer_Section/button_Complete'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/footer_Section/popup_button_Complete'))

WebUI.delay(2)

