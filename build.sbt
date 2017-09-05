name := "dfdl-syslog"
 
organization := "com.tresys"
 
version := "0.0.1"
 
scalaVersion := "2.11.8"
 
crossPaths := false
 
testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")
 
resolvers in ThisBuild ++= Seq(
  "NCSA Sonatype Releases" at "https://opensource.ncsa.illinois.edu/nexus/content/repositories/releases",
  "NCSA Sonatype Snapshots" at "https://opensource.ncsa.illinois.edu/nexus/content/repositories/snapshots"
)
 
libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "edu.illinois.ncsa" %% "daffodil-tdml" % "2.0.0" % "test"
)
