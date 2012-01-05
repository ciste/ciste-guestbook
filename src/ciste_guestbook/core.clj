(ns ciste-guestbook.core
  (:use (ciste [config :only [config load-config set-environment!]]))
  (:require (ciste-guestbook [http :as http])))

(defn start
  "Start the application"
  ([]
     (start "--env" "development"))
  ([& args]
     ;; TODO: Much of this will probably be abstracted away in the future
     (let [opts (apply hash-map args)
           environment (keyword (get opts "--env" "development"))]
       (load-config)
       (set-environment! environment)
       (http/start (or (config :http :port) 8082)))))

(defn -main
  [& args]
  (apply start args)
  ;; If starting a swank session in the start function, there are
  ;; errors if the thread isn't left open. This will ensure that main
  ;; never returns.
  @(promise))
