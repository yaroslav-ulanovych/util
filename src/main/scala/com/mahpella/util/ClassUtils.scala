package com.mahpella.util

object ClassUtils {
  def forName[T](name: String): Option[Class[T]] = {
    try {
      val klass = Class.forName(name)
      Some(klass.asInstanceOf[Class[T]])
    } catch {
      case _: ClassNotFoundException => None
    }
  }
}
