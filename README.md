# JPA Testing
This is an example of testing the using @DataJPATest 

## File Structure
```
├───main
│   ├────CdcApplication.java        * This is main class
│   ├────entity                     * This is Entity folder for representing the table form in database
│   │     Item.java                 * Item Entity have join with Promo and Transaction
│   │     Promo.java                * Promo Entity have join with Item
│   │     Transaction.java          * Transaction Entity have join with Item
│   ├───repository                  * This is Repository folder
│   │   │ ItemRepository.java       * This ItemRepository extend to JPARepository and JPASpecificationExecutor
│   │   └───spec                    * This folder contain Specification of JPA
│   │         ItemSpecication.java  * This class is a specification for ItemRepository      
└───test
     └───repository                 * This is repository test folder
          ItemRepositoryTest.java   * This is file testing for repository file
```
