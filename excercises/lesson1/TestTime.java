package excercises.lesson1;

import excercises.lesson1.Time;

/**
 * TestTime
 */
public class TestTime {

    public static void main(String[] args) {

        Time t1 = new Time(1,59,59);
        System.out.println(t1.toString());

        Time t2 = t1.nextSecond();

        System.out.println(t2.toString());

        Time t3 =  new Time(0,0,0);
        System.out.println(t3.toString());

        Time t4 = t3.previousSecond();
        System.out.println(t4.toString());
    }
}