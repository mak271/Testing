import Devices.Dev

class Cabinet(private var number: Int) : Display { // используется модификатор доступа private(инкапсуляция),
                                                   // чтобы пользователь не мог самолично менять номер кабинета
    private lateinit var device: Dev
    private var employers = ArrayList<Employer>()

    fun addDevice(dev: Dev) {
        device = dev
    }

    override fun displayDev() {
        println("Cabinet $number with $device")
    }


    fun addEmployer(employer: Employer) {
        employers.add(employer)
    }

    override fun displayEmp() {
            println("Cabinet $number: $employers")
    }

}