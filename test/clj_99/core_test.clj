(ns clj-99.core-test
  (:require [clojure.test :refer :all]
            [clj-99.core :refer :all]))

(deftest a-test
  (testing "I always pass :)"
    (is (= 1 1))))
