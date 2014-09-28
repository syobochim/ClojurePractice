(ns pinger.core
  (:import (java.net URL HttpURLConnection))
  (:require [pinger.scheduler :as scheduler])
  (:gen-class))

(defn response-code [address]
  (let [conn ^HttpURLConnection (.openConnection (URL. address))
        code (.getResponseCode conn)]
    (when (< code 400)
      (-> conn .getInputStream .close))
    code))

(defn available? [address]
  (= 200 (response-code address)))

(defn check []
  (let [addresses '("https://github.com/syobochim"
                    "https://twitter.com/syobochim"
                    "http://google.com/badurl")]
    (doseq [address addresses]
      (println (available? address)))))

(def immediately 0)
(def every-minute (* 60 1000))

(defn start [e]
  "REPL helper. Start pinger on executor e."
  (scheduler/periodcally e check
                         :initial-delay immediately
                         :delay every-minute))

(defn stop [e]
  "REPL helper. Stop executor e."
  (scheduler/shutdown-executor e))

(defn -main []
  (start (scheduler/scheduled-executor 1)))
