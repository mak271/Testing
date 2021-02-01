package Devices.Device

import Devices.Dev

class Printer(var id: Int): Dev() {

    override fun toString(): String {
        return "Printer №$id"
    }

    fun spray() {
        println("spray...")
    }

}