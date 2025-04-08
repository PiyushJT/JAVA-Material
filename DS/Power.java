public class Power {
    public static void main(String[] args) {

        System.out.println(pow(2,3));

    }

    static int pow(int x, int y){
        if(y < 1)
            return 1;
        return x * pow(x, y-1);

    }
}