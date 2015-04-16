(ns helloclojure.core)

(defn in?
  "true if seq contains elm"
  [seq elm]
  (some #(= elm %) seq))

(defn neightbours [[x,y]]
  (for [dx [0,1,2] dy [0,1,2]
    :when (not= dx dy 1)]
    [dx dy]))

(defn testfn [a]
  (str "Hello " a))

(defn tick [x]
  (if (> (count x) 1) x [] )
  )