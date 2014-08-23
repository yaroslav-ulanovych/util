package com.mahpella.util.exceptions


object illegalArgument {
  def apply(msg: String) = throw new IllegalArgumentException(msg)
}

object unreachable {
  def apply(): Nothing = throw new UnreachableOperationException("unknown reason")
  def apply(reason: String): Nothing = throw new UnreachableOperationException(reason)
}

object illegalState {
  def apply(msg: String) = throw new IllegalStateException(msg)
}

object unsupported {
  def apply() = throw new UnsupportedOperationException
}
