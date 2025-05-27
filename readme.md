# Rural Bank Account Management System (RBAMS)
## Scenario
Sita Devi, a farmer from Myagdi, opens two accounts:
- A **Saving Account** for personal savings.
- A **Current Account** for her agro-business with overdraft support.

## Class Design

### 1. BankAccount(Abstract Class)
- Base class for all account types.
- Common properties: 'accountHolderName', 'accountNumber', 'balance'
- Abstract method: 'withdraw()'
- Implements deposit and display method (Concrete methods)

### 2. SavingAccount (extends BankAccount)
- Adds interest functionality
- Restricts withdrawls to available balance, cant withdraw over current balance.

### 3. CurrentAccount (extends BankAccount)
- Allows withdrawls beyond balance within overdraft limit (overdraft limit is 50000)
- Supports overdraft up to a fixed limit (10, 000).

### 4. InsufficentBalanceException (Custom Exception)
- This exception is throw when withdraw is exceed the limit in both account.
- Then it shows the withdrawl failed messsage.

### 5. InvalidAmountException (Custom Exception)
- This exception is throw when the user mistakenly put unnecessary value like (-100)

### 6. Customer
- Represents a bank customer
- Provides methods to manage accounts

### 7. Main
- Main application class with console interface
- Handles user interaction and menu operations

## OOP Concepts Implemented
## 1. Abstraction
- BankAccount is an abstract class with abstract withdraw method

## 2. Inheritance
- SavingAccount and CurrentAccount extend BankAccount

### 3. Encapsulation
- All fields are private with public getters
- Implementation details hidden from users

### 4. Polymorphism
- Different withdraw behavior in child classes
- Method overriding in account types

## Operation Screenshot Preview
### 1. Deposit Success
![Deposit Success.png](Screenshots/Deposit%20Success.png)

### 2. Deposit Failure
![Deposit Failure.png](Screenshots/Deposit%20Failure.png)

### 3. Withdraw Success
![Withdraw successful.png](Screenshots/Withdraw%20successful.png)

### 4. Withdraw Fail
![Withdraw Failure.png](Screenshots/Withdraw%20Failure.png)

### 5. View Account
![View Account.png](Screenshots/View%20Account.png)

### 6. Add Interest
![Add Interest.png](Screenshots/Add%20Interest.png)




