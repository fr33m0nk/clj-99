(ns clj-99.list.problem-11)

;Modified run-length encoding.
;Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N E) lists.
;
;Example:
;* (encode-modified '(a a a a b c c a a d e e e e))
;((4 A) B (2 C) (2 A) D (4 E))

(defn encode-modified-1
  [ls]
  ((comp
     (partial map #(let [c (count %)
                         e (first %)]
                     (if (= c 1)
                       e
                       (list c e))))
     (partial partition-by identity)) ls))

(defn encode-modified-2
  [ls]
  (lazy-seq
    (when-let [s (seq ls)]
      (let [e (first s)
            repeated (take-while #(= e %) s)
            count-of-repetition (count repeated)
            value-or-count-of-repeated (if (= count-of-repetition 1)
                                         e
                                         (list count-of-repetition e))]
        (cons value-or-count-of-repeated (encode-modified-2 (drop count-of-repetition s)))))))
