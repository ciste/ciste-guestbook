(ns ciste-guestbook.views
  (:use (ciste [core :only [serialize-as]]))
  (:require (hiccup [core :as h]))
  )

;; (defmethod apply-template :html
;;   [request response]
;;   (merge response
;;          (if (not= (:template response) false)
;;            (page-template-content
;;             request
;;             (if (:flash request)
;;               (assoc response :flash (:flash request))
;;               response)))))

(defmethod serialize-as :http
  [serialization response-map]
  (assoc-in
   (merge {:status 200}
          response-map
          (if-let [body (:body response-map)]
            {:body (h/html body)}))
   [:headers "Content-Type"]
   (or (-> response-map :headers (get "Content-Type"))
       "text/html; charset=utf-8")))
