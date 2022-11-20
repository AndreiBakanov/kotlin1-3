package ru.netology

fun main() {
    val paymentSystem = "VK Pay"
    val paymentMemory = 0
    val sumOfMoney = 10000

        fun isTransferAvailable (paymentSystem: String, paymentMemory: Int, sumOfMoney: Int): Boolean {
        val daySumVkLimit = 15_000
        val monthSumVkLimit = 40_000
        val paymentSystemDayLimit = 150_000
        val paymentSystemMonthLimit = 600_000
        return when {
//            sumOfMoney > daySumVkLimit || sumOfMoney > monthSumVkLimit && paymentSystem == "VK Pay" -> false
//            sumOfMoney <= daySumVkLimit && sumOfMoney <= monthSumVkLimit && paymentSystem == "VK Pay" -> true
            // хотел также добавить проверку сумм по вк пей, но почему-то первая строка также всегда выдавала false
            // не зависимо от суммы
            sumOfMoney > paymentSystemDayLimit || paymentMemory > paymentSystemMonthLimit -> false
            else -> true
        }
   }
    fun commission(paymentSystem: String, paymentMemory: Int, sumOfMoney: Int): Int {
        val limitMasterMaestro = 75000
        val perSentCommissionMaster = 0.006
        val fixCommissionMaster = 20
        val minVisaCommission = 35
        val perSentCommissionVisa = 0.0075
        val relevantVisaCommission = (sumOfMoney * perSentCommissionVisa).toInt()
        return when {
            paymentMemory + sumOfMoney <= limitMasterMaestro && paymentSystem == "MasterCard" || paymentSystem == "Maestro" -> 0
            //paymentSystem == "MasterCard" || paymentSystem == "Maestro" && paymentMemory + sumOfMoney <= limitMasterMaestro  -> 0
            //Не понимаю почему один и тот же код компилируется по разному, вариант сверху всегда выдавал 0,
            //в не зависимости от суммы перевода
            paymentSystem == "MasterCard" || paymentSystem == "Maestro" && paymentMemory + sumOfMoney > limitMasterMaestro -> (sumOfMoney * perSentCommissionMaster + fixCommissionMaster).toInt()
            //paymentSystem == "МИР" || paymentSystem == "VISA" && relevantVisaCommission <= minVisaCommission -> minVisaCommission
            relevantVisaCommission <= minVisaCommission && paymentSystem == "МИР" || paymentSystem == "VISA"-> minVisaCommission
            paymentSystem == "МИР" || paymentSystem == "VISA" && relevantVisaCommission > minVisaCommission -> relevantVisaCommission
            else -> 0
        }
    }
    if (isTransferAvailable(paymentSystem, paymentMemory, sumOfMoney)) println("Перевод возможен. Комиссия составит " + commission(paymentSystem, paymentMemory, sumOfMoney))
    else println("Превышен лимит. Перевод невозможен.")
}