(ns clj-99.list.problem-03)

;Find the K'th element of a list.
;The first element in the list is number 1.
;Example:
;* (element-at '(a b c d e) 3)
;C

(defn element-at-1
  [ls i]
  (loop [ls ls cnt 1]
    (if (= cnt i)
      (first ls)
      (recur (rest ls) (inc cnt)))))

(defn element-at-2
  [ls i]
  (first (drop (dec i) ls)))

(defn element-at-3
  [ls i]
  (loop [ls ls cnt i]
    (if (= cnt 1)
      (first ls)
      (recur (rest ls) (dec cnt)))))

(defn element-at-4
  [ls i]
  (if (or (empty? ls) (= 1 i))
    (first ls)
    (recur (rest ls) (dec i))))