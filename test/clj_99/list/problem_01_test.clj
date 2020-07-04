(ns clj-99.list.problem-01-test
  (:require
    [clojure.test :refer :all]
    [clj-99.list.problem-01 :refer :all]))

(deftest my-last-1-test
  (testing "should return the last element of list"
    (is (is (= "d" (my-last-1 (list "a" "b" "c" "d"))))))
  (testing "should return nil if the list is empty"
    (is (nil? (my-last-1 (list))))))

(deftest my-last-2-test
  (testing "should return the last element of list"
    (is (is (= "d" (my-last-2 (list "a" "b" "c" "d"))))))
  (testing "should return nil if the list is empty"
    (is (nil? (my-last-2 (list))))))
