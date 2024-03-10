package lesson_2

fun main(){
    val employeeCount = 50
    val employeeSalary = 30000
    val internCount = 30
    val internSalary = 20000

    val permanentEmployeeSalary = employeeCount * employeeSalary
    val allSalary = permanentEmployeeSalary + (internCount * internSalary)
    val averageSalary = allSalary / (employeeCount + internCount)

    println("Расходы на выплату зарплаты для постоянных сотрудников: ${String.format("%,d", permanentEmployeeSalary)}")
    println("Общие расходы по ЗП после прихода стажеров: ${String.format("%,d", allSalary)}")
    println("Средняя ЗП одного сотрудника после устройства стажеров: ${String.format("%,d", averageSalary)}")
}