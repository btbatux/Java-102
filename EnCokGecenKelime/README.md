# En Çok Geçen Kelimeyi Bulma
kelimeSayilari.entrySet() ifadesi, kelimeSayilari adlı HashMap'in içindeki her bir anahtar-değer çiftini temsil eden bir Set döndürür. Her bir çift, Map.Entry<K, V> türünden bir nesne olarak temsil edilir, burada K anahtarın türünü ve V değerin türünü temsil eder.

Map.Entry<String, Integer> ifadesi, bu anahtar-değer çiftlerinin hangi türde olduğunu belirtir. Burada anahtar (kelime) String türünde ve değer (kelimenin sayısı) Integer türündedir.

for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) ifadesi ise bu anahtar-değer çiftlerini döngü ile işlemek için kullanılır. Her döngü adımında entry adı verilen bir Map.Entry<String, Integer> nesnesi oluşturulur ve bu nesne, döngü içinde kullanılabilir. Bu şekilde, kelimeSayilari HashMap'inin içindeki her bir anahtar-değer çifti üzerinde işlem yapılabilir. Bu durumda, her bir entry nesnesi bir kelimeyi ve bu kelimenin metinde kaç kez geçtiğini temsil eder.