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


WebUI.openBrowser('https://qa.cms.radvcdat.com/login')

WebUI.maximizeWindow()

//WebUI.navigateToUrl()

WebUI.setText(findTestObject('Object Repository/AccountRegister/MFA_Login/input_Username_username'), 'TNUP')

//WebUI.setEncryptedText(findTestObject('Object Repository/AccountRegister/MFA_Login/input_Password_password'), 'Px0guoBikdgmsljwL/SIO1MapgOUMgG9')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/AccountRegister/MFA_Login/input_Password_password'), 'vxeU9Vs/?N/%"Enp')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AccountRegister/MFA_Login/button_Log In'))

WebUI.setText(findTestObject('Object Repository/AccountRegister/MFA_Login/input_Passcode_mfaVerifyInput'), CustomKeywords.'mfa.readMFA.GetMFAToken'())

WebUI.click(findTestObject('Object Repository/AccountRegister/MFA_Login/button_Verify'))

WebUI.delay(3)

WebUI.closeBrowser()

