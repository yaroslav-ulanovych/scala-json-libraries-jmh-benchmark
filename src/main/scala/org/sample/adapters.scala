package org.sample

trait Adapter {
  def parseJsonToAst(input: String): Any

  def parseJsonToSmallCaseClass(input: String): Any
}

object Json4SNativeAdapter extends Adapter {
  import org.json4s.native.JsonMethods._

  implicit val formats = org.json4s.DefaultFormats

  def parseJsonToAst(input: String): Any = {
    parse(input)
  }

  def parseJsonToSmallCaseClass(input: String): Any = {
    parse(input).extract[Person]
  }
}

object Json4SJacksonAdapter extends Adapter {
  import org.json4s.jackson.JsonMethods._

  implicit val formats = org.json4s.DefaultFormats

  def parseJsonToAst(input: String): Any = {
    parse(input)
  }

  def parseJsonToSmallCaseClass(input: String): Any = {
    parse(input).extract[Person]
  }
}

object SprayJsonAdapter extends Adapter {
  import spray.json._

  object JsonProtocol extends DefaultJsonProtocol {
    implicit val addressFormat = jsonFormat2(Address)
    implicit val personFormat = jsonFormat3(Person)
  }

  import JsonProtocol._

  def parseJsonToAst(input: String): Any = {
    input.parseJson
  }

  def parseJsonToSmallCaseClass(input: String): Any = {
    input.parseJson.convertTo[Person]
  }
}

object ScalaUtilParsingJsonAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    scala.util.parsing.json.JSON.parseRaw(input).get
  }

  def parseJsonToSmallCaseClass(input: String): Any = ()
}

object ArgonautAdapter extends Adapter {
  import argonaut._, Argonaut._

  implicit val addressCodec = casecodec2(Address.apply, Address.unapply)("country", "city")
  implicit val personCodec = casecodec3(Person.apply, Person.unapply)("name", "age", "address")

  def parseJsonToAst(input: String): Any = {
    input.parseOption.get
  }

  def parseJsonToSmallCaseClass(input: String): Any = {
    input.decodeOption[Person].get
  }
}

object PlayJsonAdapter extends Adapter {
  import play.api.libs.json._

  def parseJsonToAst(input: String): Any = {
    Json.parse(input)
  }

  override def parseJsonToSmallCaseClass(input: String): Any = {
    implicit val xx = Json.reads[Address]
    Json.reads[Person].reads(Json.parse(input)).get
  }
}

object JawnAdapter extends Adapter {
  def parseJsonToAst(input: String): Any = {
    jawn.Parser.parseFromString(input)(jawn.ast.JawnFacade).get
  }

  def parseJsonToSmallCaseClass(input: String): Any = ()
}

object JacksonAdapter extends Adapter {
  val mapper = new com.fasterxml.jackson.databind.ObjectMapper

  def parseJsonToAst(input: String): Any = {
    mapper.readTree(input)
  }

  def parseJsonToSmallCaseClass(input: String): Any = ()
}