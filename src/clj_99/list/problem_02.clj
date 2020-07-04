(ns clj-99.list.problem-02)

;(*) Find the last but one box of a list.
;Example:
;* (my-but-last '(a b c d))
;(C D)

(defn my-but-last
  [[head snd & tail]]
  (if (nil? snd)
    nil
    (if (empty? tail)
      head
      (recur (cons snd tail)))))