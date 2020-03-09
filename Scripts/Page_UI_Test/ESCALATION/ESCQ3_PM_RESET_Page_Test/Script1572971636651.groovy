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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2pm10)

WebUI.clearText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'))

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_dropDown_button_CY XXXX'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_button_CY 2015 Contract-Level'))

WebUI.delay(2)

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

WebUI.verifyElementText(findTestObject('ESCALATION/PM_RESET/h1_PM Reset'), 'PM Reset')

WebUI.verifyElementText(findTestObject('ESCALATION/PM_RESET/button_CY YYYY Contract-Level-Active'), 'CY 2015 CONTRACT-LEVEL RADV')

WebUI.click(findTestObject('ESCALATION/PM_RESET/button_CY YYYY Contract-Level-Active'))

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_button_CY 2015 Contract-Level'), 
    'CY 2015 Contract-Level RADV')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ESCALATION/PM_RESET/h5_Step'), 'Step:')

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Submission Review'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Senior Evaluation'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Invalid Confirmation'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Focused Review'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Clear Filters'))

WebUI.verifyElementPresent(findTestObject('ESCALATION/PM_RESET/input_keyword'), 2)

WebUI.verifyElementPresent(findTestObject('ESCALATION/PM_RESET/span_icon-question-circle'), 2)

WebUI.verifyElementPresent(findTestObject('ESCALATION/PM_RESET/span_icon-search'), 2)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Username_TH'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Coversheet ID_TH'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Enrollee ID_TH'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_HMOID_TH'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Step_TH'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/button_Date Requested_TH'))

WebUI.verifyElementText(findTestObject('ESCALATION/PM_RESET/th_Reset_TH'), 'RESET')

WebUI.delay(4)

WebUI.click(findTestObject('ESCALATION/PM_RESET/button_Submission Review'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ESCALATION/PM_RESET/td_row1_STEP'), 'Submission Review')

WebUI.verifyElementPresent(findTestObject('ESCALATION/PM_RESET/td_row1_username'), 0)

WebUI.verifyElementPresent(findTestObject('ESCALATION/PM_RESET/td_row1_CoversheetID'), 0)

WebUI.verifyElementPresent(findTestObject('ESCALATION/PM_RESET/td_row1_EnrolleeID'), 0)

WebUI.verifyElementPresent(findTestObject('ESCALATION/PM_RESET/td_row1_HMOID'), 0)

WebUI.verifyElementPresent(findTestObject('ESCALATION/PM_RESET/td_row1_dateRequested'), 0)

WebUI.verifyElementClickable(findTestObject('ESCALATION/PM_RESET/td_row1_button_Reset Submission'))

