package page

import module.CreateTitleModule;
import geb.Page;

/**
 *
 * @author tsuiki
 *
 */
class CreateTitleResultsPage extends Page {

	static at = { "play game list" }
	static content = {
		//
		create { module CreateTitleModule, buttonValue: "create" }

		results { $("div.span8") }
		result { i -> results[i] }
		resultLink { i -> result(i).find("a") }
		firstResultLink { resultLink(0) }

		rouletteNumberInput { $("input", name:"rouletteNumber") }
		createButton { $("input", type: "submit") }
	}

}
