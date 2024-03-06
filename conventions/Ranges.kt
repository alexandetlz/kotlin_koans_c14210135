fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
//dapat digunakan untuk mengecek apakah date ada di antara first date dan last date. dapat ditulis secara efektif dengan ".."
