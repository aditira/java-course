package variable;

public class Main {
    public static void main(String[] args) {
        // type variableName = value;
        String name = "Aditira";
        System.out.println(name);

        int myNum = 15;
        myNum = 20;
        System.out.println(myNum);

        final int numFinal = 100;
        System.out.println(numFinal);

        // Other:
        float myFloat = 5.99f; // Floating point number
        char myLetter = 'A'; // Character
        boolean myBool = true; // Boolean

        System.out.printf("Float: %s, Letter: %s, Bool: %s", myFloat, myLetter, myBool);
    }
}
