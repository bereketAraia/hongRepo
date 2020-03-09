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

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/button_Senior Evaluation_filter'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Hero_section/hero_button_Evaluate'))

WebUI.delay(2)

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

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/evaluate_Text_h2_You must view the record '), 
    'You must view the record before you can review this task.')

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Hero_section/hero_a_View Submission'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_div_Main_Box'), 
    0)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_h3_Check all that exists with this submission'), 
    'Check all that exists with this submission. *')

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_A CMS-Generated Attestation'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_A non-CMS-Generated Attestation'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_No Attestation'), 
    0)

'RM-574.1 : EMR option is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_A medical record'), 
    0)

//'RM-574.1 : EMR option is selected'
//WebUI.verifyElementChecked(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_A medical record-checkMark'), 0)
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_No medical record (INV 17)if selected'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_No medical record (INV 17)if selected'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_textarea_medicalRecordComment'), 
    3)

'RM-589.1 '
WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Footer_Section/footer_button_Complete'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_small_Error Please enter a comment'), 
    'Error: Please enter a comment.')

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_A medical record'))

