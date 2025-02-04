/*

Write a Java program to display the processing time
of the CPU along with all its specifications
(such as manufacturer, model number) using the nested
class concept. Include well-defined variables to
represent these specifications

*/

class Program757 {

    public static void main(String[] args) {

        CPU c = new CPU();
        c.processing_time = 10;
        c.manufacturer = "Intel";
        c.model_number = "i5";

        CPU.ChildCPU cC = c.new ChildCPU();

        cC.display();

    }

}

class CPU{

    int processing_time;
    String manufacturer;
    String model_number;

    class ChildCPU{

        void display(){

            System.out.println(processing_time);
            System.out.println(manufacturer);
            System.out.println(model_number);

        }

    }

}