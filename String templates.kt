val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""

//untuk membuat string format dimana d{2} artinya ada 2 digit lalu month dan d{4} 4 digit yaitu tahun.
//contoh : 13 JUN 1992
