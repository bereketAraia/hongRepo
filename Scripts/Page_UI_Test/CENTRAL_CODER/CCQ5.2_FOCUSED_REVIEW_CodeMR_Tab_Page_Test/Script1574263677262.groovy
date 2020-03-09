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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user50)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_dropDown_button_CY XXXX'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_button_CY 2015 Contract-Level'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_a_Open (11)'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/button_Focused Review_filter'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'), 
    5)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Hero_Section/hero_button_Code MR'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section1_Audited CMS-HCCs that CMS expects'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section2_You must view the record before you can review this task'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_Found CMS-HCCs in this submission'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section4_Provide any general comment you may'), 
    0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section1_h2_Audited CMS-HCCs that CMS'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section1_h3_Select an HCC to view the a'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section1_button_HCC_firstButton'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section1_button_Minimize Section'), 
    0)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section2_h2_You must view the record before'), 
    'You must view the record before you can review this task.')

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Hero_Section/hero_a_View Submission'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 900)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_h2_Found CMS-HCCs in this submission'), 
    'Found CMS-HCCs in this submission')

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_p_Enter ICD-9 codes found in the medical record'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_button_Open Encoder Tool'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_label_No ICD-9 codes found in this submission'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_label_No ICD-9 codes found in this submission'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_textarea_noICDsComment'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Footer_Section/button_Complete'))

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_ERROR_small_Comments are required.'), 
    'Comments are required.')

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_label_No ICD-9 codes found in this submission'))

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section3_ERROR_small_You have indicated that'), 
    'You have indicated that there are no ICD-9 codes for this record. If this is true, select "No ICD-9 codes found in the submission" otherwise enter ICD-9 codes.')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section4_label_Provide any general comm'), 
    'Provide any general comments you may have about this submission. (Optional)')

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/CodeMR_Tab_Section/section4_textarea_generalComments'), 
    0)

