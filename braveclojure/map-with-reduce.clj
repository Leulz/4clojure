(defn map-with-reduce [f coll] (reduce (fn [res elem] (conj res (f elem))) (empty coll) coll))
