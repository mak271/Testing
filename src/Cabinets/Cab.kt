package Cabinets

import Devices.Dev
import Interfaces.Observer
import Interfaces.Subject

abstract class Cab(office: Subject) : Observer {

    private var device: String = ""
    private var number: Int = 0

    override fun toString(): String {
        return "Cabinet $number"
    }

    fun addDevice(dev: Dev) {
        device = dev.toString()
    }

    override fun update(number: Int) {
        this.number = number
        display()
    }

    private fun display() {
        println("Cabinet $number with $device")
    }





}