(ns ciste-guestbook.core
  (:use (ciste [config :only [config load-config set-environment!]]))
  (:require (ciste-guestbook [http :as http])))

(defn start
  []
    (load-config)
    (set-environment! :development)
    (http/start (or (config :http :port) 8082))

    @(promise))

(defn -main
  []
  (start))
