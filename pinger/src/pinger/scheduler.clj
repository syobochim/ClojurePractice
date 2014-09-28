(ns pinger.scheduler
  (:import (java.util.concurrent ThreadPoolExecutor
                                ScheduledThreadPoolExecutor TimeUnit)))

(defn scheduled-executor
  "Create a scheduled executor."
  ^ScheduledThreadPoolExecutor [threads]
  (ScheduledThreadPoolExecutor. threads))

(defn periodcally
  "Schedule function f to run on executor e every 'delay'
  milliseconds after a delay of 'initial-delay' Returns
  a ScheduleFuture."
  ^ScheduledFuture [e f & {:keys [initial-delay delay]}]
  (.scheduleWithFixedDelay
   e f
   initial-delay delay
   TimeUnit/MILLISECONDS))

(defn shutdown-executor
  "Shutdown an executor."
  [^ThreadPoolExecutor e]
  (.shutdown e))

