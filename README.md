# scala-json-libraries-jmh-benchmark

```
mvn clean install
java -jar target/benchmarks.jar -bm sample -tu us -f 1 -wi 5 -i 3
```

```
Benchmark                                  Mode    Cnt      Score     Error  Units
ParseJsonToSmallCaseClass.argonautJson   sample  51733     14,663 ?   0,467  us/op
ParseJsonToSmallCaseClass.jackson        sample  34455      2,750 ?   0,165  us/op
ParseJsonToSmallCaseClass.json4sJackson  sample  44874     33,158 ?   0,499  us/op
ParseJsonToSmallCaseClass.json4sNative   sample  44069     33,941 ?   0,544  us/op
ParseJsonToSmallCaseClass.playJson       sample  38243     19,529 ?   0,550  us/op
ParseJsonToSmallCaseClass.sprayJson      sample  41841      4,551 ?   0,181  us/op

ParseSublimeConfig.argonautJson          sample  10956    273,831 ?   4,272  us/op
ParseSublimeConfig.jackson               sample  53941     55,613 ?   0,603  us/op
ParseSublimeConfig.jawnJson              sample  25242    118,998 ?   1,323  us/op
ParseSublimeConfig.json4sJackson         sample  38358     78,198 ?   0,889  us/op
ParseSublimeConfig.json4sNative          sample  27522    108,968 ?   1,537  us/op
ParseSublimeConfig.playJson              sample  27958    107,179 ?   1,670  us/op
ParseSublimeConfig.scalaUtilParsingJson  sample     89  34448,741 ? 816,802  us/op
ParseSublimeConfig.sprayJson             sample  16649    180,130 ?   1,849  us/op
```