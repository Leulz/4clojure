(fn [s] (reduce (fn [res elem] (conj res elem elem)) [] s))
