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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/CMS_LoGO_img'), 1)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/Text_strong_RADV CDAT'), 2)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/Text_h1_Login'), 2)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/Text_p_We use two-factor authentica'), 2)

WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Text_p_We use two-factor authentica'), 'We use Multi-Factor Authentication to protect your account. You can set up your Multi-Factor Authentication by selecting any of the following methods: Voice Authentication, Google Authenticator, or SMS Authentication. Depending on the selected method, this will include a passcode entry that will be received via a phone call, opening the Google Authenticator app, or via text message.')

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/label_Username'), 2)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), 2)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/label_Password'), 2)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), 2)

//String expectedPlaceholder = 'Enter Username'
//String placeholder = WebUI.getAttribute('USER_Management/P0_Login_Page_Global/input_username (1)', 'placeholder')
//if (expectedPlaceholder != placeholder) {
//   KeywordUtil.equals('Placeholder is not as expected.')}
'RM-92.1 : Forgot password link'
WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/Link_a_Forgot Password'), 2)

WebUI.verifyElementPresent(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'), 2)

WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Text_p_You are accessing a U.S. Gov'), 'You are accessing a U.S. Government information system, which includes: (1) this computer, (2) this computer network, (3) all computers connected to this network, and (4) all devices and storage media attached to this network or to a computer on this network. This information system is provided for U.S. Government - authorized use only. Unauthorized or improper use of this system may result in disciplinary action, as well as civil and criminal penalties. By using this information system, you understand and consent to the following:')

WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Text_p_You have no reasonable expectation'), 
    'You have no reasonable expectation of privacy regarding any communication or data transiting or stored on this information system. At any time, and for any lawful Government purpose, the Government may monitor, intercept, and search and seize any communication or data transiting or stored on this information system. Any communication or data transiting or stored on this information system may be disclosed or used for any lawful Government purpose.')

WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Text_p_INFORMATION NOT RELEASABLE TO THE PUBLIC'), 
    'INFORMATION NOT RELEASABLE TO THE PUBLIC UNLESS AUTHORIZED BY LAW: This information has not been publicly disclosed and may be privileged and confidential. It is for internal government use only and must not be disseminated, distributed, or copied to persons not authorized to receive the information.')

WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Text_strong_RADV CDAT'), 'RADV CDAT')

WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Text_h1_Login'), 'Login')

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'), FailureHandling.STOP_ON_FAILURE)

'RM-90.1  and RM-89.1 : userName is required '
WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Error_Msg_small_Username is required'), 'Username is required')

'RM-90.1 and RM-89.1 : password is required '
WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Error_Msg_small_Password is required'), 'Password is required')

WebUI.delay(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), 'fake-test-user2')

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), 'fake-password')

WebUI.delay(2)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(2)

'RM-89.4 and RM-90.3'
WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Error_Msg_Username or password entered'), 'The username and/or password entered is not valid. After two more failed attempts your account will be locked for 60 minutes. Please try again.')

WebUI.delay(2)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(2)

'RM-89.6 and RM-90.4'
WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Error_Msg_Username or password entered'), 'The username and/or password entered is not valid. After one more failed attempt, your account will be locked for 60 minutes. Please select the Forgot Password link to change your password now or submit a support ticket to the RADV Help Desk')

WebUI.delay(4)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(2)

'RM-89.6 and RM-90.5'
WebUI.verifyElementText(findTestObject('USER_Management/P0_Login_Page_Global/Error_Msg_Username or password entered'), 'Your account is locked. Please try again after 60 minutes or submit a support ticket to the RADV Help Desk.')

WebUI.delay(3)

