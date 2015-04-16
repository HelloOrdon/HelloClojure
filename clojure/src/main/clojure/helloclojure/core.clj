(ns helloclojure.core)

(defn in?
  "true if seq contains elm"
  [seq elm]
  (some #(= elm %) seq))

(defn testfn [a]
  (str "Hello " a))

(defn tick [x]
  (if (> (count x) 1) x [] )
  )