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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.iccEditor10)

WebUI.clearText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'))

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_CMS_LOGO_img'), 0)

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

'header Varified'
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ESCALATION/QA_PANEL/h1_QA Panel'), 'QA Panel')

WebUI.verifyElementText(findTestObject('ESCALATION/QA_PANEL/button_CY YYYY Contract-Level'), 'CY 2015 CONTRACT-LEVEL RADV')

WebUI.click(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_CurrentChoice_button_CY YYYY Contract-Level'))

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_button_CY 2013 Contract-Level'), 
    'CY 2013 Contract-Level RADV')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ESCALATION/QA_PANEL/h5_Status'), 'Status:')

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/filter_button_Open'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/filter_button_QA Reset'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/filter_button_Complete'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ESCALATION/QA_PANEL/h5_Step'), 'Step:')

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/filter_button_Submission Review'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/filter_button_Senior Evaluation'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/filter_button_Invalid Confirmation'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/filter_button_Focused Review'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/filter_button_Discrepant Confirmation'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/QA_PANEL/button_Clear Filters'))

WebUI.delay(3)

WebUI.click(findTestObject('ESCALATION/QA_PANEL/filter_button_Submission Review'))

