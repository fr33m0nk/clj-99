(ns clj-99.list.problem-05-test
  (:require
    [clojure.test :refer :all]
    [clj-99.list.problem-05 :refer :all]))

(deftest my-reverse-01-test
  (testing "should reverse the list"
    (is (= '(5 4 3 2 1) (my-reverse-01 '(1 2 3 4 5)))))
  (testing "should return empty list for an empty list"
    (is (= '() (my-reverse-01 '())))))

(deftest my-reverse-02-test
  (testing "should reverse the list"
    (is (= '(5 4 3 2 1) (my-reverse-02 '(1 2 3 4 5)))))
  (testing "should return empty list for an empty list"
    (is (= '() (my-reverse-02 '())))))

(deftest my-reverse-03-test
  (testing "should reverse the list"
    (is (= '(5 4 3 2 1) (my-reverse-03 '(1 2 3 4 5)))))
  (testing "should return empty list for an empty list"
    (is (= '() (my-reverse-03 '())))))

(deftest my-reverse-04-test
  (testing "should reverse the list"
    (is (= '(5 4 3 2 1) (my-reverse-04 '(1 2 3 4 5)))))
  (testing "should return empty list for an empty list"
    (is (= '() (my-reverse-04 '())))))
