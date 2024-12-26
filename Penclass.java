package OOPs_conecpt;
import java.io.*;
public class Penclass {

    String color;
    String type;

    public void write() {
        System.out.println("Pen is used for writing");
    }

    public void printcolor() {
        System.out.println(this.color);
    }


    public static void main(String[] args) {

        Penclass p1 = new Penclass();
        Penclass p2 = new Penclass();
        p1.color = "Blue";
        p1.type = "Gel";
        p1.write();
        p1.printcolor();

        p2.type = "Ball point";
        p2.color = "Black";
        p2.write();
        p2.printcolor();

    }
}
