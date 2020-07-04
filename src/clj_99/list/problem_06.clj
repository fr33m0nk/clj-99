(ns clj-99.list.problem-06)

;Find out whether a list is a palindrome
;A palindrome can be read forward or backward; e.g. (x a m a x).

(defn palindrome-1?
  [ls]
  (if (empty? ls)
    false
    (= ls (reverse ls))))

(defn palindrome-2?
  [ls]
  (if (empty? ls)
    false
    (= ls (apply conj () ls))))

(defn palindrome-3?
  [ls]
  (if (empty? ls)
    false
    (= (compare (vec ls)
                (vec (apply conj () ls)))
       0)))