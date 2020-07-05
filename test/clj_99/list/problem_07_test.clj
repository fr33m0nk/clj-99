(ns clj-99.list.problem-07-test
  (:require
    [clojure.test :refer :all]
    [clj-99.list.problem-07 :refer :all]))

(deftest my-flatten-1-test
  (testing "should flatten and return the a flat list"
    (is (= '(:a :b :c :d :e :f :g :h :i :j) (my-flatten-1 [:a [:b [:c [:d [:e [:f] :g] :h] :i] :j]]))))
  (testing "should return a empty list for input empty list"
    (is (coll? (my-flatten-1 '())))
    (is (empty? (my-flatten-1 '())))))

(deftest my-flatten-2-test
  (testing "should flatten and return the a flat list"
    (is (= '(:a :b :c :d :e :f :g :h :i :j) (my-flatten-2 [:a [:b [:c [:d [:e [:f] :g] :h] :i] :j]]))))
  (testing "should return a empty list for input empty list"
    (is (coll? (my-flatten-2 '())))
    (is (empty? (my-flatten-2 '())))))
