package com.n3ziniuka5

import sri.universal.styles.InlineStyleSheetUniversal

object Styles extends InlineStyleSheetUniversal {
  import dsl._
  val rootView = style(
    flex := 1,
    alignContent := "center",
    justifyContent := "center"
  )
}
