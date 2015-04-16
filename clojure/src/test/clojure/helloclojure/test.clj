(ns helloclojure.test
  (:use midje.sweet, helloclojure.core))

(fact (testfn "world") => "Hello world")
(fact -1 => ((if (> 2 3) + -) 5 6))
(fact [4,5] => (filter (fn [x] (> x 3)) [1,2,3,4,5]))
(fact [[1,1]] => (filter (fn [[x,y]] (= x y)) [[1,1],[2,3],[4,5]]))


