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


import org.openqa.selenium.By as By

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user6)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(5)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

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

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_h1_Escalation Senior Coder Queue'), 
    'Escalation Senior Coder Queue')

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_CurrentChoice_button_CY YYYY Contract-Level'), 
    'CY 2015 CONTRACT-LEVEL RADV')

WebUI.click(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_CurrentChoice_button_CY YYYY Contract-Level'))

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_button_CY 2013 Contract-Level'), 
    'CY 2013 Contract-Level RADV')

WebUI.verifyElementPresent(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_Open (x)'), 
    2)

WebUI.click(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_Open (x)'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_In QA Panel (x)'), 
    3)

WebUI.mouseOver(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_In QA Panel (x)'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_In QA Panel (x)'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Taba_Completed (x)'), 
    3)

WebUI.mouseOver(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Taba_Completed (x)'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Taba_Completed (x)'))

WebUI.delay(2)

WebUI.click(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_Open (x)'))

WebUI.delay(5)

"Varify the table content"

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_Escalation Case ID'), 
    'ESCALATION CASE ID')

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_Coversheet ID'), 
    'COVERSHEET ID')

WebUI.verifyElementPresent(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_Date Escalated'), 
    0)

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_Step'), 
    'STEP')

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_More'), 
    'MORE')

WebUI.delay(4)

WebUI.verifyElementClickable(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Footer_Section/footer_button_Request Escalation'))

WebUI.mouseOver(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Footer_Section/footer_button_Request Escalation'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Footer_Section/footer_a_Search all escalation cases'), 
    FailureHandling.CONTINUE_ON_FAILURE)



//WebUI.openBrowser('D:\\\\Katalon Tutorial\\\\Katalon Tutorial\\\\WebTable_Handling_Scenario1.html')

//WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()
'Expected value from Table'
String ExpectedValue = "Senior Evaluation";
'To locate table'
WebElement Table = driver.findElement(By.xpath("//table/tbody"))
'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
'To calculate no of rows In table'
int rows_count = rows_table.size()

'Loop will execute for all the rows of the table'
Loop:
for (int row = 0; row < rows_count; row++) {
'To locate columns(cells) of that specific row'
List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

'To calculate no of columns(cells) In that specific row'
int columns_count = Columns_row.size()

println((('Number of cells In Row ' + row) + ' are ') + columns_count)

'Loop will execute till the last cell of that specific row'
for (int column = 0; column < columns_count; column++) {
'It will retrieve text from each cell'
String celltext = Columns_row.get(column).getText()

println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)

'Checking if Cell text is matching with the expected value'
if (celltext == ExpectedValue) {
'Getting the Country Name if cell text i.e Company name matches with Expected value'
println('Text present in row number 3 is: ' + Columns_row.get(2).getText())

'After getting the Expected value from Table we will Terminate the loop'
break Loop;
}
}
}
