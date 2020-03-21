(ns testinput
  (:require
    [user]))

(defn -main [& _args]
  (println (:name user/*input*)))

