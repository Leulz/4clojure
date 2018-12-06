(fn [& functions]
  (loop [composed identity
         funclist functions]
    (if (empty? funclist)
      composed
      (if (= identity composed)
        (recur (fn [& args] (apply (last funclist) args)) (butlast funclist))
        (recur (fn [& args] ((last funclist) (apply composed args))) (butlast funclist))
        )
      )
    )
  )
