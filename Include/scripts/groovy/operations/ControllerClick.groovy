package operations
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ControllerClick {
	@When("user click by href '(.*)'")
	def clickbyhref(value) {
		WebUI.waitForElementClickable(findTestObject('Object Repository/GIT/byhref', ['PARAM' : value]), 10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/GIT/byhref', ['PARAM' : value]))
	}

	@Then("user click button '(.*)'")
	def clickbyname(value) {

		WebUI.click(findTestObject('Object Repository/GIT/byname', ['PARAM' : value]))
	}

	@Then("Open the drop down")
	def dropdown() {
		WebUI.click(findTestObject('Object Repository/GIT/drop_down_public'))
	}

	@Then("Open the drop down profile")
	def dropdownprofile() {
		WebUI.click(findTestObject('Object Repository/GIT/dropdown_profile'))
	}

	@Then("user click button by text '(.*)'")
	def clickbytext(value) {
		WebUI.click(findTestObject('Object Repository/GIT/bytext', ['PARAM' : value]))
		WebUI.delay(2)
	}

	@And("user click button for commit '(.*)'")
	def clickbuttonforcommit(value) {
		WebUI.click(findTestObject('Object Repository/GIT/bytext', ['PARAM' : value]))
		WebUI.delay(2)
	}


	@Then("user click button by aria-label '(.*)'")
	def clickbyarialabel(value) {

		WebUI.click(findTestObject('Object Repository/GIT/byarialabel', ['PARAM' : value]))
	}
}