(ns rpg.state.load)
; Load player data from file

(defn loadPlayer []
  (first (read-string (slurp "dump/player.edn"))))
