/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 22 11:38:52 GMT 2022
 */

package io.diffblue.corebanking.transaction;

import org.junit.Test;
import static org.junit.Assert.*;
import io.diffblue.corebanking.transaction.TransactionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransactionException_ESTest extends TransactionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TransactionException transactionException0 = new TransactionException("");
  }
}