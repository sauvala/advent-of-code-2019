(ns day-1.common
  (:require [clojure.string :as str]))

(defn convert-input
  [input]
  (->> input
       str/split-lines
       (map #(Integer/parseInt %))))

(defn fuel-for-mass
  [mass]
  (-> mass
      (/ 3)
      Math/floor
      int
      (- 2)))

(defn calc-module-fuel
  [module-masses]
  (map fuel-for-mass module-masses))

(defn calc-total-fuel-vec
  [fuel-mass fuel-masses]
  (if (pos? fuel-mass)
    (recur (fuel-for-mass fuel-mass) (conj fuel-masses fuel-mass))
    fuel-masses))

(defn calc-total-fuel
  [modules-fuel]
  (->> modules-fuel
       (map #(calc-total-fuel-vec % []))
       flatten
       (reduce +)))
