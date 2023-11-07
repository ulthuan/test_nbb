(ns examples
  (:require ["nunjucks$default" :as nunjucks])
  (:require [promesa.core :as p]))

(defn sleep [ms]
  (js/Promise.
   (fn [resolve _]
     (js/setTimeout resolve ms))))

(defn do-stuff
  []
  (p/do!
   (println "Doing stuff which takes a while")
   (sleep 1000)
   1))

(p/let [a (do-stuff)
        b (inc a)
        c (do-stuff)
        d (+ b c)]
  (prn d))

(def template (.compile nunjucks "Hello {{name}}!"))

(prn (.render template #js {:name "world"}))
