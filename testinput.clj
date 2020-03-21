(ns testinput
  (:require
    [user]))

(defn -main [& _args]
  (println (:name user/*input*)))

(ns user (:require [testinput])) (apply testinput/-main *command-line-args*)