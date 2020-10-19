name := "dfdl-syslog-solarwinds"
 
organization := "com.tresys"
 
version := "0.1.2"
 
scalaVersion := "2.12.11"
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.7.0" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "junit" % "junit" % "4.12" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
