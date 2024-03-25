(ns rpg.utils.prompt-options)

(defn build-prompt [options]
  (doseq [opt options]
    (println (str (second opt) " " (first opt))))
  (print "Enter your choice: ")
  (flush))
