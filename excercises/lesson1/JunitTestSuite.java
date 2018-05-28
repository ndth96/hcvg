package excercises.lesson1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import excercises.lesson1.CircleTest;
import excercises.lesson1.EmployeeTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   CircleTest.class,
   EmployeeTest.class
})

public class JunitTestSuite {   
}  