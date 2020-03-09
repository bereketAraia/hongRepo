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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_dropDown_button_CY XXXX'))

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_button_CY 2015 Contract-Level'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_a_Open (11)'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'), 
    0)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Table_1st Contract on table'))

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

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_h1_Discrepant Confirmation'), 
    'Discrepant Confirmation')

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_li_Coversheet ID CY YYYY Contract'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_li_CHIC 0000000000'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_li_RRBHIC 0000000000'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_a_View Submission'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_button_Details'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Hero_Section/hero_button_Validate'), 
    0)

WebUI.delay(2)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Hero_Section/hero_button_Details'))

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/detail_li_Enrollee ID'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/detail_li_Name last first'), 
    0)

//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Detail_Section/detail__li_Enrollee ID 00000000'), 0)
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/detail_li_DOB'), 
    0)

//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Detail_Section/detail__li_Enrollee ID 00000000'), 0)
WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/detail_li_Provider Type'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/detail_li_Date of Service Start'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/detail_li_Date of Service End'), 
    0)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/filter_h5_Filters'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/filter_button_Submission Review'), 
    0)

//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P5_Focused_Review_Page/Detail_Section/detail_button_Senior Evaluation'), 0)
WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/commentBox_select_Newest to Oldest'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/CommetnBox_h2_Timeline'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/commentBox1_h3_task_step'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/commentBox1_img'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/commentBox1_p_Submitted by'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Details_Section/commentBox_a_Expand All'), 
    0)

//WebUI.delay(2)
//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/TimeLine_header_2'), 0)
//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/TimeLine_img_2'), 0)
//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/TimeLine_Text_2_h3'), 0)
//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/TimeLine_Time_2_MMDDYYYY HHMM PM EDT'),
//   0)
//WebUI.delay(2)
//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/Tab_a_Expand All'), 0)
//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/Tab_a_Minimize All'), 0)
//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/Comment_section_1'), 0)
//WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P2_Review_Submission_Page/Details_Tab/Comment_section_2'), 0)
WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P6_Discrepant_Confirmation_Page/Footer_Section/button_Exit'), 
    0)

WebUI.delay(2)

