
public class NestedIfElse {
    public static void main(String [] args){
        int age=20;
        boolean hasId=true;
        if(age>=18) {
            if (hasId) {
                System.out.println("Entry Allowed");
            }
            else{
                System.out.println("No ID - Entry Denied");
            }
        } else{
                System.out.println("Under 18 - Entry denied");
            }
        }
}