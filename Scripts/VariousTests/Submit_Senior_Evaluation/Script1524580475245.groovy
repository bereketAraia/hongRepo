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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc2user51)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

for (int count = 5; count > 0; count--) {
    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/button_Senior Evaluation_filter'))

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Hero_section/hero_a_View Submission'))

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Hero_section/hero_button_Evaluate'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_2_Enter date of service/input_attestationDate'), 
        '12-19-2014')

    WebUI.delay(2)

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_No medical record (INV 17)if selected'))

    WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_textarea_medicalRecordComment'), 
        'hello senior  test')

    WebUI.scrollToPosition(0, 200)

    WebUI.delay(2)

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_A medical record'))

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_3_Select all Relevant Issues/section3_label_No'))

    WebUI.scrollToPosition(0, 1200)

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_6_select_all_relevant_issues/section6_label_Q1_No'))

    WebUI.delay(0)

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_7_INV_Choices/section7_a_I would like to mark all as YES'))

    WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_8_general_comment/section8_textarea_generalComment'), 
        'general comment')

    WebUI.delay(3)

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Footer_Section/footer_button_Save'))

    WebUI.delay(2)

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Footer_Section/footer_button_Complete'))

    WebUI.delay(2)

    WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Footer_Section/popup_button_Complete'))
}

