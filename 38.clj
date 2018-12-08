(fn [& nums] (reduce (fn [res value] (if (> value res) value res)) Integer/MIN_VALUE nums))
