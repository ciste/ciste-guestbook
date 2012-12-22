(defproject ciste-guestbook "1.0.0-SNAPSHOT"
  :url "http://github.com/duck1123/ciste-guestbook"
  :description "Guestbook example for Ciste"
  :author "Daniel E. Renfer <duck@kronkltd.net>"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ciste "0.4.0-SNAPSHOT"]
                 [ring/ring-core "1.1.6"]
                 [log4j "1.2.17"]
                 ]
  :main ciste.runner
  :plugins [[codox "0.6.4"]
            [lein-midje "2.0.3"]])
