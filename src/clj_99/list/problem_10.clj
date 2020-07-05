(ns clj-99.list.problem-10)

;Run-length encoding of a list.
;Use the result of problem P09 to implement the so-called run-length encoding data compression method.
;Consecutive duplicates of elements are encoded as lists (N E) where N is the number of duplicates of
;the element E.

(defn encode-1
  [ls]
  ((comp
     (partial map #(list (count %) (first %)))
     (partial partition-by identity)) ls))

(defn encode-2
  [ls]
  (lazy-seq
    (when-let [s (seq ls)]
      (let [f (first s)
            repeated (take-while #(= f %) s)
            count-of-repeated (count repeated)]
        (cons (list count-of-repeated f)
              (encode-2 (drop count-of-repeated s)))))))
