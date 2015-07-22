package page

import module.CreateTitleModule;
import geb.Page

/**
 * ルーレットゲームのHOEM画面を表現します。
 * @author tsuiki
 *
 */
class HomePage extends Page {

	// HOME画面のURL
	static url = "http://localhost:9000/game"

	// HOME画面のチェック項目
	static at = { title == "play game list" }

	// HOME画面の振る舞い
	static content = {
		// include the previously defined module
		create { module CreateTitleModule, buttonValue: "create" }
	}
}
