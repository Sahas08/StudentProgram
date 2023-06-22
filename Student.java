import java.util.*;

public class Student{
    String USN;
    String Name;
    int marks[];
    int average;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[2];

        for(int i = 0; i < 2; i++){
            s[i] = new Student();
            System.out.println("Enter the name of the student");
            s[i].Name = sc.nextLine();
            System.out.println("Enter the USN of the student");
            s[i].USN = sc.next();
            System.out.println("Enter the marks in three tests");
            s[i].marks = new int[3];
            s[i].marks[0] = sc.nextInt();
            s[i].marks[1] = sc.nextInt();
            s[i].marks[2] = sc.nextInt();
            sc.nextLine();
            s[i].average = findAverage(s[i].marks[0], s[i].marks[1], s[i].marks[2]);
        }
        System.out.printf("USN\tName\tAverageMarks");


        for(int i = 0; i < 2; i++){
            System.out.println();
            System.out.printf("%s\t%s\t%d",s[i].USN,s[i].Name,s[i].average);
        }
    }

    public static int findAverage(int marks1, int marks2, int marks3){
        //finding minimum
        int min = marks1;
        if(marks2 < min)
            min = marks2;
        if(marks3 < min)
            min = marks3;

        return (marks1 + marks2 + marks3 - min) / 3;
    }


}
