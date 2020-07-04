(ns clj-99.list.problem-03-test
  (:require
    [clojure.test :refer :all]
    [clj-99.list.problem-03 :refer :all]))

(deftest element-at-1-test
  (testing "should return c when index k = 3"
    (is (= "c" (element-at-1 (list "a" "b" "c" "d") 3))))
  (testing "should return nil when index k = 4 and list has 3 elements"
    (is (nil? (element-at-1 (list "a" "b" "c") 4))))
  (testing "should return nil when index k = 4 and list is empty"
    (is (nil? (element-at-1 (list) 4)))))

(deftest element-at-2-test
  (testing "should return c when index k = 3"
    (is (= "c" (element-at-2 (list "a" "b" "c" "d") 3))))
  (testing "should return nil when index k = 4 and list has 3 elements"
    (is (nil? (element-at-2 (list "a" "b" "c") 4))))
  (testing "should return nil when index k = 4 and list is empty"
    (is (nil? (element-at-2 (list) 4)))))

(deftest element-at-3-test
  (testing "should return c when index k = 3"
    (is (= "c" (element-at-3 (list "a" "b" "c" "d") 3))))
  (testing "should return nil when index k = 4 and list has 3 elements"
    (is (nil? (element-at-3 (list "a" "b" "c") 4))))
  (testing "should return nil when index k = 4 and list is empty"
    (is (nil? (element-at-3 (list) 4)))))

(deftest element-at-4-test
  (testing "should return c when index k = 3"
    (is (= "c" (element-at-4 (list "a" "b" "c" "d") 3))))
  (testing "should return nil when index k = 4 and list has 3 elements"
    (is (nil? (element-at-4 (list "a" "b" "c") 4))))
  (testing "should return nil when index k = 4 and list is empty"
    (is (nil? (element-at-4 (list) 4)))))
