public class MyString {
    public static void main(String[] args) {
        System.out.println("String and Its Method");

        String name = "Bilal";
        String nickName = new String("student");

        // Concatenate : Method to Join 2 or more strings
        System.out.println("I am " + name +". My nick name is "+ nickName );

        // character of String : count total number of character in string

        System.out.println(name.length());

        //charAt(index) : to find the character of that index / return the character of that index
        System.out.println(name.charAt(2));

        //replace: replace old char with new one

        String name2 = name.replace('l','n');
        System.out.println("The old String "+name);
        System.out.println("The new String "+name2);

        //subString
        System.out.println(name.substring(2)); // return all char after 2nd index
        System.out.println(name.substring(0,4)); //return only  the specific range of data in index



    }
}
