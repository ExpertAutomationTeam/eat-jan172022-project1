package datatype.primitive;

public class Variables {
    public static void main(String[] args) {

        //chain of characters, numbers (whole, decimal), boolean, character

        //declare variable: specify the variable type
        //numbers
            //whole numbers
            byte b; // 1 byte
            short s; // 2
            int i; // 4
            long l; // 8

            //decimals
            float f; // 4
            double d; // 8

        //characters
        char c;

        //boolean
        boolean boo;

        //initialize variable (assignment): assign variable value
        b = 127;
        s = 12345;
        i = 1234567890;
        l = 1234567890123456789L;
        f = 1.12345678901234567890123456789012345678901234567890123456789012345678912345678901234567890F;
        d = 1.123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890;
        c = 'a';
        boo = true;

        //inline initialization and declaration
        int a = 176;

        //you cannot assign non declared variable
    }
}
