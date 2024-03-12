(ns rpg.core
  (:require [rpg.utils.state :as State]))

(defn -main [& args]
  (let [playerMap {:name "X" :class "Y"}]
    (State/savePlayer playerMap))
  )
