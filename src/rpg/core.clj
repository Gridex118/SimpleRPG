(ns rpg.core
  (:require [rpg.state.save :as stateSave])
  (:require [rpg.state.load :as stateLoad]))

(defn -main [& args]
  (let [playerMap {:name "X" :class "Y"}]
    (stateSave/savePlayer playerMap))
  )
