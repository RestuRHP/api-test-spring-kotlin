package net.learn.restapi.datasource

import net.learn.restapi.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = mutableListOf(
            Bank("1234", 3.14, 17),
            Bank("1010", 17.0, 0),
            Bank("1234", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.firstOrNull { it.accountNumber == accountNumber }
                ?: throw NoSuchElementException("Could not find a bank account number $accountNumber")
    }

    override fun createBank(bank: Bank): Bank {
        if (banks.any{it.accountNumber == bank.accountNumber}){
            throw IllegalAccessException("Bank with account number ${bank.accountNumber} already exists.")
        }
        banks.add(bank)

        return bank
    }


}