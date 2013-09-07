package com.mancvso

object ScalaHexpress {

	def start(str:String) = new ExpressionBuilder(str)

  def word = new Character( Character.word )

  def digit = new Character( Character.digit )

  def space = new Character( Character.space )

  def any = new Character( Character.any )

  def http:Vector[Expression] = new ExpressionBuilder("http").maybe("s").has("://").maybe { word.has(".") }.has("([\\\\w\\\\-]+)").has(".").either("com", "org").maybe("/").ending

  /* ^ http (?:s)? :// (?: (?:\\w)+\\. )? ([\\w\\-]+) \\. (?:com|org) (?:/)?$ */


}
