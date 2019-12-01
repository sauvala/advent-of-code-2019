(ns day-1.main
  (:require
    [clojure.string :as str]))

(defn -main [& args]
  (let [result (->> (slurp "input/day_1/input.txt")
                    (str/split-lines)
                    (map #(Integer/parseInt %))
                    (map #(int (Math/floor (/ % 3))))
                    (map #(- % 2))
                    (reduce +))]
    (println result)))