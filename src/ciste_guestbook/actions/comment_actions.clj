(ns ciste-guestbook.actions.comment-actions
  (:use [ciste.config :only [definitializer]]
        [ciste.core :only [defaction]]))

(defaction index
  []
  true
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
