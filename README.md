# scala-json-libraries-jmh-benchmark

```
mvn clean install
java -jar target/benchmarks.jar -bm sample -tu us -f 1 -wi 5 -i 3
```

```
Benchmark                                  Mode    Cnt      Score     Error  Units
ParseSublimeConfig.argonautJson          sample  11268    267,002 ?   4,340  us/op
ParseSublimeConfig.jackson               sample  55349     54,285 ?   0,635  us/op
ParseSublimeConfig.jawnJson              sample  25464    117,802 ?   1,355  us/op
ParseSublimeConfig.json4sJackson         sample  38549     77,825 ?   1,016  us/op
ParseSublimeConfig.json4sNative          sample  28141    106,455 ?   1,443  us/op
ParseSublimeConfig.playJson              sample  31097     96,675 ?   1,488  us/op
ParseSublimeConfig.scalaUtilParsingJson  sample     90  33901,045 ? 364,575  us/op
ParseSublimeConfig.sprayJson             sample  16686    179,903 ?   2,031  us/op
```
