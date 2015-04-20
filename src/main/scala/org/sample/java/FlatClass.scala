package org.sample.java

class FlatClass {
  private var long: Long = _
  private var string: String = _
  private var boolean: Boolean = _
  private var optInt: Int = _

  def getLong(): Long = long
  def getString(): String = string
  def getBoolean(): Boolean = boolean
  def getOptInt(): Int = optInt

  def setLong(value: Long): Unit = { this.long = value }
  def setString(value: String): Unit = { this.string = value }
  def setBoolean(value: Boolean): Unit = { this.boolean = value }
  def setOptInt(value: Int): Unit = { this.optInt = value }
}
