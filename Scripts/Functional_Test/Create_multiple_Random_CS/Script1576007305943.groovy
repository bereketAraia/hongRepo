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

5.times{
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

//Runtime.getRuntime().exec(GlobalVariable.autoIT_firefox)
//Runtime.getRuntime().exec('C:\\Automation\\ci-Radv\\Data Files\\fileUpload_chrome.exe')

//WebUI.uploadFile(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/label_Choose a file or drag it'), 'C:\\Automation\\ci-Radv\\DataFiles\\GoodPDFfile.pdf')

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

}