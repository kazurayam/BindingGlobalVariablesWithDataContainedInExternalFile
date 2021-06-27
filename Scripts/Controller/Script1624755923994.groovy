import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

GlobalVariable.username = username
GlobalVariable.password = password
GlobalVariable.email = email

WebUI.callTestCase(findTestCase("Test Cases/TC1"), [:])
WebUI.callTestCase(findTestCase("Test Cases/TC2"), [:])
