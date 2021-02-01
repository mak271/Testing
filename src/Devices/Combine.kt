package Devices

import Devices.Dev



class Combine(var id: Int): Dev() {

    override fun toString(): String {
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