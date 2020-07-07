(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description ""
  :url ""
  :license {:name "" :url ""}
  :main undead.system
  :jvm-opts ["-XX:MaxPermSize=256m"]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [http-kit "2.1.18"]]
  :profiles {:dev {:plugins []
                   :dependencies []
                   :source-paths ["dev"]}})
