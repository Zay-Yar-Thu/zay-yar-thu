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

WebUI.navigateToUrl('https://www.fazwaz.com/property-for-sale/thailand')

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Thailand - FazWaz/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Thailand - FazWaz/button_No Thanks'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Property for Sale in Thailand - FazWaz/h1_Property for sale in Thailand'), 
    'Property for sale in Thailand')

WebUI.doubleClick(findTestObject('Page_Property for Sale in Thailand - FazWaz/input_MMK - Kyats (Lakh)_auto-complete-sear_800c28'))

WebUI.sendKeys(findTestObject('Page_Property for Sale in Thailand - FazWaz/input_MMK - Kyats (Lakh)_auto-complete-sear_800c28'), 
    'testing')

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Page_Property for Sale in Thailand - FazWaz/input_MMK - Kyats (Lakh)_auto-complete-sear_800c28'))

WebUI.sendKeys(findTestObject('Page_Property for Sale in Thailand - FazWaz/input_MMK - Kyats (Lakh)_auto-complete-sear_800c28'), 
    'pathum')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Thailand - FazWaz/div_Pathum Thani                           _aac5e7'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/a_Any Price'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/input'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/li_K20,000 Lakhs'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/a_Beds'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/span_Use exact match_checkmark'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/div_1'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/div_2'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/div_3'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/div_Studio'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/a_Beds (1,2,3)'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/a_Features'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/button_Private Garden'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/button_View 121 Properties'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/a_More'))

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/span_Completed'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/button_View 117 Properties'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/h1_Property for sale in Pathum Thani'), 
    'Property for sale in Pathum Thani')

WebUI.click(findTestObject('Object Repository/Page_Property for Sale in Pathum Thani - FazWaz/a_Nong Suea_link-unit'))

WebUI.back()

WebUI.closeBrowser()

