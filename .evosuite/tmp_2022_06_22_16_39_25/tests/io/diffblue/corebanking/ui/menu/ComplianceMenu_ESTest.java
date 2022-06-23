/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 22 11:25:39 GMT 2022
 */

package io.diffblue.corebanking.ui.menu;

import org.junit.Test;
import static org.junit.Assert.*;
import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.ui.menu.ComplianceMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComplianceMenu_ESTest extends ComplianceMenu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      ComplianceMenu complianceMenu0 = new ComplianceMenu(coreBanking0);
      complianceMenu0.executeMenuOption(2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      ComplianceMenu complianceMenu0 = new ComplianceMenu(coreBanking0);
      complianceMenu0.executeMenuOption(1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      ComplianceMenu complianceMenu0 = new ComplianceMenu(coreBanking0);
      complianceMenu0.executeMenuOption((-1695));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      ComplianceMenu complianceMenu0 = new ComplianceMenu(coreBanking0);
      complianceMenu0.executeMenuOption(0);
  }
}
