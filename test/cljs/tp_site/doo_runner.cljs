(ns tp-site.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [tp-site.core-test]))

(doo-tests 'tp-site.core-test)

