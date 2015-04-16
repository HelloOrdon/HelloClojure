(ns helloclojure.test
  (:use midje.sweet, helloclojure.core))

(fact -1 => ((if (> 2 3) + -) 5 6))
(fact [4,5] => (filter (fn [x] (> x 3)) [1,2,3,4,5]))
(fact [[1,1]] => (filter (fn [[x,y]] (= x y)) [[1,1],[2,3],[4,5]]))

(fact [] => (tick [[1,1]]))
(fact [[0,0],[0,1],[1,0],[1,1]] => (tick [[0,0],[0,1],[1,0],[1,1]]))
(fact (in? (tick [[0,0],[0,1],[0,2]]) [0,1] ) => true)

(fact [[0,0],[0,1],[0,2],[1,0],[1,2],[2,0],[2,1],[2,2]] => (neightbours [1,1] ))
(fact [[-1,-1],[-1,0],[-1,1],[0,-1],[0,1],[1,-1],[1,0],[1,1]] => (neightbours [0,0] ))
(fact 2 => (neighboursCount [[0,0],[0,1],[1,0]] [0,1]))
(fact 1 => (neighboursCount [[0,0],[0,1]] [0,1]))
(fact true => (shouldSurvive [[0,0],[0,1],[1,0]] [0,1]))
(fact false => (shouldSurvive [[0,0],[0,1]] [0,1]))

(fact (in? (tick [[0,0],[0,1],[0,2]]) [0,0] ) => false)

(fact [[0,0],[0,1],[0,2],[1,0],[1,2],[2,0],[2,1],[2,2]] => (posibleToEmerge [[1,1],[1,1]]))
(fact [[-1,-1],[-1,0],[-1,1],[0,-1],[0,1],[1,-1],[1,0],[1,1]] => (posibleToEmerge [[0,0],[0,0]]))

(fact (in? (emerged [[0,0],[0,1],[0,2]]) [1,1]) => true)
;(fact (in? (tick [[0,0],[0,1],[0,2]]) [1,1] ) => true)
