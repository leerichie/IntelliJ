package GroupOne.Week03;

import com.sun.security.jgss.GSSUtil;

public class StaticTestMain {
    public static void main(String[] args) {
        Car.Engine engine = new Car().new Engine("v6");
        engine.refuel();
        System.out.println(engine);

        /*

        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
        StaticTest staticTest3 = new StaticTest();

        System.out.println("not static 'b'");
        // b is not static - changes
        staticTest1.b = 5;
        staticTest2.b = 10;
        staticTest3.b = 20;
        System.out.println(staticTest1.b);
        System.out.println(staticTest2.b);
        System.out.println(staticTest3.b);

        System.out.println("\nstatic reference to 'a'");
        // a is static - unchangeable - creates 1 instance
        staticTest1.a = 5;
        staticTest2.a = 10;
        staticTest3.a = 20;
        System.out.println(staticTest1.a);
        System.out.println(staticTest2.a);
        System.out.println(staticTest3.a);
        System.out.println();

        System.out.println(StaticTest.a);

         */





    }
}
