(defproject mogenslund/liquid "2.0.0" ;"2.0.0-SNAPSHOT"
  :description "This project is an attempt to create a text editor for editing
               Clojure files and Markdown files. It operates primarily in a
               terminal, but with dynamics and extensibilities inspired by
               Emacs and Vim.
               The best place to start is to watch the demo video."
  :url "https://github.com/mogenslund/liquid"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.json "0.2.6"]]
  ;:main ^:skip-aot liq.core
  :main liq.core
  :resource-paths ["resources"]
  :target-path "target/%s"
  :clean-targets ^{:protect false} [:target-path]
  :plugins [[lein-codox "0.10.4"]]
  :profiles {:uberjar {:aot :all}}
  :aliases {"dev" ["run" "--load=.liq"]})