import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            SetGet func = new SetGet();
            ArrayList<String> users = new ArrayList<String>();


            System.out.print("Name: ");
            String name = sc.nextLine();
            func.setName(name);
            users.add(name);

            System.out.print("Email: ");                       // .run() (Thread), inheritance, polymorphism, encapsulation, abstraction, Array types (Data storage)
            String email = sc.nextLine();
            func.setEmail(email);
            users.add(email);


            System.out.print("Age: ");
            String age = sc.nextLine();
            func.setAge(age);
            users.add(age);

            System.out.println("name: " + func.getName() + "\nemail: " + func.getEmail() + "\nage: " + func.getAge());
            System.out.println();

        } catch (Exception e){
            System.err.println(e);

        }


    }
}