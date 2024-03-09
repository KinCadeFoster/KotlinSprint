package lesson_2

const val EMPLOYEE_COUNT = 50
const val EMPLOYEE_SALARY = 30000
const val INTERN_COUNT = 30
const val INTERN_SALARY = 20000

fun main(){
    val permanentEmployeeSalary = EMPLOYEE_COUNT * EMPLOYEE_SALARY
    val allSalary = permanentEmployeeSalary + (INTERN_COUNT * INTERN_SALARY)
    val averageSalary = allSalary / (EMPLOYEE_COUNT + INTERN_COUNT)

    println("Расходы на выплату зарплаты для постоянных сотрудников: ${String.format("%,d", permanentEmployeeSalary)}")
    println("Общие расходы по ЗП после прихода стажеров: ${String.format("%,d", allSalary)}")
    println("Средняя ЗП одного сотрудника после устройства стажеров: ${String.format("%,d", averageSalary)}")
}