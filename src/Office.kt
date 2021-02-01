import Interfaces.Employers
import Interfaces.Observer
import Interfaces.Subject
import Interfaces.Works

class Office(var cabinets: ArrayList<Observer> = ArrayList(), var employers: ArrayList<Works> = ArrayList()): Subject, Employers {

    private var number: Int = 0

    override fun addCab(o: Observer) {
        cabinets.add(o)
    }

    override fun addEmp(em: Works) {
        employers.add(em)
    }

    override fun notifyCabinets() {
        for (i in 0 until cabinets.size)
        {
            val cab: Observer = cabinets[i]
            number++
            cab.update(number)
        }
    }

    fun showAllCabinets() {
        notifyCabinets()
    }

    override fun notifyEmployers() {
        for (i in 0 until employers.size)
        {
            val emp: Works = employers[i]
            emp.upd("", "")
        }
    }

    fun showAllEmployers() {
        notifyEmployers()
    }


}