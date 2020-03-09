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

String username = 'mrrc2-user' + randomInt.toString()

//String username = 'mrrc2-user17'

WebUI.delay(3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), username)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/TAB_a_Open'))

WebUI.delay(40)

1.times({
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

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/input_keyword_SearchBox'), coversheetID_SR)

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/search_button_Search'))

WebUI.delay(3)

1.times({

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

})

WebUI.delay(6)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/Tab_a_Log Out'))

