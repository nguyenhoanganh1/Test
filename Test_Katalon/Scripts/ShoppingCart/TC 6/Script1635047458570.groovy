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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:44368/')

WebUI.click(findTestObject('Page_Home Page - My ASP.NET Application/a_Ti khon'))

WebUI.click(findTestObject('Page_Home Page - My ASP.NET Application/a_ng nhp'))

WebUI.setText(findTestObject('Page_Login - My ASP.NET Application/input_Email_email'), 'anatr@gmail.com')

WebUI.setText(findTestObject('Page_Login - My ASP.NET Application/input_Password_password'), 'anatr')

WebUI.click(findTestObject('Page_Login - My ASP.NET Application/input_Remember me_remember'))

WebUI.click(findTestObject('Page_Login - My ASP.NET Application/button_ng nhp'))

WebUI.click(findTestObject('Page_Home Page - My ASP.NET Application/button_Aniseed Syrup_btn btn-primary glyphicon glyphicon-shopping-cart add-to-cart'))

WebUI.waitForAlert(3)

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText, 'Thêm vào giỏ hàng thành công', false)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home Page - My ASP.NET Application/button_Aniseed Syrup_btn btn-primary glyphicon glyphicon-shopping-cart add-to-cart'))

WebUI.waitForAlert(3)

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText, 'Thêm vào giỏ hàng thành công', false)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home Page - My ASP.NET Application/a_Gi hng'))

quantity = WebUI.getText(findTestObject('Page_ShowCart - My ASP.NET Application/li_2'))

WebUI.verifyMatch(quantity, '2', false)

WebUI.closeBrowser()

