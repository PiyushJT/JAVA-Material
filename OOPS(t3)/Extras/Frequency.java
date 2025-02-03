package Extras;

class Frequency {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1,3,4,1,5,23};

        Frequency d = new Frequency();

        d.displayFreq(arr);

    }

    void displayFreq(int[] arr){

        for(int i = 0; i < arr.length; i++){

            if(check(arr, i)){

            }
            else {

                int c = 0;
                int foc = arr[i];
                for(int vall : arr){

                    if(vall == foc)
                        c++;

                }
                System.out.println(foc + " Occured " + c + " times.");

            }

        }

    }

    boolean check(int[] arr, int i){


        for(int j = 0; j < i; j++){

            if(arr[j] == arr[i])
                return true;

        }
        return false;

    }

}