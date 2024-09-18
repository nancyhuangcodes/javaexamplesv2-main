package oop;

public class Main {

    int x = 0;  // attribute x
    int y = 0;  // attribute y

    public Main() {                 // default constructor
    }

    public Main(int x) {            // overloaded constructor
        this.x = x;
    }

    public Main(int x, int y) {     // create your overloaded constructor that takes in x and y
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main();              // creating an instance of main calling the default constructor
        System.out.println(myObj.x);

        Main myObj2 = new Main(10);        // create an instance of main calling the parameterised constructor
        System.out.println(myObj2.x);

        Main myObj3 = new Main(15, 15); // create a new instance of Main and call it myObj3, taking in x: 15 and y:15
        System.out.println(myObj3.x + ":" + myObj3.y);
    }
}
