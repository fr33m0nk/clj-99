(ns clj-99.list.problem-05)

;Reverse a list.

(defn my-reverse-01
  [ls]
  (into () (into [] ls)))

(defn my-reverse-02
  [ls]
  (if (empty? ls)
    '()
    (reduce conj () ls)))

(defn my-reverse-03
  [ls]
  (loop [ls ls acc ()]
    (if (empty? ls)
      acc
      (recur (rest ls) (conj acc (first ls))))))

(defn my-reverse-04
  ([ls]
   (my-reverse-04 ls ()))
  ([ls acc]
   (if (empty? ls)
     acc
     (recur (rest ls) (conj acc (first ls))))))