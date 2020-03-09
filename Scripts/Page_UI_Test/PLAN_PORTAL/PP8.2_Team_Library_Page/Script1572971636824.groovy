import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user18)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

if (WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/h1_Login_pageTitle'), 'Login')) {
    WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

    WebUI.delay(3)

    WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))
} else {
    WebUI.delay(3)

    WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero_h1_Central Coder Queue'))
}

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'RM_2771.1'
WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_Team Library'))

WebUI.delay(3)

'RM 277.2 Check Title'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/LIBRARY_Plan_Team_Library_Page/button_Title'), 'TITLE')

'RM 277.2 Check DEscription'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/LIBRARY_Plan_Team_Library_Page/button_Description'), 'DESCRIPTION')

'RM 277.2 check upload Date'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/LIBRARY_Plan_Team_Library_Page/button_Upload Date'), 0)

WebUI.delay(3)

'RM  check if Back to CCQ is working'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/LIBRARY_Plan_Team_Library_Page/button_Back To Central Coder Queue'), 
    'Back To Central Coder Queue')

