package Employers

import Cabinets.Cab
import Interfaces.Employers
import Interfaces.Works

abstract class Human(var name: String, var surname: String, emp: Employers): Works {

    init {
        emp.addEmp(this)
    }

    var cabinets = ArrayList<Cab>()

    override fun upd(name: String, surname: String) {
        display(cabinets)
    }

    private fun display(list: List<Cab>) {
        print("$name $surname works in: ")
        for (cab: Cab in list)
            print("$cab; ")
        println("")
    }

    override fun toString(): String {
        return "$name $surname"
    }

    fun addInCab(cab: Cab) {
        cabinets.add(cab)
    }

}