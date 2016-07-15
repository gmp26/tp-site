(ns tp-site.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [tp-site.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[tp-site started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[tp-site has shut down successfully]=-"))
   :middleware wrap-dev})
