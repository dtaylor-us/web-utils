(ns mongoose.db
  (:require [mongoose.sugar :as mg]
            [taoensso.timbre :as log]))

(defn connection-handler []
  (do
    (log/debug "Successfully connected to data source.")))

(defn connect [uri]
  (do
    (mg/connect uri (clj->js {:useNewUrlParser true :useUnifiedTopology true}))
    (-> (mg/db)
        (mg/on "error" (fn [] (log/debug "ERROR::: Connection to data source could not be established.")))
        (mg/once "open" (fn [] (connection-handler))))))