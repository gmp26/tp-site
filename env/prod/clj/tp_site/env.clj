(ns tp-site.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[tp-site started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[tp-site has shut down successfully]=-"))
   :middleware identity})
