package main

import geb.Browser
import page.GoogleHomePage
import page.GoogleResultsPage


Browser.drive {
	to GoogleHomePage
	search.field.value("ウィキペディア")
	waitFor { at GoogleResultsPage }
	firstResultLink.click()
}

