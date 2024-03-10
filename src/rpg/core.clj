(ns rpg.core
  (:require [rpg.state.save :as stateSave])
  (:require [rpg.state.load :as stateLoad]))

(let [playerMap {:name "X" :class "Y"}]
  (stateSave/savePlayer playerMap))
