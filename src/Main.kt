
import Cabinets.Cab
import Cabinets.Cabinet1
import Cabinets.Cabinet2
import Cabinets.Cabinet3
import Devices.Combine
import Devices.Printer
import Devices.Scanner
import Employers.Human
import Employers.Human1
import Employers.Human2
import Employers.Human3


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
    val cabinet1: Cab = Cabinet1(office)
    val cabinet2: Cab = Cabinet2(office)
    val cabinet3: Cab = Cabinet3(office)

    val h1: Human = Human1(office)
    val h2: Human = Human2(office)
    val h3: Human = Human3(office)

    office.addCab(cabinet1)  // добавление в офис кабинета под номером 1
    cabinet1.addDevice(comb)  // добавление в кабинет комбайна

    office.addCab(cabinet2)
    cabinet2.addDevice(scanner)

    office.addCab(cabinet3)
    cabinet3.addDevice(printer)

    h1.addInCab(cabinet1) // закрепление сотрудника за 1-ым кабинетом
    h1.addInCab(cabinet3)
    h1.addInCab(cabinet2)
    h2.addInCab(cabinet2)
    h2.addInCab(cabinet3)
    h3.addInCab(cabinet1)
    h3.addInCab(cabinet2)

    office.showAllCabinets() // вывод всех кабинетов с их устройствами
    println("")
    office.showAllEmployers()  // вывод всех работников с их кабинетами

}