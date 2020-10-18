(ns clojure-script-tests.core
    (:require ))

(enable-console-print!)

(println "This text is printed from src/clojure-script-tests/core.cljs. Go ahead and edit it and see reloading in actionTTTT.")
(println "Hello world2")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;;(swap! app-state update-in [:__figwheel_counter] inc)
  
  ;;(js/alert @app-state)
  (js/alert @app-state)
)
