(ns ciste-guestbook.http
  (:use (ring.adapter [jetty :only [run-jetty]])))

(defn start
  []
  (run-jetty #'app {:join? false
                     :port (config :http :port)}))
