/* 
class TestA {
    public static void main(String[] args) {
        class X {}
        class Y extends X {}
        class Z extends Y {}

        X x1 = (X) new Y();  // Cast is valid
        Y y1 = new Y();
        // Y y2 = new X();  // Cannot create a subclass instance from a superclass
        Y y3 = (Y) new Z();  // Cast is valid (downcasting)
        Z z1 = new Z();
        // Z z2 = (Z) new X();  // Illegal cast (incompatible types)
    }
}

class TestB {
    public class S {}
    public class G extends S {}
    public class Q extends B {} 
    public class B extends S {}

    public static void main(String[] args) {
        S q = new G();
        Q b = new Q();
        B s = new Q();
        B g = new B();
        S p = new B();

        System.out.println("q instanceof B: " + (q instanceof B));
        System.out.println("q instanceof G: " + (q instanceof G));
        System.out.println("q instanceof S: " + (q instanceof S));
        System.out.println("b instanceof B: " + (b instanceof B));
        System.out.println("b instanceof S: " + (b instanceof S));
        System.out.println("s instanceof B: " + (s instanceof B));
    }
}

class TestC {
    class Person { }
    class Student extends Person { }
    class BachelorStudent extends Student { }

    class StudentRegister {
        public static void main(String[] args) {
            Person pers, pers2;
            Student stud, stud2;
            BachelorStudent bachelor, bachelor2;

            pers = new Person();
            stud = new Student();
            bachelor = new BachelorStudent();

            pers2 = stud;                // (A) Upcasting is allowed
            // bachelor2 = (BachelorStudent) stud; // (B) Illegal downcast
            // stud2 = (BachelorStudent) stud;   // (C) Illegal downcast
            // stud2 = (Person) stud;           // (D) Already a Person
            // stud2 = (Student) bachelor; bachelor = stud2; // (E) Cyclic reference
        }
    }
}

// Main class to run all tests
class Main {
    public static void main(String[] args) {
        TestA.main(null);
        TestB.main(null);
        TestC.StudentRegister.main(null); // Call nested main method for TestC
    }
}
*/