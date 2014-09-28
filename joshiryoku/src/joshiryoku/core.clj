(ns joshiryoku.core)

(defn  -言-
  []
  (+ 2 3))

(defn  ；ﾞﾟ'ωﾟ'
  []
  (+ 2 3))


(defn  ◞‸◟
  []
  (+ 2 3))

(defn  ˄·͈༝·͈˄
  []
  (+ 2 3))

(defn ꒪⌓꒪
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
