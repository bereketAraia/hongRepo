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

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/button_Validate'))

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

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_h1_Invalid Confirmation'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_li_Coversheet ID CY YYYY Contract'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_a_View Submission'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_button_Details'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/button_Validate'), 
    0)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/validate_Text_h2_You must view the record before_View Sub_request'), 
    'You must view the record before you can review this task.')

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Hero_section/hero_a_View Submission'))

WebUI.delay(2)

'RM-598.1 : A CMS-Generated Attestation is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_div_Main_Box'), 
    0)

'RM-598.1 : '
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_h3_Check all that exists with this submission'), 
    0)

'RM-598.1 : A CMS-Generated Attestation is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_A CMS-Generated Attestation'), 
    0)

'RM-598.1 : A non-CMS-Generated Attestation is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_A non-CMS-Generated Attestation'), 
    0)

'RM-598.1 : NO Attestation is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_No Attestation'), 
    0)

'RM-598.1 : Medical Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_A medical record'), 
    0)

'RM-598.1 : No Medica Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_No medical record (INV 17)if selected'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_No medical record (INV 17)if selected'))

WebUI.delay(2)

'RM-598.1 : NO Attestation is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_No Attestation'), 
    0)

'RM-598.1 : Medical Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_A medical record'), 
    0)

'RM-598.1 : No Medica Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_No medical record (INV 17)if selected'), 
    0)

WebUI.delay(2)

'RM-599.1 : EXIT Button is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Exit'), 
    0)

'RM-598.1 : Medical Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Escalate'), 
    0)

'RM-598.1 : No Medica Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Save'), 
    0)

'RM-598.1 : No Medica Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Complete'), 
    0)

WebUI.delay(2)

'RM-599.2 : EXIT Button is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Exit'), 
    0)

'RM-599.2 : exit buton is clicked; pop up message is diplayed with options '
WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Exit'))

WebUI.delay(2)

'RM-598.1 : Medical Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/POP_UP_Modal/h4_Exit'), 
    0)

'RM-598.1 : No Medica Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/POP_UP_Modal/span_Save_icon-alert-close'), 
    0)

'RM-599.2 : Varify text "Are you sure you want to Exit? All information will be lost if you do not select Save before exiting the screen."'
WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/POP_UP_Modal/p_Are you sure you want to cancel ranking coversheets'), 
    'Are you sure you want to Exit? All information will be lost if you do not select Save before exiting the screen.')

'RM-599.3 : Button Continue Working is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/POP_UP_Modal/button_Continue Working'), 
    0)

'RM-599.3 : Button Dont Save is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/POP_UP_Modal/a_Dont Save'), 
    0)

'RM-599.3 : Button SAVE is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/POP_UP_Modal/a_Save'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/POP_UP_Modal/button_Continue Working'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_1_medicalRecord/section1_label_A medical record'))

WebUI.delay(2)

'RM-600.1 : General comment text is visible'
WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_8_general_comment/section8_label_Provide any general comment'), 
    'Provide any general comments you may have about this submission. (Optional)')

'RM-600.1 : General comment area is visible '
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_8_general_comment/section8_textarea_generalComment'), 
    0)

WebUI.delay(2)

'RM-598.1 : Medical Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_label_Attestation Date'), 
    0)

'RM-601.2 : No Medica Record is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_input_attestationDate'), 
    0)

'RM-601.1 : Varify the Title text'
WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_h3_Enter date of service found on the Attestation'), 
    'Enter date of service found on the attestation. *')

'RM-599.3 : Button Continue Working is visible'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_label_Attestation Date'), 
    0)

'RM-599.3 : Date is available'
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_input_attestationDate'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_input_attestationDate'))

WebUI.delay(2)

'RM-599.3 : WrongDate error'
WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_input_attestationDate'), 
    '12-21-2200')

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Footer_Section/footer_button_Complete'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_input_wrongDate_error'))

WebUI.delay(2)

