class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}

//contoh value yang dimasukkan ke library dan memanggilnya lewat library
