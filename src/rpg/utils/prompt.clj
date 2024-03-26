(ns rpg.utils.prompt)

(defn build-prompt [options]
  (doseq [opt options]
    (println (str (second opt) " " (first opt))))
  (print "Enter your choice: ")
  (flush))
