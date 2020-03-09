import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

int randomInt = new Random().nextInt((99 - 10) + 1) + 10

System.out.println(randomInt)

String username = 'plan-user' + randomInt.toString()

WebUI.delay(3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), username)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_3'))

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

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Outpatient'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitation'))

WebUI.delay(3)

WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitation'), '12-19')

WebUI.delay(2)

WebUI.scrollToPosition(0, 1900)

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'review page reached'
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Review'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(9)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/button_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/PopUp_button_Yes'))

WebUI.delay(3)

String coversheetID = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_3_CY YYYY Contract-Level RADV'))

System.out.println(coversheetID)

WebUI.delay(30)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_Log Out'))

WebUI.delay(3)

WebUI.waitForPageLoad(2)

int randomInt2 = new Random().nextInt((99 - 10) + 1) + 10

System.out.println(randomInt)

String username2 = 'mrrc2-user' + randomInt2.toString()

WebUI.delay(3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), username2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/TAB_a_Open'))

WebUI.delay(40)

2.times({ 
        // first request
        WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'))

        WebUI.delay(2)

        //WebUI.selectOptionByValue(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), '3: Object', false)
        WebUI.selectOptionByLabel(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), 'Submission Review', 
            false)

        WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'))

        WebUI.delay(2)

        WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Request Task'))

        WebUI.waitForPageLoad(9)

        WebUI.delay(40)
    })

WebUI.delay(3)

String coversheetID_SR = WebUI.getText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

System.out.println(coversheetID_SR)

WebUI.delay(6)

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/input_keyword_SearchBox'), coversheetID)

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/search_button_Search'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/hero_button_Submission'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_A medical record'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_A CMS-generated attestation'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/footer_Section/button_Complete'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/footer_Section/popup_button_Complete'))

WebUI.delay(6)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_Log Out'))

WebUI.delay(3)

WebUI.waitForPageLoad(2)

int randomInt3 = new Random().nextInt((99 - 10) + 1) + 10

print(randomInt)

String username3 = 'mrrc2-user' + randomInt3.toString()

WebUI.delay(3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), username3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/TAB_a_Open'))

WebUI.delay(20)

1.times({ 
        // first request
        WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'))

        WebUI.delay(2)

        //WebUI.selectOptionByValue(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), '3: Object', false)
        WebUI.selectOptionByLabel(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), 'Senior Evaluation', 
            false)

        WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'))

        WebUI.delay(2)

        WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Request Task'))

        WebUI.waitForPageLoad(9)

        WebUI.delay(40)
    })

WebUI.delay(3)

String coversheetID_SE = WebUI.getText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

System.out.println(coversheetID_SE)

WebUI.delay(6)

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/input_keyword_SearchBox'), coversheetID)

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/search_button_Search'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Hero_section/hero_button_Evaluate'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Hero_section/hero_a_View Submission'))

WebUI.delay(4)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_1_medicalRecord/section1_label_A medical record'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_2_Enter date of service/Section2_input_attestationStartDate'))

WebUI.delay(2)

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_2_Enter date of service/Section2_input_attestationStartDate'), 
    '12-19-2014')

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_3_Select all Relevant Issues/section3_label_No'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P3_Senior_Evaluation_Page/Evaluate_Section/Section_6_select_all_relevant_issues/section6_label_Q1_No'))

