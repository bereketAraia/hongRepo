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

WebUI.navigateToUrl(GlobalVariable.APP_IVV)

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.stPlanUser2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.ivv_password)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(5)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

//WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 IVV Smoke Test Sample'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(3)

'RM - 40.1  list of enrollee is viewed when contract selected '
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Icon_Announcement_img'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Text_strong_Announcement'), 
    0)

'top alert varified'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Alert_Text_span_CDAT is the Official System of Record for the Calender'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/CMS_logo_img'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Header_strong_RADV CDAT CY 2015'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Header_a_Plan Library'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Header_a_My Account'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Header_a_Log Out'), 0)

WebUI.delay(2)

'RM - 40.9 : return back to plan portal screen'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_Back To  Plan Portal'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Title_h1_List of Enrollees'), 0)

'RM - 40.2  current HMOID is present'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/li_Current HMOID H0003'), 0)

'RM-40.2 - Sample Year is present '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/li_Sample Year HMOID H0003'), 0)

'RM - 40.2  - MA Contract present '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/li_MA Contract  Contract 0003'), 
    0)

'RM - 40.2 - MA Organization is present '
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/li_MA Organization MA Organiza'), 
    2)

'RM - 40.2 : Submission Deadline'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/p_Submission Deadline 12302018'), 
    0)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/StatusBar_div_0 Complete'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/StatusBar_li_00 Not Started'), 
    2)

//WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/StatusBar_li_00 In Progress'), 2)
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/StatusBar_h5_00 Total Enrollees'), 
    2)

WebUI.delay(5)

'RM - 40.7 : filter options : Fliters '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/h5_Progress Filters'), 'Progress Filters:')

'RM - 40.7 : filter options : Marked as Progress'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_Marked as Complete'), 2)

'RM - 40.7 : filter options : In Progress'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_In Progress'), 0)

'RM - 40.7 : filter options : Not Started'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_Not Started'), 0)

'RM - 40.7 : filter options : Issues :Text'
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/h5_Issue Filters'), 'Issue Filters:')

'RM - 40.7 : filter options :YES'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_Yes'), 2)

'RM - 40.7 : filter options :NO'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_No'), 0)

'RM-40.4 : search by Name or Enrollee ID'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_input_keyword'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_button_span_icon-search'), 
    0)

WebUI.delay(3)

'RM -40.2  : Progress column is present '
WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_Progress'), 'PROGRESS')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_Name'), 0)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_DOB'), 'DOB')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_Issue'), 'ISSUE')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_File Format Issue'), 'FILE FORMAT ISSUE')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_More'), 'MORE')

WebUI.delay(3)

'RM - 40.3 : sort through columns'
WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_Progress'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_DOB'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/th_Enrollee ID'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_OpenArrow_span_icon-arrow-down'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_title_h4_Coversheets'), 'COVERSHEETS')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_Text_strong_Submitted'), 'Submitted:')

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_Text_strong_Available'), 'Available:')

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_CY YYYY_ CMS HCC Title strong_Available'), 
    0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_HCC-1_Title_span_HCC'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_HCC-1_span_0 coversheeets associated'), 
    0)

WebUI.scrollToPosition(0, 2000)

//WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_HCC-2_Title_span_HCC'), 0)
//WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/More_HCC-2_span_0 coversheeets associated'),  0)
'bottom part'
WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Bottom_button_Previous'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Bottom_button_First'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Bottom_button_1'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Bottom_button_2'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Bottom_button_Last'), 0)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Bottom_button_Next'), 0)

WebUI.delay(3)

'RM-43.1 : return to plan portal '
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_Back To  Plan Portal'))

WebUI.delay(2)

