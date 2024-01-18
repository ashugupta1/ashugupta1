

//Array as an object
import AB.*;


class Student {
    int RollNo;
    String name;
      static int mark = 10;

      public void show() {
          System.out.println(RollNo+" "+name+" "+mark);

//          for (Student stu : students) {
//              System.out.println(stu.RollNo+" "+stu.name+" : "+stu.mark);
//          }
      }

      static void show1(Student stu) {
          System.out.println(stu.RollNo+" "+stu.name+" "+mark);
      }
}

//class Human {
//    private int age;
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age ) {
//        age = age;
//    }
//}

class Human {

    int x;
    int y;
    public Human(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("constructor called");
    }
}


class B extends A{
    public B() {
        super();
        System.out.println("in B");
    }
    public B(int num) {
        //super();
        this();
        System.out.println("in B int");
    }
}

class Calc {

    public int add(int n1, int n2) {
        return n1+n2;
    }

    public int sub(int n1, int n2) {
        return n1-n2;
    }
}

class VeryAdvanceCalc extends AdvanceCalc {
    public int power(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }
}

class AdvanceCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1*n2;
    }

    public int div(int n1, int n2) {
        return n1/n2;
    }
}

class X {
    public void show() {
        System.out.println("in class X");
    }
}

class Y extends X {
    public void show() {
        System.out.println("in class Y");
    }
}

class Z extends X {
    public void show() {
        System.out.println("in class Z");
    }
}


class Parent {
    int x;

    public void method() {
        System.out.println("in Parent class method ");
    }
}

class Child extends Parent {
    int y;
    public void method() {
        System.out.println("in Child class method ");
    }

}

class statics {
    static int num;

    public void fun(int n) {
        n = 30;
        System.out.println(n);
    } 

}

abstract class Car {

    abstract public void drive();

    public void playMusic() {
        System.out.println("playing music...");
    }

} 

class VegonR extends Car{
@Override
public void drive() {
    System.out.println("driving....");
}
}

class J {



    private int n;

     public void show() {
        System.out.println("showing...");
     }

     class K {

    
        public void lough() {
            System.out.println("loughing...");
        }
     }
}


class A{
    public void A() {
        //super();
        System.out.println("in A");
    }

    public void A(int num) {
        //super();
        System.out.println("in A int");
    }
}

class N {
    public void show() {
        System.out.println("show in N show ");
    }
}

// class M extends N {
//     public void show() {
//         System.out.println("show in M show ");
//     }
// }


abstract class Computer {
    public abstract void code();
}

class Developer {
    public void DevApp(Computer lap) {
        lap.code();
    }
}

class Laptop extends Computer {
    public void code() {
        System.out.println("code , compile , run...");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("code , compile , run : Faster...");
    }
}

interface C {
    int age = 10;
    String name = "Ashu Gupta";
    void Show();
    void Config();
}

interface E {
    void run();
}

interface F extends C, E {
    void ear();
}


class D implements C {
    public void Show() {
        System.out.println("in show ");
    }
    public void Config() {
        System.out.println("in Config");
    }

    public void run() {
        System.out.println("running...");
    }


}
enum Status {
    SUCCESS, FIALED, PENDING, RUNNING;
}

interface Abc {
    void show(int i);
}

// class Bcd implements Abc {
//     @Override
//     public void show() {
//         System.out.println("hey Ashu...!");
//     }
// }


public class Main {
    public static void main(String[] args) {

        Abc bcd = (i) ->   System.out.println("in anonymous class..."+ i);
            
    
        bcd.show(5);


       
       







        // C c = new D();
        // c.Config();
        // c.Show();
        // //c.run();

        // E e = new D();

        // e.run();

        // System.out.println(C.age);
        // System.out.println(C.name);







        // Developer dev = new Developer();
        // //dev.DevApp();
        // Computer computer = new Computer();
        // Computer laptop = new Laptop();
        // Computer desktop = new Desktop();
        
        // dev.DevApp(laptop);








        // N n = new N(){
        //     public void show() {
        //         System.out.println("show in new show ");
        //     }
        // };
        // n.show();


        
        // J j = new J();
        // j.show();


        // J.K k = j.new K();
        // k.lough();






        // Car car = new VegonR();
        // car.drive();
        // car.playMusic();

        // statics statics = new statics();

        
        // System.out.println(statics.num = 10);

        // System.out.println(statics.num = 20);

        // statics.fun(100);


        //uppercasting
        // Parent parent = new Child();

        
        // parent.method();
        // System.out.println(parent.x = 10);

        // Child child = (Child)parent;

        // System.out.println(child.x = 20);
        // System.out.println(child.y = 20);

        // child.method();








 
        // X x = new X();
        // //x.show();

        // x = new Y();
        // x.show();

        // x = new Z();
        // x.show();




    
        // Abc abc = new Abc();
        // Bca bca = new Bca();
        // abc.show();
        // bca.show();

        // VeryAdvanceCalc VeryadvanCalc = new VeryAdvanceCalc();
        // int r1 = VeryadvanCalc.add(10,25);
        // int r2 = VeryadvanCalc.sub(25,10);
        // int r3 = VeryadvanCalc.mul(5,2);
        // int r4 = VeryadvanCalc.div(10,2);
        // int r5 = VeryadvanCalc.power(5,2);
        // System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);











        //A a = new A();
        //B b = new B(5);












//        Human human1 = new Human(10,20);
//        Human human2 = new Human(30,40);
//        System.out.println(human1.x+" : "+human1.y);
//        System.out.println(human2.x+" : "+human2.y);



//       Human human = new Human();
//       human.setAge(21);
//       human.setName("Ashu");
//       human.getAge();
//       System.out.println(human.getName()+" : "+human.getAge());






        
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//        Student s4 = new Student();
////
////
//
//        s1.name = "ASHU GUPTA";
//        s1.RollNo = 1;
//        //Student.mark = 88;
//
//        s2.name = "YOGESH KUMAR";
//        s2.RollNo = 2;
//        //Student.mark = 84;
//
//        s3.name = "ALIYA GUPTA";
//        s3.RollNo = 3;
//        //Student.mark = 68;
//
//        s4.name = "RIMBU GUPTA";
//        s4.RollNo = 4;
//        //Student.mark = 48;
//
//        Student students[] = new Student[4];
//
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//        students[3] = s4;
//
//
//
//
//        s1.show();
//        s2.show();
//        s3.show();
//        s4.show();
//
//
//
//        Student.show1(s1);



















        //int day = 5;
        //String result = "";

//        switch (day)  {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("not existing day");
//        }

//        String result = switch (day) {
//            case 1 : yield  ("Monday");
//            case 2 : yield ("Tuesday");
//            case 3 : yield  ("Wednesday");
//            case 4 : yield  ("Thursday");
//            case 5 : yield  ("Friday");
//            case 6 : yield  ("Saturday");
//            case 7 : yield  ("Sunday");
//            default : yield  ("not existing day");
//        };
//
//        System.out.println(result);


    }
}