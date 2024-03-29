name := "dfdl-syslog"
 
organization := "com.owlcyberdefense"
 
version := "2.0.1"
 
scalaVersion := "2.12.18"
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.5.0" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "junit" % "junit" % "4.12" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
