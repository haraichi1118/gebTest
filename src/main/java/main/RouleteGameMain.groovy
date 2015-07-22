package main

import page.CreateTitleResultsPage;
import page.HomePage;
import geb.Browser;

/**
 * ルーレットゲームのメイン処理
 */
Browser.drive {

	// ホーム画面を表示する
	to HomePage
	// ゲームタイトルを入力する
	create.field.value("test")
	create.button.click()
	waitFor { at CreateTitleResultsPage }
	firstResultLink.click()

	// ルーレット番号を入力
	rouletteNumberInput.value(1)
	createButton.click()
	rouletteNumberInput.value(2)
	createButton.click()
	rouletteNumberInput.value(3)
	createButton.click()
	rouletteNumberInput.value(4)
	createButton.click()
	rouletteNumberInput.value(5)
	createButton.click()

}
