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

int randomInt3 = new Random().nextInt((99 - 10) + 1) + 10

System.println(randomInt3)

//String username3 = 'mrrc2-user' + randomInt3.toString()
String username3 = 'mrrc3-user17'

WebUI.delay(3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), username3)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/TAB_a_Open'))

WebUI.delay(20)


1.times({
		// first request
		WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'))

		WebUI.delay(2)

		//WebUI.selectOptionByValue(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), '3: Object', false)
		WebUI.selectOptionByLabel(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'), 'Discrepant Confirmation',
			false)

		WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/select_Select Step'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Request Task'))

		WebUI.waitForPageLoad(9)

		WebUI.delay(10)
	})

WebUI.delay(3)

String coversheetID_FR = WebUI.getText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

System.out.println('Focused Review CS is : ' + coversheetID_FR)

WebUI.delay(6)

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/input_keyword_SearchBox'), coversheetID_FR)

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/search_button_Search'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Hero_Section/hero_button_Code MR'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Hero_Section/hero_a_View Submission'))

WebUI.delay(4)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_label_No ICD-9 codes found in this submission'))

WebUI.delay(3)

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_textarea_noICDsComment'),
	'testing focused review')

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_Found CMS-HCCs in this submission'))

/*
WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_2_Enter date of service/Section2_input_attestationStartDate'),
	'12-19-2014')

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_3_Select all Relevant Issues/section3_label_No'))

WebUI.delay(2)

//section 6
WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_6_select_all_relevant_issues/section6_label_No'))

// section 7
WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_7_INV_Choices/section7_a_I would like to mark all as YES'))

//final comment section
WebUI.delay(2)

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P4_Invalid_Confirmation_Page/Validate_Section/Section_8_general_comment/section8_textarea_generalComment'),
	'submit senior eval for testing ')
*/
//click complete
WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Footer_Section/button_Complete'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/POP_UP_Modal/button_Complete_popup'))

