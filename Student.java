package OOPs_conecpt;
import OOPs_conecpt.Encapsulation.Bank.Account;
import OOPs_conecpt.Inheritance.Circle;
import OOPs_conecpt.Inheritance.Equilateral_triangle;
import OOPs_conecpt.Inheritance.Shape;
import OOPs_conecpt.Inheritance.Triangle;

import java.io.*;
public class Student {
    String name;
    int age;

    public void printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }


    public static void main(String[] args)
    {
        Student s1= new Student();
        s1.name="Ravi";
        s1.age=28;
        s1.printinfo();


        Shape sh1= new Shape();
        Triangle t1= new Triangle();
        t1.area(5,6);


        Circle c1= new Circle();
        c1.area(5);

        Equilateral_triangle eq1= new Equilateral_triangle();
        eq1.area(9);



        Account a1= new Account();
        a1.name="Customer1";
        String pass2="abcd";
        a1.setpassword(pass2);

        String pass1=a1.getpassword();
        System.out.println(pass1);

        



    }
}


