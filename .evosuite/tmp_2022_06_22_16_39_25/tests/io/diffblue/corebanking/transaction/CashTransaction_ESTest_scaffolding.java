/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jun 22 11:17:30 GMT 2022
 */

package io.diffblue.corebanking.transaction;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CashTransaction_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "io.diffblue.corebanking.transaction.CashTransaction"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\HARDIK~1\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "IN"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Hardik Rana\\Intellij_projects\\CoreBanking"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Hardik Rana"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Hardik Rana"); 
    java.lang.System.setProperty("user.timezone", "Asia/Calcutta"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CashTransaction_ESTest_scaffolding.class.getClassLoader() ,
      "io.diffblue.corebanking.transaction.TransactionException",
      "io.diffblue.corebanking.account.Account",
      "io.diffblue.corebanking.transaction.CashTransaction",
      "io.diffblue.corebanking.CoreBankingException",
      "io.diffblue.corebanking.account.Account$AccountState",
      "io.diffblue.corebanking.client.Client",
      "io.diffblue.corebanking.transaction.CashTransaction$CashTransactionType",
      "io.diffblue.corebanking.transaction.Transaction",
      "io.diffblue.corebanking.transaction.Transaction$TransactionState",
      "io.diffblue.corebanking.account.Account$AccountStatement",
      "io.diffblue.corebanking.account.AccountException",
      "io.diffblue.corebanking.transaction.BankTransaction"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CashTransaction_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "io.diffblue.corebanking.transaction.Transaction",
      "io.diffblue.corebanking.transaction.CashTransaction",
      "io.diffblue.corebanking.transaction.CashTransaction$CashTransactionType",
      "io.diffblue.corebanking.account.Account$AccountState",
      "io.diffblue.corebanking.transaction.Transaction$TransactionState",
      "io.diffblue.corebanking.client.Client",
      "io.diffblue.corebanking.account.Account",
      "io.diffblue.corebanking.account.Account$AccountStatement",
      "io.diffblue.corebanking.CoreBankingException",
      "io.diffblue.corebanking.account.AccountException",
      "io.diffblue.corebanking.transaction.TransactionException",
      "io.diffblue.corebanking.transaction.BankTransaction"
    );
  }
}
