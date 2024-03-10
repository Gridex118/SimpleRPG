(ns rpg.state.save)
; Save player data to file

(defn savePlayer [playerMap]
  (spit "dump/player.edn" (with-out-str (pr [playerMap]))))
