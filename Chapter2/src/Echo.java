// Author = Rolando
//
public class Echo {

    int count = 0;

    void hello() {
        System.out.println("helloooo... ");
    }
}

class EchoTestDrive {
    public static void main(String[] args) {

        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3) {
               e2.count = e2.count + 1;
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}

// Solution to bonus question
//class EchoTestDrive {
//    public static void main(String[] args) {
//
//        Echo e1 = new Echo();
//        Echo e2 = e1;
//        int x = 0;
//        while (x < 4) {
//            e1.hello();
//            e1.count = e1.count + 1;
//            if (x == 3) {
//               e2.count = e2.count + 1;
//            }
//            if (x > 0) {
//                e2.count = e2.count + e1.count;
//            }
//            x = x + 1;
//        }
//        System.out.println(e2.count);
//    }
//}
//
// Who am I ?
//
// I am compiled from a .java file                                      : class
// My instance variable values can be different from my buddy's values  : object
// I behave like a template                                             : class
// I like to do stuff                                                   : object, method
// I can have many methods                                              : class, object
// I represent 'state'                                                  : instance var
// I have behaviors                                                     : object, class
// I am located in objects                                              : method, instance
// I live in the heap                                                   : object
// I am used to create object instances                                 : class
// My state can change                                                  : object, instance
// I declare methods                                                    : class
// I can change at runtime                                              : object, instance