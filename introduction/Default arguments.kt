fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)

//menggantikan function yang panjang (bawah) dengan function yang lebih pendek dan efektif (atas).
//function ini membuat yang toUpperCasenya true menjadi upper case dan yang tidak maka tetap
