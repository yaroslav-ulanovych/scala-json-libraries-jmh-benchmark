# scala-json-libraries-jmh-benchmark

```
mvn clean install
java -jar target/benchmarks.jar -bm sample -tu us -f 1 -wi 5 -i 3
```

```
Benchmark                                  Mode    Cnt      Score     Error  Units
ParseSublimeConfig.argonautJson          sample  11088    271,185 ?   4,397  us/op
ParseSublimeConfig.jawnJson              sample  25227    118,833 ?   1,396  us/op
ParseSublimeConfig.json4sJackson         sample  39131     76,672 ?   0,973  us/op
ParseSublimeConfig.json4sNative          sample  27998    107,264 ?   1,507  us/op
ParseSublimeConfig.playJson              sample  31141     96,468 ?   1,585  us/op
ParseSublimeConfig.scalaUtilParsingJson  sample     91  33518,063 ? 456,679  us/op
ParseSublimeConfig.sprayJson             sample  16734    179,656 ?   1,829  us/op
```
