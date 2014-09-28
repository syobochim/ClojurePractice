(ns joshiryoku.core)

(defn ꒪⌓꒪ []
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N])))

(defn  ；ﾞﾟ'ωﾟ'
  []
  (+ 2 3))


(defn  ◞‸◟
  []
  (+ 2 3))

(defn  ˄·͈༝·͈˄
  []
  (+ 2 3))

(defn ◔⊖◔
  []
  (+ 2 3))

(defn =v=*
  []
  (+ 2 3))

(defn gakuburu
  [buruburu]
  (loop [n buruburu
         result '(；ﾟДﾟ)]
    (if (= n 0)
      result
      (recur (dec n) (list result)))))

