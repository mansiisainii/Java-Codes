class invalidinputexception extends Exception{

    public String toString(){
        return "input is invalid";
    }
}
class cantdivbyzeroexce extends Exception{
    
    public String toString(){
        return "can't div by 0";
    }
}
class maxinputexception extends Exception{
    
    public String toString(){
        return "input is greater than 100000";
    }
}
class maxmultiplyexception extends Exception{
    
    public String toString(){
        return "input is greater than 100000";
    }
}
class customcalculator{
    double add(double a,double b)throws invalidinputexception,maxinputexception{
        if(a>100000&&b>100000){
            throw new maxinputexception();
        }
        if(a==8 || b==9){
            throw new invalidinputexception();
        }
           return a+b;
    }
    double sub(double a,double b)throws maxinputexception{
        if(a>100000&&b>100000){
            throw new maxinputexception();
        }
        return a-b;
 }

double mul(double a,double b)throws maxinputexception,maxmultiplyexception{
    if(a>7000&&b>7000){
        throw new  maxmultiplyexception();
    }
    else if(a>100000&&b>100000){
        throw new maxinputexception();
    }
    return a*b;
}

double div(double a,double b)throws cantdivbyzeroexce,maxinputexception{
    if(a>100000&&b>100000){
        throw new maxinputexception();
    }
    if(b==0){
        throw new cantdivbyzeroexce();
    }
    return a/b;
}
}

public class cwh87_exercise6 {
    public static void main(String[] args)throws invalidinputexception,maxinputexception,maxmultiplyexception,cantdivbyzeroexce {
        customcalculator c = new customcalculator();
        c.add(8, 9);
        c.mul(100000,4500000);
        c.div(3, 0);
        c.sub(56, 90);

        /*
         * you have to create a custom calculator which throws the following exceptions 
         * 1 addition
         * 2 subtraction
         * 3 multiplication
         * 4 division
         * which throws following exceptions
         * 1 invalid input exception 
         * 2 cant div by 0 exception
         * 3 max input exception if any of the input is greater than 100000
         * 4 max multiplier reached eexception - dont alllow any multiplication i/p to be greater than 7000
         * 
         */
    }
    
}
