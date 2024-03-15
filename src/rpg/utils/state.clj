(ns rpg.utils.state
  (:require clojure.java.io))

(defn load-player []
  (let [sink "dump/player.edn"]
    (first (read-string (slurp sink)))))

(defn save-player [playerMap]
  (let [sink "dump/player.edn"]
    (clojure.java.io/make-parents sink)
    (spit sink (with-out-str (pr [playerMap])))))
