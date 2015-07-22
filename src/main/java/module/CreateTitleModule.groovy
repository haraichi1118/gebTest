package module

import geb.Module;
import page.CreateTitleResultsPage;

class CreateTitleModule extends Module {

	// a parameterised value set when the module is included
	def buttonValue

	// the content DSL
	static content = {

		// 入力フィールドを定義
		field { $("input", name: "title") }

		button(to: CreateTitleResultsPage) {
			$("input", value: buttonValue)
		}

//		// 初期化
//		deleteButton {
//			gameTitle { $("div.span8") }
//			results { gameTitle.find("input", value:"Delete") }
////
////
////			println("-------- size = " + result.size())
////			for (int i = 0; i < result.size(); i++) {
////				println("-------- find = " + result[i].value())
////			}
////
////
//////			for (r in results.find("input", value:"Delete")) {
//////				r.click()
//////			}
//		}

	}

}
