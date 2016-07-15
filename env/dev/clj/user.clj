(ns user
  (:require [mount.core :as mount]
            [tp-site.figwheel :refer [start-fw stop-fw cljs]]
            tp-site.core))

(defn start []
  (mount/start-without #'tp-site.core/repl-server))

(defn stop []
  (mount/stop-except #'tp-site.core/repl-server))

(defn restart []
  (stop)
  (start))


