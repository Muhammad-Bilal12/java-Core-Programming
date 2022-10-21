public class Casting {
    public static void main(String[] args) {
        //Casting
        int price =100;
        double gst = 18.0;
        double total= price +gst;

        System.out.println(total);
        // when we used small data type in big data type. Java does not through any error because of Implicit Type Cast

        //Explicit Type Cast : Big Data Type value ko Small Data type me used krna zabardasti
        // they lose their Some memory

        int totalWithGst = price + (int)gst;
        System.out.println(totalWithGst);


        //Constant : used final keyword

        int age = 23;
        //after 1 year
        age =  24;
        //age is not a constant value

        //* float PI = 3.147F;
        // float is a constant value
        // but we can change if we not use final keyword
        //* PI = 1.115F; // no error

        final float PI = 3.147F;
        //PI = 11.1F;
        System.out.println(PI);

        //* In Java Final value is written in the form of Capital Letters


    }
}
