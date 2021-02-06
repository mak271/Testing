
class Office(private var cabinets: ArrayList<Cabinet> = ArrayList(), private var employers: ArrayList<Employer> = ArrayList()) {

    fun addCab(cab: Cabinet) {
        cabinets.add(cab)
    }

    fun addEmp(em: Employer) {
        employers.add(em)
    }

    fun showAllCabinets() { // пробегаем по всем кабинетам и выводим все кабинеты с их устройствами, благодаря интерфейсу Display
        for (i in 0 until cabinets.size)
        {
            val cab: Display = cabinets[i]
            cab.displayDev()
        }
    }

    fun showAllEmployers() {  // пробегаем по всем кабинетам и выводим всех сотрудников с их кабинетами
        for (i in 0 until cabinets.size)
        {
            val emp: Display = cabinets[i]
            emp.displayEmp()
        }
    }

}