(defproject capacitor "0.6.0-async"
  :description "A Clojure client for InfluxDB"
  :url "https://github.com/L-jasmine/capacitor"
  :license {
    :name "Eclipse Public License"
    :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.9.0"]
    [clj-http            "3.9.1"]
    [cheshire            "5.5.0"]
    [org.clojure/algo.generic "0.1.2"]]
  :plugins [
    [codox "0.6.6"]]
  :dev-dependencies [
    [codox "0.6.6"]]
  :codox {
    :output-dir "docs/codox"
    :src-dir-uri "https://github.com/L-jasmine/capacitor/blob/master/"
    :src-linenum-anchor-prefix "L"})
