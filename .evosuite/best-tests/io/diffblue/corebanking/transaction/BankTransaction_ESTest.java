/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 22 11:34:24 GMT 2022
 */

package io.diffblue.corebanking.transaction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.client.Client;
import io.diffblue.corebanking.transaction.BankTransaction;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BankTransaction_ESTest extends BankTransaction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Client client0 = new Client("\n");
      Account account0 = new Account((-222L), client0, (-222L));
      BankTransaction bankTransaction0 = new BankTransaction((-222L), mockDate0, account0, account0);
      try { 
        bankTransaction0.executeTransaction();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Trying to take -222 from the existing balance of -222. Not enough funds.
         //
         verifyException("io.diffblue.corebanking.transaction.BankTransaction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Client client0 = new Client("sXU-");
      Account account0 = new Account((-3476L), client0, (-3476L));
      BankTransaction bankTransaction0 = new BankTransaction((-3476L), mockDate0, account0, account0);
      String string0 = bankTransaction0.getTarget();
      assertEquals("-3476", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Client client0 = new Client("");
      Account account0 = new Account((-268L), client0, 0L);
      BankTransaction bankTransaction0 = new BankTransaction((-268L), mockDate0, account0, account0);
      String string0 = bankTransaction0.getSource();
      assertEquals("-268", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 1593);
      Client client0 = new Client("E");
      Account account0 = new Account(1593, client0, 1L);
      BankTransaction bankTransaction0 = new BankTransaction((-1867L), mockDate0, account0, (Account) null);
      // Undeclared exception!
      try { 
        bankTransaction0.executeTransaction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.diffblue.corebanking.transaction.BankTransaction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2336, 2336, 2336);
      BankTransaction bankTransaction0 = new BankTransaction((-182L), mockDate0, (Account) null, (Account) null);
      // Undeclared exception!
      try { 
        bankTransaction0.getTarget();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.diffblue.corebanking.transaction.BankTransaction", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Client client0 = new Client("L\"G X");
      Account account0 = new Account((-1), client0, (-1));
      account0.closeAccount();
      Account account1 = new Account((-1), client0, (-1));
      BankTransaction bankTransaction0 = new BankTransaction((-1), mockDate0, account0, account1);
      try { 
        bankTransaction0.executeTransaction();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Both accounts must be in an open state.
         //
         verifyException("io.diffblue.corebanking.transaction.BankTransaction", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1213);
      Client client0 = new Client("N$E/Fz)}@!");
      Account account0 = new Account(1213, client0, 1213);
      BankTransaction bankTransaction0 = new BankTransaction((-833L), mockDate0, account0, account0);
      account0.closeAccount();
      try { 
        bankTransaction0.executeTransaction();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Both accounts must be in an open state.
         //
         verifyException("io.diffblue.corebanking.transaction.BankTransaction", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Account account0 = new Account(5L, (Client) null, 5L);
      BankTransaction bankTransaction0 = new BankTransaction(5L, mockDate0, account0, account0);
      bankTransaction0.executeTransaction();
      try { 
        bankTransaction0.executeTransaction();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This transaction was already executed!
         //
         verifyException("io.diffblue.corebanking.transaction.BankTransaction", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      BankTransaction bankTransaction0 = new BankTransaction(0L, (Date) null, (Account) null, (Account) null);
      // Undeclared exception!
      try { 
        bankTransaction0.getSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.diffblue.corebanking.transaction.BankTransaction", e);
      }
  }
}
