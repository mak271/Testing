import Devices.Dev

class Cabinet(var number: Int) : Display {

    private var device: String = ""
    private var employers = ArrayList<Employer>()

    fun addDevice(dev: Dev) {
        device = dev.toString()
    }

    override fun displayDev() {
        println("Cabinet $number with $device")
    }


    fun addEmployer(employer: Employer)
    {
        employers.add(employer).toString()
    }

    override fun displayEmp() {
            println("Cabinet $number: $employers")
    }

}