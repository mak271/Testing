package Devices

class Combine(private var id: Int): Dev() { // идёт наследование от абстрактного класса-родителя

    override fun toString(): String { // используется полиморфизм, так как задействуются разные реализации данного метода
        return "Combine №$id"
    }

    fun laser() {
        println("laser...")
    }

    fun scan() {
        println("scan...")
    }

    fun copy() {
        println("copy...")
    }


}