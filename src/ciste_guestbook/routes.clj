(ns ciste-guestbook.routes
  (:use (ciste [middleware :only [wrap-http-serialization]]
               [routes :only [make-matchers resolve-routes]])
        (compojure [core :only [defroutes]]))
  (:require (ciste [predicates :as pred])
            (ciste-guestbook.actions [comment-actions :as comment])
            (compojure [handler :as handler])
            (ring.middleware [stacktrace :as stacktrace])))

(def main-routes
  (make-matchers
   ;; Add http routes here. in the form [[method path] action]
   [
    [[:get "/"]         #'comment/index]
    [[:post "/"]        #'comment/post]
    [[:delete "/:id"]   #'comment/delete]
    ]))


;; These are the basic set of predicates for a web application
(def http-predicates
  [#'pred/http-serialization?
   #'pred/request-method-matches?
   #'pred/path-matches?])

(defroutes all-routes
  ;; The resolve routes function can be used in place of any standard
  ;; Ring handler
  (resolve-routes http-predicates main-routes))

(def app
  (-> all-routes

      ;; Standard middleware
      handler/site

      ;; All of the routes coming through here will be using the :http
      ;; serialization type
      wrap-http-serialization

      ;; Show a helpful error page
      stacktrace/wrap-stacktrace
      )
  )
