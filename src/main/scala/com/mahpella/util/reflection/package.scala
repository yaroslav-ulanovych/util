package com.mahpella.util

import java.lang.reflect.{Modifier, Field}

package object reflection {
  implicit class RichField(x: Field) {
    def isPrivate: Boolean = Modifier.isPrivate(x.getModifiers)
  }
}
