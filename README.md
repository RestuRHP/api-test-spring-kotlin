# api-test-spring-kotlin

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
