// Scalaのバージョンを指定
scalaVersion := "2.10.1"

// 使用するライブラリを追加(依存するライブラリも取ってくる)
libraryDependencies ++= List(
  "org.specs2" %% "specs2" % "1.13" % "test",
  "org.jsoup" % "jsoup" % "1.7.2"
)

// sbtプロンプトでconsoleを実行した時に最初に呼ばれる
initialCommands in console := """import shurijp._"""

