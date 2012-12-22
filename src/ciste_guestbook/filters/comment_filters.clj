(ns ciste-guestbook.filters.comment-filters
  (:use [ciste.filters :only [deffilter]]
        ciste-guestbook.actions.comment-actions))

(deffilter #'index :http
  [action request]
  (action))

(deffilter #'delete :http
  [action request]
  (-> request :params :id action))

(deffilter #'post :http
  [action request]
  (-> request :params action))
