
import Devices.Combine
import Devices.Printer
import Devices.Scanner

fun main() {

    val comb = Combine(12)
    comb.laser()
    comb.copy()
    val scanner = Scanner(475)
    scanner.scan()
    val printer = Printer(458)
    printer.spray()

    println("")

    val office = Office()
    val cabinet1 = Cabinet(1)
    val cabinet2 = Cabinet(2)
    val cabinet3 = Cabinet(4)

    val h1 = Employer("Ivan", "Petrov")
    val h2 = Employer("Alex", "Veselov")
    val h3 = Employer("Maxim", "Vlasov")

    office.addEmp(h1) // добавление работника в офис
    office.addEmp(h2)
    office.addEmp(h3)

    office.addCab(cabinet1) // добавление в офис кабинета под номером 1
    cabinet1.addDevice(comb)  // добавление в кабинет комбайна

    office.addCab(cabinet2)
    cabinet2.addDevice(scanner)

    office.addCab(cabinet3)
    cabinet3.addDevice(printer)

    cabinet1.addEmployer(h1) // добавление работника в кабинет
    cabinet1.addEmployer(h2)
    cabinet2.addEmployer(h1)
    cabinet2.addEmployer(h3)
    cabinet3.addEmployer(h2)
    cabinet3.addEmployer(h3)

    office.showAllCabinets() // вывод всех кабинетов с их устройствами
    println("")
    office.showAllEmployers()  // вывод всех работников с их кабинетами

}