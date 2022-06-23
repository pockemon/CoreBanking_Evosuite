/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 22 11:20:41 GMT 2022
 */

package io.diffblue.corebanking.ui.menu;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.diffblue.corebanking.CoreBanking;
import io.diffblue.corebanking.ui.menu.MainMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MainMenu_ESTest extends MainMenu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      MainMenu mainMenu0 = new MainMenu(coreBanking0);
      mainMenu0.executeMenuOption((-1133));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      MainMenu mainMenu0 = new MainMenu(coreBanking0);
      // Undeclared exception!
      mainMenu0.executeMenuOption(3);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      MainMenu mainMenu0 = new MainMenu(coreBanking0);
      // Undeclared exception!
      mainMenu0.executeMenuOption(2);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      MainMenu mainMenu0 = new MainMenu(coreBanking0);
      // Undeclared exception!
      mainMenu0.executeMenuOption(1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      MainMenu mainMenu0 = new MainMenu(coreBanking0);
      // Undeclared exception!
      mainMenu0.executeMenuOption(4);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CoreBanking coreBanking0 = new CoreBanking();
      MainMenu mainMenu0 = new MainMenu(coreBanking0);
      mainMenu0.executeMenuOption(0);
  }
}