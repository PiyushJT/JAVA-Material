class ScientificCalc {

    Calculate calc = new Calculate();

}

class Calculate{

    double add(double a, double b){
        return a + b;
    }

    double sub(double a, double b){
        return a-b;
    }

    double mul(double a, double b){
        return a*b;
    }

    double div(double a, double b){
        return a/b;
    }

    double mod(double a, double b){
        return a%b;
    }

    double pow(double a, double b){
        return Math.pow(a, b);
    }

    double sqrt(double a){
        return Math.sqrt(a);
    }

    double sin(double a){
        return Math.sin(a);
    }

    double cos(double a){
        return Math.cos(a);
    }

    double tan(double a){
        return Math.tan(a);
    }

    double sinInv(double a){
        return Math.asin(a);
    }

    double cosInv(double a){
        return Math.acos(a);
    }

    double tanInv(double a){
        return Math.atan(a);
    }

    double ln(double a){
        return Math.log(a);
    }

    double log10(double a){
        return Math.log10(a);
    }

    double exp(double a){
        return Math.exp(a);
    }

    double abs(double a){
        return Math.abs(a);
    }

    double ceil(double a){
        return Math.ceil(a);
    }

    double floor(double a){
        return Math.floor(a);
    }

    double round(double a){
        return Math.round(a);
    }

    double max(double a, double b){
        return Math.max(a, b);
    }

    double min(double a, double b){
        return Math.min(a, b);
    }

    double random(){
        return Math.random();
    }

    double toRadians(double a){
        return Math.toRadians(a);
    }

    double toDegrees(double a){
        return Math.toDegrees(a);
    }

    int fact(int a){
        if(a == 1)
            return 1;
        else
            return a * fact(a-1);
    }

    double cbrt(double a){
        return Math.cbrt(a);
    }

}