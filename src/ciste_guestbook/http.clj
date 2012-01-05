(ns ciste-guestbook.http
  (:use (ciste-guestbook [routes :only [app]])
        (ring.adapter [jetty :only [run-jetty]])))

(defn start
  [port]
  (run-jetty #'app {:join? false :port port}))
