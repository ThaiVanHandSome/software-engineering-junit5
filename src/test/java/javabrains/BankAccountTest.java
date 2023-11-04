package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
class BankAccountTest {
//	private BankAccount account;
//
//    @BeforeEach
//    public void setUp() {
//        account = new BankAccount("John Doe", 1000);
//    }
//
//    @Test
//    public void testDeposit() {
//        account.deposit(500);
//        assertEquals(1500, account.getBalance());
//    }
//
//    @Test
//    public void testWithdraw() {
//        account.withdraw(300);
//        assertEquals(700, account.getBalance());
//    }
//
//    @Test
//    public void testTransfer() {
//        BankAccount destinationAccount = new BankAccount("Jane Smith", 500);
//        account.transfer(destinationAccount, 300);
//
//        assertEquals(700, account.getBalance());
//        assertEquals(800, destinationAccount.getBalance());
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    	account = null;
//    }

	
//    @Test
//    public void testDeposit() {
//    	BankAccount account = new BankAccount("Thai Van", 1000);
//        account.deposit(500);
//        assertEquals(1500, account.getBalance());
//    }
//
//    @Test
//    public void testWithdraw() {
//    	BankAccount account = new BankAccount("Thai Van", 1000);
//        account.withdraw(300);
//        assertEquals(700, account.getBalance());
//    }
//
//    @Test
//    public void testTransfer() {
//    	BankAccount account = new BankAccount("Thai Van", 1000);
//        BankAccount destinationAccount = new BankAccount("Jane Smith", 500);
//        account.transfer(destinationAccount, 300);
//
//        assertEquals(700, account.getBalance());
//        assertEquals(800, destinationAccount.getBalance());
//    }
    
//	  All
	private static BankAccount myAccount;
    private BankAccount otherAccount;

    @BeforeAll
    public static void setUpSharedAccount() {
    	myAccount = new BankAccount("Thai Van", 1000);
    }

    @BeforeEach
    public void setUp() {
        otherAccount = new BankAccount("Minh Thuan", 1000);
    }

    @Test
    @Order(1)
    public void test_1() {
        myAccount.deposit(200);
        otherAccount.withdraw(200);
        assertEquals(myAccount.getBalance(), 1200);
        assertEquals(otherAccount.getBalance(), 800);
    }

    @Test
    @Order(2)
    public void test_2() {
        myAccount.transfer(otherAccount, 400);
        assertEquals(myAccount.getBalance(), 800);
        assertEquals(otherAccount.getBalance(), 1400);
    }

    @Test
    @Order(3)
    public void test_3() {
    	myAccount.transfer(otherAccount, 1000);
        assertEquals(myAccount.getBalance(), 800);
        assertEquals(otherAccount.getBalance(), 1000);
    }
    
    @Test
    @Order(4)
    public void test_4() {
    	myAccount.withdraw(400);
    	assertEquals(myAccount.getBalance(), 400);
    }
    
    @AfterEach
    public void tearDown() {
    	otherAccount = null;
    }
    	
    @AfterAll
    public static void cleanUp() {
    	myAccount = null;
    }
}
