(ns mongoose.sugar
  (:require ["mongoose" :as mongoose]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Constructors
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; connect
(defn connect [uri options]
  "Opens the default mongoose connection."
  (.connect mongoose uri options))

(defn db []
  (.-connection mongoose))

(defn on [db evt call-back]
  (.on db evt call-back))

(defn once [db evt call-back]
  (.once db evt call-back))
;; schema

;; model