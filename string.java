public class string {
    // main function
    public static void main(String args[])
    {

        String str = "suhaibshaik";


        int index = 6;


        char ch = 'F';

        // Print the original string
        System.out.println("Original String = " + str);

        str = str.substring(0, index) + ch
                + str.substring(index + 1);

        // Print the modified string
        System.out.println("Modified String = " + str);
    }
}