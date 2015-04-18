package org.sample

trait Adapter {
  def parseJsonToAst(input: String): Any
}

object Json4SNativeAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    org.json4s.native.JsonMethods.parse(input)
  }
}

object Json4SJacksonAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    org.json4s.jackson.JsonMethods.parse(input)
  }
}

object SprayJsonAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    import spray.json._
    input.parseJson
  }
}

object ScalaUtilParsingJsonAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    scala.util.parsing.json.JSON.parseRaw(input).get
  }
}

object ArgonautAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    import argonaut._, Argonaut._
    input.parseOption.get
  }
}

object PlayJsonAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    import play.api.libs.json._
    Json.parse(input)
  }
}

object JawnAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    jawn.Parser.parseFromString(input)(jawn.ast.JawnFacade).get
  }
}

object JacksonAdapter extends Adapter {
  val mapper = new com.fasterxml.jackson.databind.ObjectMapper

  def parseJsonToAst(input: String): Any = {
    mapper.readTree(input)
  }
}