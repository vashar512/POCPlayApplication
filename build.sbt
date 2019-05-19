name := "POCPlayApplication"
version := "0.1"
scalaVersion := "2.12.6"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies += guice
libraryDependencies ++= Seq("com.typesafe.play" %% "play" % "2.6.11",
  "junit" % "junit" % "4.12",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "org.mockito" % "mockito-core" % "2.7.19" % "test")

dependencyOverrides ++= Seq("com.google.guava" % "guava" % "22.0",
"com.typesafe.akka" % "akka-stream_2.12" % "2.5.8",
"com.typesafe.akka" % "akka-actor_2.12" % "2.5.8",
"org.scala-lang.modules" % "scala-parser-combinators_2.12" % "1.0.6",
"com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.8.11")