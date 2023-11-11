| Sno | Candidate Name | Feature Complete | Coding Standards  | Proper Access Modifiers | Grade             | Feedback                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|-----|----------------|------------------|-------------------|-------------------------|-------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1   | Jhanvi         | No               | Needs Improvement | Ok                      | Needs Improvement | - Appreciate the logical thinking in transferring the requirement to code<br/>- Code formatting is good<br/> - Naming of variables and methods are good <br/>- Code didn't compile due to the below reasons:<br/>Concrete class Customer cannot have member as "abstract  Account account"<br/> Cannot assign return value of Math.random() which is double to int variable tId in the Transaction() constructor<br/> To instantiate an object instance of a class use proper case of the class like "new Date()" instead of "new date()"<br/> In getTid() method, "return Tid" case mismatch should have used "return tId"<br/> In getDate() method, "return getDate;" should be "return date" as the variable name is just "date"<br/> If a method is declared abstract then it cannot have within it, so printTransaction() cannot have implementation if declared abstract<br/>please check variable reference in the System.out statement of printTransaction() method<br/> In CurrentAccount  class, variable "overdraft" is referred before declaring anywhere <br/>In class CurrentAccount#withdraw(double amount) method, java.util.List # add() will only accept one method argument |
| 2   | Jyoti          | No               | Excellent         | Excellent               | Good              | - Good logical thinking<br/>-Well formatted code<br/>-Areas for improvement: <br/>Missed to connect the accounts with customer instance, accounts object are not assigned to any customer objects <br/> Interest Calculation formula incorrect                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 3   | Kajal          | No               | Excellent         | Excellent               | Good              | - Good logical thinking<br/>-Well formatted code<br/>-Areas for improvement: <br/>Method name "deposite" could have been better as this doesn't convey any meaning<br/>Missed to connect the accounts with customer instances, accounts object are not assigned to any customer objects <br/>  Interest Calculation formula incorrect                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| 4   | Mohit          | No               | Needs Improvement | Ok                      | Needs Improvement | - Well tried, good attempt<br/>Areas for improvement: <br/>Variable & method naming case (follow camel case) like "cusotmerName" instead of "customername"<br/>  Keyword "abstract" spelling should be exact<br/> Customer instances are not created, accounts are existing alone without being assigned to customer                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| 5   | Musharrat      | Yes              | Excellent         | Ok                      | Good              | - Good try <br/> Well formatted code <br/> Areas for Improvement: <br/> Business logic to debit amount from current account is deducted twice once from overdraft and second time from balance amount in the withdraw method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| 6   | Ankit          | No               | ok                | Needs Improvement       | Needs Improvement | - Account and Customer were created but not tested<br/> - Transaction class constructor was missing <br/> - Transaction attribute in account should be list <br/>- Print transaction implementation is missing<br/> - All classes were marked static<br/> - Use date instead of string to represent customer dob<br/> - All method return types were marked as void                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| 7   | Ashwini        | No               | Good              | Good                    | Needs Improvement | - Well tried, If not for typos and few basic things it would have been good <br/>- braces were messed up and hence code as not compiling <br> - Also typos when instantiating class name and hence compilation errors <br> - Instance variables in class cannot be final else you can assign value in constructor <br> - SavingsAccount and CurrentAccount constructor should also accept accountNumber and account balance as arguments or you can initialize internally                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| 8   | Dipti          | Yes              | Excellent         | Excellent               | Excellent         | - Well done <br/>- Class name as Exam1 but has been coded as Examone                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| 9   | Gayatri        | Yes              | Excellent         | Excellent               | Excellent         | - Well done<br/> - calculateInterest in savingsaccount had private modifier which means you can't call from main<br/> - Before depositing amount to account you can verify if the amount is <=0 as validation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| 10  | Harsha         | No               | Good              | Needs Improvement       | Needs Improvement | - Well tried, If you mark variables as private in abstract class, you can access it in inherited class via getters/setters. If you want to access directly you need to use protected modifier in abstract class <br/>-  If you want to call super on parent class you need to pass attributes for that constructor. In this case accountNumber and balance<br/> Use real type date for customer dob                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| 11  | Jainab         | No               | ok                | Needs Improvement       | Needs Improvement | - No much of code implementation<br/> - constructors are missing<br/> - Need to put logic in code                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| 12  | Priyanka         | Yes               | Excellent                | Good       | Excellent | - Everything else was nicely done , just overdraft Logic was not implemented in Current Account
| 13  | Rakhi         | No               | ok                | Needs Improvement       | Needs Improvement | - No much of code implementation<br/> - constructors are missing<br/> - Must understand when should a function return something or not , all methods were returning unwanted items . Functionality was incomplete also . Must read more about how classes interact with each other . Must also read on Java standards and access modifiers
| 14  | Riti         | No               | Needs Improvement                | ok       | Needs Improvement | - Need to work on Speed . Only basic Account class and it's methods were created . Neither Saving nor Current account functionalities could be found in the code
| 15  | Ruksana         | No               | Needs Improvement                | Needs Improvement       | Needs Improvement | - Looks like there was gap im understanding the question . Logic is not implemented for either of the accounts . Only Basic structure and few print statements were found.
| 16  | Shreshtha         | No               | Needs Improvement                | Needs Improvement       | Needs Improvement | - More practice is needed to understand the Java basic concepts and understanding of problems. Logic was not implemented in the code
| 17  | Sonam         | No               | Good                | Ok       | Needs Improvement | - Well tried. Code didnt compiled but the approach is good.<br/>Code formatting is good<br/>- Naming convention is good<br/>Access modifiers are ok.<br/>- Customer class has performTransaction function missing because of which code didnt compiled. Moreover the performTransaction method should be in Account class and not in Customer class<br/>- Customer and account class variables should have its getters and setters which is missing<br/>- System.out.println is not been used correctly which gives compilation error.<br/>- Logic is ok and understanding of the problem is there. With little more effort this problem can be solved.<br/>
| 18  | Sreekanya         | Yes               | Good                | Good       | Good | -Good try. Well done<br/>- Code formatting is good<br/>- Naming convention is good<br/>- Access modifiers are upto mark.<br/>- Code complied but the output was partially correct.<br/>- Customer class is created but was not part of either saving or current account which was one of the main requirement<br/>- createTransaction, printTransactions have empty method bodies, logic missing<br/>- Transaction not part of deposit/withdraw methods of the account.<br/>- Logic is ok but the requirement is not correctly captured in code. Code compiled but need to give more focus on understanding of requiremet. Over all good
| 19  | Sunny         | No(70% complete)               | Good                | Good       | Good | - Good try. Code compiled after fixing a typo.<br/>- Code formatting is good<br/>- Naming convention is good<br/>- Access modifiers are good.<br/>- Transaction requirement is not implemented. <br/>- getAccountNumber is missing return statement rather printing the account number.<br/>- In current account overdraft amount is hardcoded. Ideally it should be part of current account instance variables<br/>- import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder - Not sure why this import was used.<br/>- Over all good code quality apart from a typo and barring missing transaction implemntation code looks clean
| 20  | Vaishnavi         | No               | Needs Improvement                | Ok       | Needs Improvement | - Code formatting needs improvement<br/>- Naming convention is ok<br/>- Access modifiers is ok.<br/>- Missing braces at some places and missing access modifiers causing compilation error<br/>- Well tried but need some more work to be done around coding and syntax
| 21  | Vanshika         | No(60% complete)               | Good                | Good       | Good | - Good try.<br/>- Code formatting is good<br/>- Naming convention is good<br/>- Access modifiers are good.<br/>- abstract methods deposit and withdraw from Account class not implemented in sub classes current and savings account. Hence the deposit and withdraw feature itself is missing<br/>- Transaction feature is not implemented.<br/>- Overall good try, but requirement not captured properly in code. Concept of abstarct class should be studied again
|22|NehaDhore| No               |Need Improvement|Need Improvement| Need Improvement  |1. Code is not complied <br>2. Access modifier are not used proerly, all calsses are having public access modifier and used Private instead of private<br>3. variable names are not used properly<br>4. public is used in inside the method(SavingsAccount.endOfDayIntrest)<br>5. private properties of Account are accessing directly in sub class of SavingAccount and CurrentAccount<br>   6.Constructors are created with void method type
|23|NehaSaraf| No               |Need Improvement|Need Improvement| Need Improvement  |1. Code is not compiled <br>2. All methods in Transaction class have int as return type <br>3. super is not intiated inside CurrentAccount and SavingsAccount <br>3.missing return in withdraw method of CurrentAccount <br>5. accesing private property directly in printTransaction method
|24|Nikita| No               |Good|Excellent| Good              |1. Code is not Compiled <br>2. No Savings or Current Account classes are created <br>3. Code is good and follwed all the standards
|25|   Nisha  | Yes              |          Excellent        |        Excellent           | Excellent         |     Good work <br>Customer is created inside Account, but it should be other way
|26|Priti| No               |Good|Need Improvement| Need Improvement  |1. Deposit method in Account class should not be abstract <br>2. There is no extra methods added for Savings/Current like over draft and end of day intrest<br>3. Customer Object is not created <br>4. Print Transactions are not invoked <br>5. Withdraw in Current Account should have overdraft check <br>6.getdate() method in Transaction class should follow camel case <br>7. No Getter and Setter methods for Customer class
