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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc3user50)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

//WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/filter_button_Focused Review'))
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'), 0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_button_Validate'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section1_DivBox_Audited CMS-HCCs that CMS expects'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section2_You must view the record before you can review this task'), 
    0)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section2_h2_You must view the record before'),
	'You must view the record before you can review this task.')

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_a_View Submission'))

//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section3_Found CMS-HCCs in this submission'), 0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section4_Provide any general comment you may'), 
    0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section1_h2_Audited CMS-HCCs that CMS'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section1_button_Minimize Section'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section1_h3_Select an HCC to view the a'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section1_button_HCC_firstButton'), 
    0)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section3_h2_Found CMS-HCCs in this submission'), 
    'Found CMS-HCCs in this submission')

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section3_p_Enter ICD-9 codes found in the medical record'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section3_label_No ICD-9 codes found in this submission'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Footer_Section/button_Complete'))

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section3_label_No ICD-9 codes found in this submission'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Footer_Section/button_Complete'))

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section3_ERROR_small_Comments are required.'), 
    'Comments are required.')

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section3_textarea_noICDsComment'), 
    'testers comment')

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Validate_Section/section4_Provide any general comment you may'), 
    'Provide any general comments you may have about this submission. (Optional)')

