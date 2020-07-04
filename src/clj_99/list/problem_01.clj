(ns clj-99.list.problem-01)

;(*) Find the last box of a list.
;Example:
;* (my-last '(a b c d))
;(D)

(defn my-last-1
  [[head & tail]]
  (if (empty? tail)
    head
    (recur tail)))

(defn my-last-2
  [ls]
  (let [tail (rest ls)]
    (if (empty? tail)
      (first ls)
      (recur tail))))