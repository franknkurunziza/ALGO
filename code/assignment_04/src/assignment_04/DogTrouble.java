package assignment_04;

public class DogTrouble {
    public static void main(String[] args) {
        System.out.println(weInTrouble(false,6));
    }
    public static boolean weInTrouble(boolean isBarking,int hour){
        // if dog barking before 7 or after 20 is we are in trouble
        //otherwise there is no trouble
        if(isBarking && (hour < 7 || hour > 20)){return true;}
        return false;
    }
}
