package com.mancvso

trait Expression extends Any {
  def open = "(?:"
  def close = ")"
}

class Starting(val value:String) extends AnyVal with Expression { override def toString = "^"+value }

class With(val value:String) extends AnyVal with Expression { override def toString = value }
class Except(val value:String) extends AnyVal with Expression { override def toString = "^"+value }

class Either(val values:List[String]) extends AnyVal with Expression { override def toString = values.mkString(open, "|", close) }

class Maybe(val value:String) extends AnyVal with Expression { override def toString = value.mkString(open, "", close + "?") }

class Multiple(val value:String) extends AnyVal with Expression { override def toString = value.mkString("(", "", "+"+close) }
