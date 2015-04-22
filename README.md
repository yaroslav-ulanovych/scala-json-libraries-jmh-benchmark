# scala-json-libraries-jmh-benchmark

```
mvn clean install
java -jar target/benchmarks.jar -bm sample -tu us -f 1 -wi 5 -i 3
```

These numbers mean nothing, cause on my machine spray is ~2 times faster than json4s in some test,
and on colleague's macbook they perform almast identically.
So hell knows what factors performance can depend on, always measure in your production conditions.

my laptop java 8
```
Benchmark                                         Mode    Cnt      Score     Error  Units
ParseFewThousandsFlatClassesList.argonautJson   sample    126  24346,364 ? 767,984  us/op
ParseFewThousandsFlatClassesList.jackson        sample    919   3287,778 ?  31,095  us/op
ParseFewThousandsFlatClassesList.json4sJackson  sample    130  23359,803 ? 536,556  us/op
ParseFewThousandsFlatClassesList.json4sNative   sample    122  24784,157 ? 727,370  us/op
ParseFewThousandsFlatClassesList.rojoma         sample    377   8050,563 ? 153,616  us/op
ParseFewThousandsFlatClassesList.sprayJson      sample    146  20772,668 ? 441,027  us/op

ParseJsonToSmallCaseClass.argonautJson          sample  36666      5,151 ?   0,136  us/op
ParseJsonToSmallCaseClass.jackson               sample  40947      1,218 ?   0,049  us/op
ParseJsonToSmallCaseClass.json4sJackson         sample  32892      5,740 ?   0,196  us/op
ParseJsonToSmallCaseClass.json4sNative          sample  51979      7,299 ?   0,152  us/op
ParseJsonToSmallCaseClass.playJson              sample  40614      9,241 ?   0,160  us/op
ParseJsonToSmallCaseClass.rojoma                sample  38702      2,639 ?   0,644  us/op
ParseJsonToSmallCaseClass.sprayJson             sample  54546      1,724 ?   0,031  us/op

ParseSublimeConfig.argonautJson                 sample  36003     83,625 ?   1,715  us/op
ParseSublimeConfig.jackson                      sample  43224     34,781 ?   0,782  us/op
ParseSublimeConfig.jawnJson                     sample  30753     48,482 ?   0,353  us/op
ParseSublimeConfig.json4sJackson                sample  41545     36,005 ?   0,368  us/op
ParseSublimeConfig.json4sNative                 sample  57865     51,920 ?   0,466  us/op
ParseSublimeConfig.playJson                     sample  31506     47,746 ?   0,693  us/op
ParseSublimeConfig.rojoma                       sample  36389     82,983 ?   0,567  us/op
ParseSublimeConfig.scalaUtilParsingJson         sample    210  14310,566 ? 259,158  us/op
ParseSublimeConfig.sprayJson                    sample  37789     79,594 ?   0,634  us/op
```

my laptop java 7
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

macbook java 7
```
Benchmark                                         Mode    Cnt      Score     Error  Units
ParseFewThousandsFlatClassesList.argonautJson   sample    269  11197.520 ± 231.041  us/op
ParseFewThousandsFlatClassesList.jackson        sample   1875   1605.901 ±  14.542  us/op
ParseFewThousandsFlatClassesList.json4sJackson  sample    291  10358.235 ± 125.289  us/op
ParseFewThousandsFlatClassesList.json4sNative   sample    257  11741.272 ± 179.887  us/op
ParseFewThousandsFlatClassesList.sprayJson      sample    331   9119.750 ± 148.185  us/op

ParseJsonToSmallCaseClass.argonautJson          sample  38212      2.514 ±   0.017  us/op
ParseJsonToSmallCaseClass.jackson               sample  38271      0.651 ±   0.009  us/op
ParseJsonToSmallCaseClass.json4sJackson         sample  30678      3.095 ±   0.014  us/op
ParseJsonToSmallCaseClass.json4sNative          sample  56598      3.385 ±   0.050  us/op
ParseJsonToSmallCaseClass.playJson              sample  30016      3.212 ±   0.092  us/op
ParseJsonToSmallCaseClass.sprayJson             sample  58568      0.842 ±   0.007  us/op

ParseSublimeConfig.argonautJson                 sample  36406     41.132 ±   0.255  us/op
ParseSublimeConfig.jackson                      sample  53153     14.143 ±   0.053  us/op
ParseSublimeConfig.jawnJson                     sample  38769     19.374 ±   0.066  us/op
ParseSublimeConfig.json4sJackson                sample  48555     15.515 ±   0.099  us/op
ParseSublimeConfig.json4sNative                 sample  31680     23.691 ±   0.131  us/op
ParseSublimeConfig.playJson                     sample  58732     25.622 ±   0.145  us/op
ParseSublimeConfig.scalaUtilParsingJson         sample    398   7585.915 ±  91.750  us/op
ParseSublimeConfig.sprayJson                    sample  46215     32.537 ±   0.109  us/op
```

macbook java 8
```
Benchmark                                         Mode    Cnt      Score     Error  Units
ParseFewThousandsFlatClassesList.argonautJson   sample    299  10079.886 ± 171.479  us/op
ParseFewThousandsFlatClassesList.jackson        sample   1961   1535.301 ±   9.073  us/op
ParseFewThousandsFlatClassesList.json4sJackson  sample    306   9886.566 ± 106.267  us/op
ParseFewThousandsFlatClassesList.json4sNative   sample    263  11485.620 ± 139.397  us/op
ParseFewThousandsFlatClassesList.sprayJson      sample    286  10568.253 ± 255.223  us/op

ParseJsonToSmallCaseClass.argonautJson          sample  40117      2.376 ±   0.011  us/op
ParseJsonToSmallCaseClass.jackson               sample  38826      0.642 ±   0.004  us/op
ParseJsonToSmallCaseClass.json4sJackson         sample  30952      3.069 ±   0.011  us/op
ParseJsonToSmallCaseClass.json4sNative          sample  56110      3.391 ±   0.059  us/op
ParseJsonToSmallCaseClass.playJson              sample  52964      3.605 ±   0.098  us/op
ParseJsonToSmallCaseClass.sprayJson             sample  58634      0.824 ±   0.004  us/op

ParseSublimeConfig.argonautJson                 sample  39324     38.247 ±   0.310  us/op
ParseSublimeConfig.jackson                      sample  50065     15.030 ±   0.088  us/op
ParseSublimeConfig.jawnJson                     sample  39943     18.878 ±   0.149  us/op
ParseSublimeConfig.json4sJackson                sample  47132     15.968 ±   0.084  us/op
ParseSublimeConfig.json4sNative                 sample  34438     21.827 ±   0.133  us/op
ParseSublimeConfig.playJson                     sample  31376     24.148 ±   0.250  us/op
ParseSublimeConfig.scalaUtilParsingJson         sample    424   7133.976 ±  75.038  us/op
ParseSublimeConfig.sprayJson                    sample  47911     31.341 ±   0.098  us/op
```