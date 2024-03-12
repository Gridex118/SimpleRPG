(ns rpg.utils.state
  (:require clojure.java.io))

(defn loadPlayer []
  (let [sink "dump/player.edn"]
    (first (read-string (slurp sink)))))

(defn savePlayer [playerMap]
  (let [sink "dump/player.edn"]
    (clojure.java.io/make-parents sink)
    (spit sink (with-out-str (pr [playerMap])))))
