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

'Invoking Browser'
WebUI.openBrowser(GlobalVariable.ApplicationURL)

'Launch the url'
WebUI.maximizeWindow()

//WebUI.navigateToUrl(GlobalVariable.ApplicationURL)
WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user5)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_dropDown_button_CY XXXX'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_button_CY 2014 Contract-Level'))

WebUI.delay(2)

'escalation --check to see the cms logo is present'
WebUI.verifyElementPresent(findTestObject('test_folder/hong_test/Escalation/header/img-trumpet'), 0)

'RM-519.3'
WebUI.verifyElementPresent(findTestObject('test_folder/hong_test/Escalation/header/strong_Announcement_text'), 0)

'escalation --check to see the cms logo is present'
WebUI.verifyElementPresent(findTestObject('test_folder/hong_test/Escalation/header/span_Welcome to the Team Library _Paragraph'), 
    0)

WebUI.delay(2)

'RM-519.3'
WebUI.verifyElementPresent(findTestObject('test_folder/hong_test/Escalation/second_header/img_CMS Logo'), 0)

'escalation --check to see the cms logo is present'
WebUI.verifyElementPresent(findTestObject('test_folder/hong_test/Escalation/second_header/small_mrrc2 welcome to'), 0)

WebUI.verifyElementText(findTestObject('test_folder/hong_test/Escalation/second_header/small_mrrc2 welcome to'), 'mrrc2, welcome to')

'RM-519.3'
WebUI.verifyElementPresent(findTestObject('test_folder/hong_test/Escalation/second_header/strong_CY 2015 Contract-Level RADV'), 
    0)

'put text here \r\n'
WebUI.verifyElementText(findTestObject('test_folder/hong_test/Escalation/second_header/strong_CY 2015 Contract-Level RADV'), 
    'CY 2014 Contract-Level RADV')

