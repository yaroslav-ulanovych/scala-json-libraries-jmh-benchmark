package org.sample

import org.openjdk.jmh.annotations.{Scope, State, Benchmark}

trait BaseBenchmark {
  def perform(adapter: Adapter): Any

  @Benchmark
  def json4sNative() = {
    perform(Json4SNativeAdapter)
  }

  @Benchmark
  def json4sJackson() = {
    perform(Json4SJacksonAdapter)
  }

  @Benchmark
  def sprayJson() = {
    perform(SprayJsonAdapter)
  }

  @Benchmark
  def scalaUtilParsingJson() = {
    perform(ScalaUtilParsingJsonAdapter)
  }

  @Benchmark
  def argonautJson() = {
    perform(ArgonautAdapter)
  }

  @Benchmark
  def playJson() = {
    perform(PlayJsonAdapter)
  }

  @Benchmark
  def jawnJson() = {
    perform(JawnAdapter)
  }

  @Benchmark
  def jackson() = {
    perform(JacksonAdapter)
  }
}

@State(Scope.Thread)
class ParseSublimeConfig extends BaseBenchmark {
  val input = scala.io.Source.fromInputStream(getClass.getResourceAsStream("/sublime-config.json")).mkString

  def perform(adapter: Adapter) = adapter.parseJsonToAst(input)
}