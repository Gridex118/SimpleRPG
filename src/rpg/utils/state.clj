(ns rpg.utils.state)

(defn loadPlayer []
  (first (read-string (slurp "dump/player.edn"))))

(defn savePlayer [playerMap]
  (spit "dump/player.edn" (with-out-str (pr [playerMap]))))
