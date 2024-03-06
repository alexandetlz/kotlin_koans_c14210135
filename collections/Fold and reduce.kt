// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =customers.map(Customer::getOrderedProducts).reduce { orderedByAll, customer ->
        orderedByAll.intersect(customer)
    }

fun Customer.getOrderedProducts(): Set<Product> =
    orders.flatMap(Order::products).toSet()

//fold() = menghasilkan value tunggal dari koleksi
//reduce = memggunakan akumulator dimulai dengan elemen pertama dalam koleksi, bukan value awal yang diteruskan sebagai argumen
