//author = Rolando
//
public class Mix4 {

    int counter = 0;                            // instance variable for class Mix4

    public static void main(String[] args_) {

        int count = 0;                          // int variable count
        Mix4[] m4a = new Mix4[20];              // create array of 20 Mix4 objects
        int x = 0;                              // int variable x

        while (x < 9) {
            m4a[x] = new Mix4();                    // create Mix4 obj in Mix4 array slot x
            m4a[x].counter = m4a[x].counter + 1;    // add 1 to inst var for current object
            count = count + 1;                      // add 1 to loc var count
            count = count + m4a[x].maybeNew(x);     // add
            x = x + 1;                              // add 1 to loc var count
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    public int maybeNew(int index) {
        if (index < 5) {
            Mix4 m4 = new Mix4();           // create new Mix4 obj in local
            m4.counter = m4.counter + 1;    // add 1 to local counter
            return 1;
        }
        return 0;
    }
}

