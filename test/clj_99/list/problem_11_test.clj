(ns clj-99.list.problem-11-test
  (:require
    [clojure.test :refer :all]
    [clj-99.list.problem-11 :refer :all]))

(deftest encode-modified-1-test
  (testing "should return a collection of frequency and element as a tuple"
    (is (= '((3 "a") "b" (2 "c") (3 "d") "e") (encode-modified-1 '("a" "a" "a" "b" "c" "c" "d" "d" "d" "e")))))
  (testing "should return empty list with 0 if input list is 0"
    (is (= '() (encode-modified-1 '())))))

(deftest encode-modified-2-test
  (testing "should return a collection of frequency and element as a tuple"
    (is (= '((3 "a") "b" (2 "c") (3 "d") "e") (encode-modified-2 '("a" "a" "a" "b" "c" "c" "d" "d" "d" "e")))))
  (testing "should return empty list with 0 if input list is 0"
    (is (= '() (encode-modified-2 '())))))
