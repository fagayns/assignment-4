This project implements a basic financial system with two primary classes: PersonalAccount and Amount. The goal is to model a personal bank account system where each account holds a balance represented as an Amount object.

Classes
1. PersonalAccount
The PersonalAccount class models a bank account for an individual.

Attributes:
accountNumber: A unique identifier for the account (String).
accountHolderName: The name of the account holder (String).
balance: The current balance in the account, stored as an Amount.
Methods:
deposit(amount: Amount): void
Adds the given Amount to the account's current balance.

withdraw(amount: Amount): void
Subtracts the given Amount from the account's balance (if sufficient funds are available).

checkBalance(): Amount
Returns the current balance of the account.

2. Amount
The Amount class represents a monetary value.

Attributes:
currency: The currency of the amount (e.g., USD, EUR) as a String.
value: The actual numeric value of the amount (double).
Methods:
add(amount: Amount): void
Adds another Amount object to the current Amount (if the currency matches).

subtract(amount: Amount): void
Subtracts another Amount object from the current Amount (if the currency matches).
