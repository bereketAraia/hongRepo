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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.planuser51)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(5)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(3)

String name = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_3 - ENROLLEE_ID'))

WebUI.delay(2)

WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_input_keyword'), 'Bereket')

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_button_span_icon-search'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/p_No results found.'), 2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_Clear Filters'))

WebUI.delay(2)

// input the name from the enrollee list 
WebUI.setText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_input_keyword'), name)

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Search_button_span_icon-search'))

WebUI.delay(2)

String name2 = WebUI.getText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_1 - ENROLLEE_ID'))

WebUI.verifyMatch(name, name2, false)


WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/button_Clear Filters'))

WebUI.delay(4)

/////////////////////////////////////////////

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebDriver driver = DriverFactory.getWebDriver()
'Expected value from Table'
String ExpectedValue = "289160_23";
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
println('Text present in row number 2 is: ' + Columns_row.get(1).getText())

'After getting the Expected value from Table we will Terminate the loop'
break Loop;
}
}
}

///////////////////////////////////////////////////////