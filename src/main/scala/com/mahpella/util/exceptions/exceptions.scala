package com.mahpella.util.exceptions

class NotSupportedOperationException(description: String) extends Exception(description)

class UnreachableOperationException(reason: String) extends Exception(reason)
