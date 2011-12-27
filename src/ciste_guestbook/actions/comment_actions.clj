(ns ciste-guestbook.actions.comment-actions
  (:use (ciste [core :only [defaction]]
               [config :only [definitializer]])))

(defaction index
  []
  
  )

(defaction post
  [comment]
  
  )

(defaction delete
  [id]
  
  )

(definitializer
  (doseq [namespace ['ciste-guestbook.views.comment-views
                     'ciste-guestbook.filters.comment-filters
                     'ciste-guestbook.sections.comment-sections]]
    (require namespace)))
