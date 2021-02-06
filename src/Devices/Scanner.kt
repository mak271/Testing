package Devices

class Scanner(private var id: Int): Dev() {

    override fun toString(): String {
        return "Scanner №$id"
    }

    fun scan() {
        println("scan...")
    }

}