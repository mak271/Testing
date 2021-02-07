package Devices

abstract class Dev {
    fun enableDevice() {
        println("Включение..")
    }
    fun disableDevice() {
        println("Выключение..")
    }
}
// Методы абстрактного класса могут быть использованы только классами-наследниками