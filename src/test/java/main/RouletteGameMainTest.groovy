package main

import java.sql.ResultSet;

import geb.spock.GebReportingSpec;
import page.CreateTitleResultsPage;
import page.RoulettePage;
import page.HomePage;

class RouletteGameMainTest extends GebReportingSpec {

	def "main"() {
		given:
		to HomePage

		expect:
		at HomePage

		if ($("input", value: "Delete")[0]) {
			$("input", value: "Delete").click()
		}

		when:
		create.field.value("test")
		create.button.click()

		then:
		waitFor { at CreateTitleResultsPage }

		and:
		firstResultLink.text() == "test"

		when:
		firstResultLink.click()

		then:
		waitFor { at RoulettePage }
	}

	def "roulette game input not number"() {
		setup:
		to HomePage
		at CreateTitleResultsPage

		when:
		firstResultLink.click()

		then:
		waitFor { at RoulettePage }

		when:
		$("input", name:"rouletteNumber").value("moji")

		and:
		$("input", type: "submit").click()

		then:
		$("dd.error").text() == "Numeric value expected"

		report("input check")
	}

	def "roulette game input number"() {
		setup:
		to HomePage
		at CreateTitleResultsPage

		when:
		firstResultLink.click()

		then:
		waitFor { at RoulettePage }

		when:
		$("input", name:"rouletteNumber").value(num)

		and:
		$("input", type: "submit").click()

		then:
		$("tbody").find("tr").size() == listSize

		where:
		num | listSize
		1   | 1
		23  | 2
		32  | 3
		16  | 4
		36  | 5
	}


}
