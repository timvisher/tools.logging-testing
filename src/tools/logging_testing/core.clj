(ns tools.logging-testing.core
  (:use [clojure.tools.logging :only (info error)]))

(defn divide [x y]
  (try
    (error "dividing" x "by" y)
    (/ x y)
    (catch Exception ex
      (error ex "There was an error in calculation"))))
