(ns day-1.part-1.main
  (:require
    [day-1.common :refer [calculate-fuel-for-modules]]))

(defn -main [& args]
  (let [result (->> (slurp "input/day_1/input.txt")
                    (calculate-fuel-for-modules))]
    (println result)))