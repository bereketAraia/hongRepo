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

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory



WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

int randomInt = new Random().nextInt((99 - 10) + 1) + 10

System.out.println(randomInt)

String username = 'plan-user' + randomInt.toString()

WebUI.delay(3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), username)

//WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.planuser147)

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

/*

WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_input_keyword'), 'perry')

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_button_span_icon-search'))

WebUI.delay(4)
*/

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_1'))

WebUI.delay(2)

/*
 * WebUI.waitForAngularLoad(4)

WebUI.scrollToPosition(0, 500)

String csName = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_3_CY YYYY Contract-Level RADV'))

WebUI.delay(4)

System.out.println(csName)
*/
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
/*
browserName=DriverFactory.getExecutedBrowser().getName()

if (browserName=="FIREFOX_DRIVER"){
Runtime.getRuntime().exec(GlobalVariable.autoIT_chrome)
} else {
Runtime.getRuntime().exec(GlobalVariable.autoIT_firefox)
WebUI.delay(2)
}
*/
WebUI.scrollToPosition(0, 1000)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_outpatient_small_Physician Specialist Hospital Outpatient'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_Inpatient_small_Hospital Only(Admission  Discharge Dates)'), 
    0)


/*
browserName=DriverFactory.getExecutedBrowser().getName()
if (browserName=="FIREFOX_DRIVER"){
WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitation'), '2017-10-31')
} else {
  WebUI.sendKeys(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitation'), Keys.chord('10-31-2017', Keys.ENTER, Keys.TAB))
}

WebUI.sendKeys(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/input_patientVisitation'), '05/05/2014' as String)
*/

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

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/Text_h2_Select all the 20142015 CMS'), 
    'Select all the 2013/2014 CMS-HCCs that support this medical record *')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'), 
    2)

WebUI.delay(3)

'RM-60.1 : atleast one HCC must be selected '
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/HCC_Tab1_label_HCC0000 (Part of a hierarchy)'), 
    FailureHandling.STOP_ON_FAILURE)

'review page reached'
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P5_Medical_Record_coversheet_Page/button_Review'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'header Varified'
WebUI.delay(2)

WebUI.scrollToPosition(0, 200)

'hero part Varified'
WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P6_Review_Coversheet_Page/button_Submit'))

WebUI.delay(7)

