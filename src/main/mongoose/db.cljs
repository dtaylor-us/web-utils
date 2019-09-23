(ns mongoose.db
  (:require [mongoose.sugar :as mg]
            [taoensso.timbre :as log]))

(defn connection-handler []
  (do
    (log/debug "Successfully connected to data source.")))