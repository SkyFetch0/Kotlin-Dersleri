// Kotlin Tabanlı Basit Hesap Makinası 
fun test() {
    print("Veri Girin: ")
    val name = readln();
    println("Merhaba, $name")
    print("Yapacak İşlem Seçiniz: 1- toplama, 2- çıkarma, 3- çarpma, 4- bölme")
    val islem = readln()
    print("Sayı 1: ")
    val v1 = readln().toInt()
    print("Sayı 2: ")
    val v2= readln().toInt()
    if(islem == "1"){
        println("Cevap: ${v1 + v2}")

    }
}
data class Sayilar(val sayi1:Int, val sayi2:Int)
fun girdi_al() : Sayilar {
    print("Sayi 1: ")
    val sayi1= readln().toInt()
    print("Sayi 2: ")
    val sayi2= readln().toInt()
    return Sayilar(sayi1,sayi2);
}

fun toplama() {
    val s = girdi_al()
    print("Sonuc: ${s.sayi1 + s.sayi2}")
}
fun cikarma() {
    val s = girdi_al()
    print("Sonuc: ${s.sayi1 - s.sayi2}")
}
fun carpma() {
    val s = girdi_al()
    print("Sonuc: ${s.sayi1 * s.sayi2}")
}
 fun hata(c:Int,S1:Int,S2:Int) : Boolean{

     when(c) {
         4 -> {
             if (S2 == 0) {
                 println("Hata: Bir sayı sıfıra bölünemez!")
                 return true
             }
         }
     }

    return false
}
fun bolme() {
    val s = girdi_al()
    if(hata(4,s.sayi1,s.sayi2))
        return
    print("Sonuc: ${s.sayi1 / s.sayi2}")
}

fun gui_start() {

   for(i in 0..40){
       print("\n")

   }
    println("Skyfetch Kotlin Tabanlı Hesap Makinası V0.1")

    println("Yapılacak İşlem Seçin\n1-Toplama\t3-Carpma\n2-Cikarma\t4-Bolme")
    print("Seçim: ")
    val secim = readln().toInt()
    when(secim) {
        1 -> toplama()
        2 -> cikarma()
        3 -> carpma()
        4 -> bolme()
    }

}


fun main() {

    gui_start()

}
