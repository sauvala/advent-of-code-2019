(ns day-1.part-2.main
  (:require
    [day-1.common :refer [convert-input calc-module-fuel calc-total-fuel]]))

(defn -main [& args]
  (let [total-fuel (-> (slurp "input/day_1/input.txt")
                       convert-input
                       calc-module-fuel
                       calc-total-fuel)]
    (println total-fuel)))
