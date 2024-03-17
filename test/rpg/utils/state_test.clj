(ns rpg.utils.state-test
  (:require [rpg.utils.state :as State]
            [clojure.test :refer [deftest testing is]]))

(deftest save-load
  (testing "Player loading and saving"
  (let [player-to-save {:name "Bjarne" :hp 100 :class "SE"}]
    (State/save-player player-to-save)
    (let [loaded-player (State/load-player)]
      (is (= loaded-player player-to-save))))))
