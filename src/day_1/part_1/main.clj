(ns day-1.part-1.main
  (:require
    [day-1.common :refer [convert-input calc-module-fuel]]))

(defn -main [& args]
  (let [result (->> (slurp "input/day_1/input.txt")
                    convert-input
                    calc-module-fuel
                    (reduce +))]
    (println result)))