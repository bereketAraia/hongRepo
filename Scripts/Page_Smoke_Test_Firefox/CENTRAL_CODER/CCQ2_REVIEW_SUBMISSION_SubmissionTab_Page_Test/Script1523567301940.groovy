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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user20)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/filter_button_Submission Review'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'), 0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/hero_button_Submission'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_small_mrrc_X_ welcome to'), 0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_strong_RADV CDAT CY YYYY'), 0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_Team Library'), 0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_My Account'), 0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_Log Out'), 0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_MAIN_DIV_sticky_Check all that exists_div'), 
    0)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_h2_Check all that exists with'), 
    'Check all that exists with this submission.')

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_A CMS-generated attestation'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_A non-CMS-generated attestation'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_No attestation'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_A medical record'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Submission_Tab/MedRecord_Section/Section1_label_No medical record'), 
    0)

