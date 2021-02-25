package net.learn.restapi.datasource

import net.learn.restapi.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank

}