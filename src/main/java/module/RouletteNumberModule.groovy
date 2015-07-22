package module

import geb.Module

class RouletteNumberModule extends Module {

	static content = {
		rouletteNumberInput { $("input", name:"rouletteNumber") }

		createButton { $("input", type: "submit") }

	}

}
