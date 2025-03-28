/*

It is required to maintain and process the status of
total 9 resources. The status value is to be stored
in an integer array of dimension 3x3.
The valid status of a resource can be one of the 2 followings:
free: indicated by integer value 0
occupied: indicated by integer value 1
inaccessible: indicated by integer value 2

Declare a class called ResourcesStatus,
having data member called statusRef,
referring to a two dimensional array (3x3) of integers
to be used to refer to the above mentioned status values.
Define a member method called processStausCount that
counts and displays total number of  free resources,
total number of occupied resources and total number of
inaccessible resources.
The exception to be raised and handled if total number
of occupied resources exceeds total number of free resources.

The handler marks status of all inaccessible resources as free.
Accept initial status values from command line arguments
and initialize the array.
⚠ Contradictory statements -> all values are given by user.
  So, we will ignore this statement and mark status of all inaccessible resources as free.

Raise and handle user defined exception if invalid status value given

*/

class Program109 {
    public static void main(String[] args) {

        // args = new String[]{"1","0","2","0","1","1","0","2","0"};
        // args = new String[]{"1","1","1","0","1","1","0","2","0"};

        ResourcesStatus rs = new ResourcesStatus(args);
        rs.display();
        rs.processStatusCount();
        rs.display();
    }

}


class ResourcesStatus{

    int[][] statusRef = new int[3][3];


    ResourcesStatus(String[] args){

        for(int i = 0; i < 9; i++){

            if(i<3){
                statusRef[0][i] = Integer.parseInt(args[i]);
            }
            else if (i < 6) {
                statusRef[1][i-3] = Integer.parseInt(args[i]);
            }
            else {
                statusRef[2][i-6] = Integer.parseInt(args[i]);
            }

        }

    }

    void processStatusCount(){

        int free = 0, occupied = 0, inaccessible = 0;

        for (int[] i : statusRef) {
            for (int j : i){

                if(j == 0)
                    free++;
                else if (j == 1)
                    occupied++;
                else
                    inaccessible++;

            }
        }


        System.out.println(free + " resources are free.");
        System.out.println(occupied + " resources are occupied.");
        System.out.println(inaccessible + " resources are inaccessible.");


        if (occupied > free) {
            try {
                throw new InvalidStatusException();
            }
            catch (InvalidStatusException e) {
                System.out.println(e);
            }

            change2to0();

        }

    }

    void change2to0(){
        for (int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){
                if(statusRef[i][j] == 2)
                    statusRef[i][j] = 0;
            }

        }
    }

    void display(){

        for(int[] i : statusRef) {
            System.out.println();
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

    }
}

class InvalidStatusException extends RuntimeException {

    public InvalidStatusException() {
        super("Free exceeds occupied");
    }

}