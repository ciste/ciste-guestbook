(ns ciste-guestbook.views.comment-views
  (:use [ciste.views :only [defview]]
        ciste-guestbook.actions.comment-actions))

(defview #'index :html
  [request comments]
  {:body
   [:section
    [:h1 "All Comments"]
    ]})

(defview #'post :html
  [request comment]
  {:headers {"Location" "/"}
   :status 303
   :template false})

(defview #'delete :html
  [request comment]
  {:headers {"Location" "/"}
   :status 303
   :template false})
