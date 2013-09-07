package com.mancvso

object Character {
	val word = "(\\\\w)+"
	val digit = "\\\\d"
  val digits = "(\\\\d)+"

	val any = "."
  val space = "\\s"
}

class Character(val value:String) extends AnyVal with Expression {

  //All those methods must return String/List[String] for input on Clauses
  def has(str:String) = new Character(value + str).toString

  override def toString = value

}