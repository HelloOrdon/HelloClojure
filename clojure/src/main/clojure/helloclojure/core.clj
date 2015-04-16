(ns helloclojure.core)

(defn in?
  "true if seq contains elm"
  [seq elm]
  (not (nil? (some #(= elm %) seq))))

(defn neightbours [[x,y]]
  (for [dx [-1,0,1] dy [-1,0,1]
        :when (not= dx dy 0)]
    [(+ x dx) (+ y dy)]))

(defn neighboursCount [input, x]
  (count (filter (fn [neighbour]
                   (in? input neighbour))
           (neightbours x)))
  )

(defn shouldSurvive [input, x]
  (in? [2,3] (neighboursCount input x))
  )
(defn testfn [a]
  (str "Hello " a))

(defn tick [input]
  (filter (fn [x]
            (shouldSurvive input x)) input)
  )