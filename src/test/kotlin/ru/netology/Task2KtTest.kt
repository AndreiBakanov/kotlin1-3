package ru.netology

import org.junit.Test

import org.junit.Assert.*

class Task2KtTest {

    @Test
    fun commissionMasterZero() {
        val paymentSystemTest = "MasterCard"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 10000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(0, result)
    }
    @Test
    fun commissionMaestroZero() {
        val paymentSystemTest = "Maestro"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 10000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(0, result)
    }
    @Test
    fun commissionMasterNoZero() {
        val paymentSystemTest = "MasterCard"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 100000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(620, result)
    }
    @Test
    fun commissionMaestroNoZero() {
        val paymentSystemTest = "Maestro"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 100000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(620, result)
    }
    @Test
    fun commissionVisa35() {
        val paymentSystemTest = "VISA"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 4000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(35, result)
    }
    @Test
    fun commissionMir35() {
        val paymentSystemTest = "МИР"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 4000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(35, result)
    }

    @Test
    fun commissionVisaNo35() {
        val paymentSystemTest = "VISA"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 10000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(75, result)
    }
    @Test
    fun commissionMirNo35() {
        val paymentSystemTest = "МИР"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 10000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(75, result)
    }

    @Test
    fun commissionVkZero() {
        val paymentSystemTest = "VK Pay"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 10000
        val result = commission(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(0, result)
    }

    @Test
    fun isTransferAvailableVkTrue() {
        val paymentSystemTest = "VK Pay"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 10000
        val result = isTransferAvailable(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(true, result)
    }
    @Test
    fun isTransferAvailableVkFalse() {
        val paymentSystemTest = "VK Pay"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 16000
        val result = isTransferAvailable(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(false, result)
    }
    @Test
    fun isTransferAvailableTrue() {
        val paymentSystemTest = "VISA"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 10000
        val result = isTransferAvailable(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(true, result)
    }
    @Test
    fun isTransferAvailableFalse() {
        val paymentSystemTest = "VISA"
        val paymentMemoryTest = 0
        val sumOfMoneyTest = 1000000
        val result = isTransferAvailable(paymentSystem = paymentSystemTest, paymentMemory = paymentMemoryTest, sumOfMoney = sumOfMoneyTest)
        assertEquals(false, result)
    }
}