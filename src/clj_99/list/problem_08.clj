(ns clj-99.list.problem-08)

;Eliminate consecutive duplicates of list elements.
;If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
;
;Example:
;* (compress '(a a a a b c c a a d e e e e))
;(A B C A D E)

(defn compress-1
  [ls]
  (if (empty? ls)
    []
    (->> (reduce (fn [acc x]
                   (if (= x (first acc))
                     acc
                     (cons x acc))) '() ls)
         (reverse))))

(defn compress-2
  [ls]
  (loop [ls ls
         acc []
         prev nil]
    (if (empty? ls)
      acc
      (let [[head & tail] ls]
        (if (= head prev)
          (recur tail acc prev)
          (recur tail (concat acc [head]) head))))))

(defn compress-3
  [ls]
  ((comp (partial map first)
         (partial partition-by identity)) ls))
