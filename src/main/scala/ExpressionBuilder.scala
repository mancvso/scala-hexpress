package com.mancvso

import scala.collection.immutable.VectorBuilder

class ExpressionBuilder(val head:String) {
  //A List has constant prepend. We want to append, which would be linear.
  private var expressions:VectorBuilder[Expression] = new VectorBuilder()

  def add(exp:Expression) = { expressions += exp; this }

  add( new Starting(head) )

  def maybe(str:String) = add( new Maybe(str) )

  def append(str:String) = add( new With(str) )

  def has(str:String) = append(str)

  def either(str1:String, str2:String) = add( new Either(List(str1, str2)) )

  def multiple(str:String) = add( new Multiple(str) )

  def ending = { add( new With("$") ); expressions.result() }

}
