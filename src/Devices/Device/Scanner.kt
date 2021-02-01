package Devices.Device

import Devices.Dev


class Scanner(var id: Int): Dev() {

    override fun toString(): String {
        return "Scanner №$id"
    }

    fun scan() {
        println("scan...")
    }

}