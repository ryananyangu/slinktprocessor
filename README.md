## INTERSWITH INTERVIEW PREP FIRST DRAFT REQ ANALYSIS

Check balance 
Login
Allow funds transfer
Allow ATM withdrawal

Welcome to switchlink ltd.
1. Register. -> name -> email
2. Continue.
3. Exit.

Please input your pin


Please select an action
1. Account -> [{page:Balance,displayName:""}]
2. Withdraw -> [{page:ATM_w,displayName:"ATM_Withdraw"}] -> enter OTP -> confirmed transaction
3. FundsTransfer -> account number -> amount -> confirm -> enter OTP-> being processed ->



Transactions
- CustomerID
- TransactionID
- Last modified 
- Created At
- Modified By
- Created By 
- Amount 
- Action (Transfer,Balance,ATM windraw)
- Description


customers 
- Name
- AccountNumber (UUID)
- Balance
- PhoneNumber
- Email
- CreatedAt
- CreatedBy
- ModifiedBy
- ModifiedAt

ATM
- IdentificationNumber
- Balance 
- CreatedAt
- CreatedBy
- ModifiedBy
- ModifiedAt

Flow builder --> external

get/balance [GET]
validate/pin [GET]
validate/otp [GET]
validate/atm/id [GET]
check/atm/balance [GET]
funds/transfer [POST]
get/transaction/history [GET]

send OTP
send Pin
send Successfull transaction details
send transaction history