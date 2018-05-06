enablePlugins(SriPlatformPlugin)

organization := "com.n3ziniuka5"

version := "0.1.0"

name := "expo-sri"

scalaVersion := "2.12.4"

resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")
resolvers += Resolver.bintrayRepo("scalajs-plus", "maven")

val Versions = new {
  val sri = "2018.2.2-RC"
}

scalaJSUseMainModuleInitializer := false

libraryDependencies ++= Seq(
  "scalajs-react-interface" %%% "core" % Versions.sri,
  "scalajs-react-interface" %%% "mobile" % Versions.sri,
  "scalajs-react-interface" %%% "universal" % Versions.sri
//  "scalajs-react-interface" %%% "vector-icons" % Versions.sri,
//  "scalajs-react-interface" %%% "platform-config-ios" % Versions.sri % ios,
//  "scalajs-react-interface" %%% "platform-config-android" % Versions.sri % android,
//  "scalajs-react-interface" %%% "navigation" % Versions.sri
)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)
