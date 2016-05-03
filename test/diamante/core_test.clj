(ns diamante.core-test
  (:require [midje.sweet :refer :all]
            [diamante.core :refer :all]))

(fact "A normal test that should pass"
	(= 1 1) => true)


(fact "A normal test that should fail"
	(= 1 1) => true)


(fact "A normal test that should fail"
	(= 1 2) => true)
