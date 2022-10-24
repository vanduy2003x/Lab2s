package lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LabMain {
    public static void main(String[] args){
        ArrayList<Student>students= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
            System.out.println("Name");
            String name = scanner.nextLine();
            System.out.println("Addrees");
            String addrees = scanner.nextLine();
            Student student = new Student();
            student.getMid();
            student.setName(name);
            student.setAddress(addrees);
            System.out.println("Bạn có nhập nữa không" +
                    "\n 1. Có  \n 2.Không");
            int chonlua = scanner.nextInt();
            for (int i = 0; i<2;i++){
            if (chonlua==1){
                System.out.println("Name");
                String name1 = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Addrees");
                String addrees1 = scanner.nextLine();
                Student student1 = new Student();
                student1.getMid();
                student1.setName(name1);
                student1.setAddress(addrees1);
                System.out.println("Bạn có nhập nữa không" +
                        "\n 1. Có  \n 2.Không");
                int a = scanner.nextInt();
                if (a==2){
                    System.out.println(students.toString());

                }
                }
            }
    }
}
