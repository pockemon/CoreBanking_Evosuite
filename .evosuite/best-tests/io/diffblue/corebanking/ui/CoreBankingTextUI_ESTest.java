/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 22 11:39:44 GMT 2022
 */

package io.diffblue.corebanking.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.ui.CoreBankingTextUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CoreBankingTextUI_ESTest extends CoreBankingTextUI_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      CoreBankingTextUI.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      CoreBankingTextUI coreBankingTextUI0 = new CoreBankingTextUI(coreBanking0);
  }
}
