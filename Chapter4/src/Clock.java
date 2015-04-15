// Author = Rolando
//
public class Clock {

    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;
    }
}

class ClockTestDrive {

    public static void main(String[] args) {

        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}

// Who am I?
//
// A class can have any number of these         : instance variable, getter, setter, method
// A method can have only one of these          : return
// This can be implicitly promoted              : return, argument
// I prefer my instance variables private       : encapsulation
// It really means 'make a copy'                : pass by value
// Only setters should update these             : instance variables
// A method can have many of these              : argument
// I return something by definition             : getter
// I shouldn't be used with instance variables  : public
// I can have many arguments                    : method
// By definition, I can take on argument        : setter
// These help create encapsulation              : public, private, getter, setter
// I always fly solo                            : return