;; Multi-Layer Perceptron for X-OR
;; T.Katanosaka
;; 11/01/25
(use 'clojure.contrib.math)

(defn staircase-function [x]
  (if (> x 0)
    1
    0))

(defn sigmoid [a x]
  (/ 1 (- 1 (. Math (exp (- (* a x)))))))

(defn deff-sigmid [a x]
  (* (* a (sigmoid a x)) (- 1 (sigmoid a x))))

(defn sgn [x]
  (if (> x 0)
    1
    (if (= x 0)
      0
      -1)))

(def time 0)
(def w11 (rand))
(def w12 (rand))
(def w21 (rand))
(def w22 (rand))

