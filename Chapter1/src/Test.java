// Author = Rolando
// Chapter 1-9
public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while(x < 5) {

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("");
    }
}

class Test1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            y = x - y;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("");
    }
}

class Test2 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            y = y + x;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
        System.out.println("");
    }
}

class Test3 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            y = y + 2;
            if (y > 4) {
                y = y - 1;
            }

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}

class Test4 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            x = x + 1;
            y = y + x;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}

class Test5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}