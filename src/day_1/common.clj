(ns day-1.common
  (:require [clojure.string :as str]))

(defn calculate-fuel-for-modules
  [input]
  (->> input
       (str/split-lines)
       (map #(Integer/parseInt %))
       (map #(int (Math/floor (/ % 3))))
       (map #(- % 2))
       (reduce +)))