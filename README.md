# scala-json-libraries-jmh-benchmark

```
mvn clean install
java -jar target/benchmarks.jar -bm sample -tu us -f 1 -wi 5 -i 3
```

```
Benchmark                                  Mode    Cnt      Score     Error  Units
ParseJsonToSmallCaseClass.argonautJson   sample  52299     14,371 ?   0,460  us/op
ParseJsonToSmallCaseClass.json4sJackson  sample  58309     25,862 ?   0,448  us/op
ParseJsonToSmallCaseClass.json4sNative   sample  58108     25,864 ?   0,463  us/op
ParseJsonToSmallCaseClass.playJson       sample  36722     20,557 ?   0,613  us/op
ParseJsonToSmallCaseClass.sprayJson      sample  42135      4,522 ?   0,181  us/op

ParseSublimeConfig.argonautJson          sample  10956    273,831 ?   4,272  us/op
ParseSublimeConfig.jackson               sample  53941     55,613 ?   0,603  us/op
ParseSublimeConfig.jawnJson              sample  25242    118,998 ?   1,323  us/op
ParseSublimeConfig.json4sJackson         sample  38358     78,198 ?   0,889  us/op
ParseSublimeConfig.json4sNative          sample  27522    108,968 ?   1,537  us/op
ParseSublimeConfig.playJson              sample  27958    107,179 ?   1,670  us/op
ParseSublimeConfig.scalaUtilParsingJson  sample     89  34448,741 ? 816,802  us/op
ParseSublimeConfig.sprayJson             sample  16649    180,130 ?   1,849  us/op
```
