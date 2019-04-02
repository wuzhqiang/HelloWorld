package com.wzq.www;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * TestSuite 可以一次性多测几个类
 * @author wuzhiqiang
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestCase1.class,Testcase2.class})
public class TestSuite {

}
