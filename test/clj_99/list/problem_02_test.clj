(ns clj-99.list.problem-02-test
  (:require
    [clojure.test :refer :all]
    [clj-99.list.problem-02 :refer :all]))

(deftest my-but-last-test
  (testing "should return c as the second but last element"
    (is (= "c" (my-but-last (list "a" "b" "c" "d")))))
  (testing "should return a as the second but last element"
    (is (= "a" (my-but-last (list "a" "b")))))
  (testing "should return nil as the second but last element"
    (is (nil? (my-but-last (list "a")))))
  (testing "should return nil if the list is empty as the second but last element"
    (is (nil? (my-but-last (list))))))
