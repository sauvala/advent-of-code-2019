(ns day-1.common
  (:require [clojure.string :as str]))

(defn fuel-amount
  [masses]
  (->> masses
    (map #(int (Math/floor (/ % 3))))
    (map #(- % 2))))

(defn calculate-fuel-for-modules
  [input]
  (->> input
       (str/split-lines)
       (map #(Integer/parseInt %))
       (fuel-amount)
       (reduce +)))
