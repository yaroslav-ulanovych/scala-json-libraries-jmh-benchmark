# scala-json-libraries-jmh-benchmark

```
mvn clean install
java -jar target/benchmarks.jar -bm sample -tu us -f 1 -wi 5 -i 3
```

```
Benchmark                                         Mode    Cnt       Score       Error  Units
ParseFewThousandsFlatClassesList.argonautJson   sample     29  105499,401 ? 18877,302  us/op
ParseFewThousandsFlatClassesList.jackson        sample    442    6827,921 ?   117,924  us/op
ParseFewThousandsFlatClassesList.json4sJackson  sample     28  112726,601 ? 14221,480  us/op
ParseFewThousandsFlatClassesList.json4sNative   sample     24  134223,189 ? 17426,145  us/op
ParseFewThousandsFlatClassesList.sprayJson      sample     61   50056,612 ?  7644,741  us/op

ParseJsonToSmallCaseClass.argonautJson          sample  49232      15,203 ?     0,485  us/op
ParseJsonToSmallCaseClass.jackson               sample  33070       2,908 ?     0,189  us/op
ParseJsonToSmallCaseClass.json4sJackson         sample  57395      25,813 ?     0,451  us/op
ParseJsonToSmallCaseClass.json4sNative          sample  57344      26,040 ?     0,449  us/op
ParseJsonToSmallCaseClass.playJson              sample  37496      20,225 ?     0,614  us/op
ParseJsonToSmallCaseClass.sprayJson             sample  41336       4,660 ?     0,298  us/op

ParseSublimeConfig.argonautJson                 sample  11055     271,487 ?     4,111  us/op
ParseSublimeConfig.jackson                      sample  53531      56,025 ?     0,623  us/op
ParseSublimeConfig.jawnJson                     sample  24592     121,989 ?     1,425  us/op
ParseSublimeConfig.json4sJackson                sample  37206      80,895 ?     0,920  us/op
ParseSublimeConfig.json4sNative                 sample  27266     110,069 ?     1,564  us/op
ParseSublimeConfig.playJson                     sample  27568     108,955 ?     1,671  us/op
ParseSublimeConfig.scalaUtilParsingJson         sample     89   34211,633 ?   454,428  us/op
ParseSublimeConfig.sprayJson                    sample  16551     181,395 ?     1,915  us/op
```