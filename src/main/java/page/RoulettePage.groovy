package page

import geb.Page

class RoulettePage extends Page {

	static at = { title == "roulette list" }

	static content = {
		rouletteCreate { module RouletteNumberModule }
	}

}
