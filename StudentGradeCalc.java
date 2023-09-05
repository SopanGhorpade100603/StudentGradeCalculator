import java.util.*;
import java.util.Scanner;
public class StudentGradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Subject");
        int Marks =sc.nextInt();
        System.out.println("Enter The Marks Of Each Subject");

        int Math=sc.nextInt();
        int Java=sc.nextInt();
        int OOP=sc.nextInt();
        int Science=sc.nextInt();
        int Physics=sc.nextInt();
        int Chemistry=sc.nextInt();

        int Sum= Math + Java + OOP + Science + Physics + Chemistry;
        System.out.println("Out of 600 Total Marks Obtained : "+Sum);

        double Average=Sum /6.0;
        System.out.println("Average marks: "+Average+"%");
        if(Average>90){
            System.out.println("Indicated Excellent "+"Congratulation your Grade: A++");
        }
        else if((Average>80)&&(Average<90)){
            System.out.println("Excellent "+"Congratulation your Grade: A+");
        }
        else if((Average>70)&&(Average<80)){
            System.out.println("Good "+"Congratulation your Grade: A");
        }
        else if((Average>60)&&(Average<70)){
            System.out.println("Satisfactory "+"Congratulation your Grade: B");
        }
        else if((Average>50)&&(Average<60)){
            System.out.println("Barely adequate "+"your Grade: C");
        }
        else if((Average>40)&&(Average<50)){
            System.out.println("Weak "+"your Grade :D");
        }
        else {
            System.out.println("you are Fail");
        }
    }
}
