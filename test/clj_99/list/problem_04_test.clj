(ns clj-99.list.problem-04-test
  (:require
    [clojure.test :refer :all]
    [clj-99.list.problem-04 :refer :all]))



(deftest count-of-elements-1-test
  (testing "should return a length of 4"
    (is (= 4 (count-of-elements-1 (list 1 2 3 4)))))
  (testing "should return a length of 0"
    (is (= 0 (count-of-elements-1 (list)))))
  (testing "should return a length of 5"
    (is (= 5 (count-of-elements-1 (list 1 2 3 4 5))))))

(deftest count-of-elements-2-test
  (testing "should return a length of 4"
    (is (= 4 (count-of-elements-2 (list 1 2 3 4)))))
  (testing "should return a length of 0"
    (is (= 0 (count-of-elements-2 (list)))))
  (testing "should return a length of 5"
    (is (= 5 (count-of-elements-2 (list 1 2 3 4 5))))))

(deftest count-of-elements-3-test
  (testing "should return a length of 4"
    (is (= 4 (count-of-elements-3 (list 1 2 3 4)))))
  (testing "should return a length of 0"
    (is (= 0 (count-of-elements-3 (list)))))
  (testing "should return a length of 5"
    (is (= 5 (count-of-elements-3 (list 1 2 3 4 5))))))
