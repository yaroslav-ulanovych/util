package com.mahpella.util

object StringUtils {
  def parseInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case _: NumberFormatException => None
    }
  }
}
