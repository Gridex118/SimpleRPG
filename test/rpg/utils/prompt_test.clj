(ns rpg.utils.prompt-test
  (:require [rpg.utils.prompt :as Prompt]
            [clojure.test :refer [deftest testing is]]))

(deftest prompt-test
  (let [options {:town "Go to Town" :explore "Move around" :status "Check status"}]
    (testing "Options printing"
      (is (nil? (Prompt/build-prompt options))))))
