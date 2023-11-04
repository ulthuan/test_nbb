(ns example
  (:require ["nunjucks$default" :as nunjucks]))

(def template (.compile nunjucks "Hello {{name}}!"))

(prn (.render template #js {:name "world"}))
