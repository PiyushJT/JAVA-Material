/*

Create class animal with

static final int NUM_LEGS = 4;
static final int NUM EARS = 2;
static final int NUM EYES = 2;
static final int HAS_TAIL= 1;

create final method displayCharacteristics() that shows above variables.
Create class Cow - which extends Animal
Try to override displayCharacteristics().
If it is not able to override then create new method in Cow with name
displayAdditionalCharacteristics(). That shows Hi Cow Additional
Characteristics in method.
Use object of Cow and try to call method of both classes.

*/

class Program838 {

    public static void main(String[] args) {


        Cow c = new Cow();

        c.displayCharacteristics();
        c.displayAdditionalCharacteristics();

    }

}

class Animal{

    static final int NUM_LEGS = 4;
    static final int NUM_EARS = 2;
    static final int NUM_EYES = 2;
    static final int HAS_TAIL= 1;

    final void displayCharacteristics(){

        System.out.println(NUM_LEGS);
        System.out.println(NUM_EARS);
        System.out.println(NUM_EYES);
        System.out.println(HAS_TAIL);

    }

}

class Cow extends Animal{

    // Not possible
    /*

    void displayCharacteristics(){

        System.out.println(NUM_LEGS);
        System.out.println(NUM_EARS);
        System.out.println(NUM_EYES);
        System.out.println(HAS_TAIL);

    }

    */

    void displayAdditionalCharacteristics(){

        System.out.println("Hi Cow");

    }

}