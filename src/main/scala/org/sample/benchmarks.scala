package org.sample

import org.openjdk.jmh.annotations.{Scope, State, Benchmark}

trait Test {
  def perform(adapter: Adapter): Any
}

trait Json4SNativeTest extends Test {
  @Benchmark
  def json4sNative() = {
    perform(Json4SNativeAdapter)
  }
}

trait Json4SJacksonTest extends Test {
  @Benchmark
  def json4sJackson() = {
    perform(Json4SJacksonAdapter)
  }
}

trait SprayJsonTest extends Test {
  @Benchmark
  def sprayJson() = {
    perform(SprayJsonAdapter)
  }
}

trait ScalaUtilParsingJsonTest extends Test {
  @Benchmark
  def scalaUtilParsingJson() = {
    perform(ScalaUtilParsingJsonAdapter)
  }
}

trait ArgonautJsonTest extends Test {
  @Benchmark
  def argonautJson() = {
    perform(ArgonautAdapter)
  }
}

trait PlayJsonTest extends Test {
  @Benchmark
  def playJson() = {
    perform(PlayJsonAdapter)
  }
}

trait JawnJsonTest extends Test {
  @Benchmark
  def jawnJson() = {
    perform(JawnAdapter)
  }
}

trait JacksonTest extends Test {
  @Benchmark
  def jackson() = {
    perform(JacksonAdapter)
  }
}

trait AllTests extends Test
  with Json4SNativeTest
  with Json4SJacksonTest
  with SprayJsonTest
  with ScalaUtilParsingJsonTest
  with ArgonautJsonTest
  with PlayJsonTest
  with JawnJsonTest
  with JacksonTest

@State(Scope.Thread)
class ParseSublimeConfig extends AllTests {
  val input = scala.io.Source.fromInputStream(getClass.getResourceAsStream("/sublime-config.json")).mkString

  def perform(adapter: Adapter) = adapter.parseJsonToAst(input)
}

@State(Scope.Thread)
class ParseJsonToSmallCaseClass extends Test
  with Json4SNativeTest
  with Json4SJacksonTest
  with SprayJsonTest
  with ArgonautJsonTest
  with PlayJsonTest
  with JacksonTest
{
  val input = scala.io.Source.fromInputStream(getClass.getResourceAsStream("/person.json")).mkString

  def perform(adapter: Adapter) = adapter.parseJsonToSmallCaseClass(input)
}