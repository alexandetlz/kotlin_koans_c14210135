fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 2 == 0 }

// untuk mengecek apakah ada element yg genap di collection, akan return true walaupun hanya 1 element
