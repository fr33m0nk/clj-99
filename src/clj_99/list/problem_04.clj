(ns clj-99.list.problem-04)

;Find the number of elements of a list.

(defn count-of-elements-1
  [ls]
  (loop [ls ls count 0]
    (if (empty? ls)
      count
      (recur (rest ls) (inc count)))))

(defn count-of-elements-2
  ([ls]
   (count-of-elements-2 ls 0))
  ([ls i]
   (if (empty? ls)
     i
     (recur (rest ls) (inc i)))))

(defn count-of-elements-3
  [ls]
  ((comp
     (partial apply +)
     (partial map (constantly 1))) ls))
