package Extras;

import java.util.Scanner;

class Employee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Empl[] e = new Empl[2];

        for (int i = 0; i < e.length; i++){
            e[i] = new Empl();

            System.out.println("Enter name");
            e[i].name = sc.next();

            System.out.println("Enter mobile number");
            e[i].mobile = sc.nextLong();

            System.out.println("Enter address");
            e[i].add = sc.next();

            System.out.println("Enter email");
            e[i].email = sc.next();

            System.out.println();
        }

        System.out.println("enter name to search");
        String name = sc.next();

        Empl obj = new Empl();

        obj.searchByName(name, e);





    }

}


class Empl{

    String name;
    Long mobile;
    String add;
    String email;

    void searchByName(String name, Empl[] e){

        for(int i = 0; i < e.length; i++){

            if(name.equalsIgnoreCase(e[i].name)){

                System.out.println();

                System.out.println(e[i].name);
                System.out.println(e[i].mobile);
                System.out.println(e[i].add);
                System.out.println(e[i].email);

                break;

            }

        }

    }

}