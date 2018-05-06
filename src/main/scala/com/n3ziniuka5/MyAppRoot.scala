package com.n3ziniuka5

import scalajsplus.OptSpecified
import sri.core.{ComponentNoPS, ReactNode}
import sri.universal.components.{Text, View}

import scala.scalajs.js.annotation.JSExportTopLevel

//Don't forget to change App.js if you rename this
@JSExportTopLevel("MyAppRoot")
class MyAppRoot extends ComponentNoPS {
  def render(): ReactNode = {
    View(OptSpecified(Styles.rootView))(
      Text()(s"Hello from Scala.js")
    )
  }
}