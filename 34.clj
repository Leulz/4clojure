(fn [begin end] (loop [res []
                       cur begin]
                         (if (>= cur end)
                           res
                           (recur (conj res cur) (inc cur)))))
