/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 22 11:27:59 GMT 2022
 */

package io.diffblue.corebanking.compliance.rules;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.diffblue.corebanking.account.Account;
import io.diffblue.corebanking.client.Client;
import io.diffblue.corebanking.compliance.rules.ComplianceRuleBalanceAboveOrEqualToZero;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComplianceRule_ESTest extends ComplianceRule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      Client client0 = new Client("io.diffblue.corebanking.compliance.rules.ComplianceRuleBalanceAboveOrEqualToZero");
      Account account0 = new Account(3995L, client0, 1833L);
      complianceRuleBalanceAboveOrEqualToZero0.addToNonCompliantAccounts(account0);
      List<Account> list0 = complianceRuleBalanceAboveOrEqualToZero0.getNonCompliantAccounts();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      // Undeclared exception!
      try { 
        complianceRuleBalanceAboveOrEqualToZero0.validateAccountCompliance((Account) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.diffblue.corebanking.compliance.rules.ComplianceRuleBalanceAboveOrEqualToZero", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      Client client0 = new Client("");
      Account account0 = new Account(1339L, client0, 1339L);
      complianceRuleBalanceAboveOrEqualToZero0.addToCompliantAccounts(account0);
      List<Account> list0 = complianceRuleBalanceAboveOrEqualToZero0.getCompliantAccounts();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      Client client0 = new Client("");
      Account account0 = new Account(1760L, client0, 1760L);
      complianceRuleBalanceAboveOrEqualToZero0.validateAccountCompliance(account0);
      // Undeclared exception!
      try { 
        complianceRuleBalanceAboveOrEqualToZero0.addToCompliantAccounts(account0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.diffblue.corebanking.compliance.rules.ComplianceRule", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      Client client0 = new Client("io.diffblue.corebanking.compliance.rules.ComplianceRule");
      Account account0 = new Account((-667L), client0, (-667L));
      complianceRuleBalanceAboveOrEqualToZero0.validateAccountCompliance(account0);
      // Undeclared exception!
      try { 
        complianceRuleBalanceAboveOrEqualToZero0.addToNonCompliantAccounts(account0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.diffblue.corebanking.compliance.rules.ComplianceRule", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      complianceRuleBalanceAboveOrEqualToZero0.removeFromComplianceLists((Account) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      complianceRuleBalanceAboveOrEqualToZero0.purgeAccounts();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      List<Account> list0 = complianceRuleBalanceAboveOrEqualToZero0.getCompliantAccounts();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ComplianceRuleBalanceAboveOrEqualToZero complianceRuleBalanceAboveOrEqualToZero0 = new ComplianceRuleBalanceAboveOrEqualToZero();
      List<Account> list0 = complianceRuleBalanceAboveOrEqualToZero0.getNonCompliantAccounts();
      assertEquals(0, list0.size());
  }
}