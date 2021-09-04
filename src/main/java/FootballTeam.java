import java.util.Scanner;
public class FootballTeam {
    public static void main(String[] args){
        Scanner userName = new Scanner(System.in);
        System.out.println(" Please enter your age: \n");
        int age = userName.nextInt();

        if (age <= 20) {
            System.out.println("You are on childen group:");
        }
        else if (age>20 && age<40) {
            System.out.println("You are on Youngs group:");
        }
        else   {
            System.out.println("You are on Olds group:" );
    }
}
}