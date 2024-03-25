(ns rpg.utils.prompt-options-test
  (:require [rpg.utils.prompt-options :as PromptOptions]
            [clojure.test :refer [deftest testing is]]))

(deftest prompt-test
  (let [options {:town "Go to Town" :explore "Move around" :status "Check status"}]
    (testing "Options printing"
      (is (nil? (PromptOptions/build-prompt options))))))
