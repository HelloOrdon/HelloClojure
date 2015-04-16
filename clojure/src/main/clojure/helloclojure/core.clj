(ns helloclojure.core)

(defn in?
  "true if seq contains elm"
  [seq elm]
  (some #(= elm %) seq))

(defn neightbours [[x,y]]
  (for [dx [-1,0,1] dy [-1,0,1]
    :when (not= dx dy 0)]
    [(+ x dx) (+ y dy)]))

(defn testfn [a]
  (str "Hello " a))

(defn tick [x]
  (if (> (count x) 1) x [] )
  )