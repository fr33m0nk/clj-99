(ns clj-99.list.problem-09)

;Pack consecutive duplicates of list elements into sublists.
;If a list contains repeated elements they should be placed in separate sublists.

(defn pack-1
  [ls]
  (-> (loop [ls ls
             acc '()
             prev nil]
        (if (empty? ls)
          acc
          (let [[head & tail] ls]
            (if (and (seq? (first acc)) (= head prev))
              (recur tail (cons (cons head (first acc)) (rest acc)) head)
              (recur tail (cons (list head) acc) head)))))
      reverse))

(defn pack-2
  [ls]
  (-> (reduce (fn [acc x]
                (if (and (seq? (first acc)) (= (first (first acc)) x))
                  (cons (cons x (first acc)) (rest acc))
                  (cons (list x) acc))) () ls)
      reverse))

(defn pack-3
  [ls]
  (partition-by identity ls))

(defn pack-4
  [ls]
  (lazy-seq
    (when-let [s (seq ls)]
      (let [f (first s)
            repeated-elements (take-while #(= f %) s)]
        (cons repeated-elements (pack-4 (drop (count repeated-elements) s)))))))

