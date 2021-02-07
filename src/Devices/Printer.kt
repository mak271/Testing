package Devices

class Printer(private var id: Int): Dev() {

    override fun toString(): String {
        return "Printer №$id"
    }

    fun spray() {
        println("spray...")
    }

}