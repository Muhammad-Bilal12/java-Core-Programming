import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        // array : collection of data


        // when data comes from the user,limit dena lazmi he is me
        int [] marks = new int[3];
        marks[0] = 78;
        marks[1] = 48;
        marks[2] = 58;

        //access value

        System.out.println(marks[0]);

        // we already know yhe value
        int[] finalMarks = {45,65,87,98};
        //System.out.println(finalMarks); // the garbage return
        System.out.println(finalMarks[2]);

        // array method
        //length
        System.out.println(marks.length);
        System.out.println(finalMarks.length);

        //sort
        Arrays.sort(marks);
        System.out.println(marks[0]);


        //2 Dimensional ArrAY

        int[][] ages = {{23,45},{34,45}};
        System.out.println(ages[0][1]);
    }
}
