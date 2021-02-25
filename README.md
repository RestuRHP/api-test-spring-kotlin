### MockBankDataSource
` 
    val banks = listOf(
            Bank("1234", 3.14, 17),
            Bank("1010", 17.0, 0),
            Bank("1234", 0.0, 100)
    )
`


# API Spec

## Get Bank Account
Request :
- Method : GET
- Endpoint : `/api/banks/{accountNumber}`
- Header :
    - Accept: application/json

Response :

```json 
{
    "accountNumber": "1010",
    "trust": 17.0,
    "transactionFee": 0
}
```

## Create Bank Account
Request :
- Method : POST
- Endpoint : `/api/banks`
- Header :
    - Content-Type: application/json
- Body :

```json 
{
    "accountNumber": "acc123",
    "trust": 17.0,
    "transactionFee": 0
}
```

Response :

```json 
{
    "accountNumber": "acc123",
    "trust": 17.0,
    "transactionFee": 0
}
```
