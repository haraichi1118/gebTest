//choose "htmlunit", "firefox", "ie", "chrome"
driver = "chrome"

//reports setting
reportsDir = "bin/geb-reports"
// キャプチャー出力 true：失敗時のみ false：全部出力
reportOnTestFailureOnly = true


//chrome - http://chromedriver.storage.googleapis.com/index.html
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe")