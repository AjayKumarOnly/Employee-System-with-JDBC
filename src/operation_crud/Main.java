package operation_crud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Crud crud = new Crud();
        Scanner scanner = new Scanner(System.in); // Open Scanner once

        boolean running = true;
        while (running) {
            System.out.println("\nEnter the Number To Do CRUD Operation:\n");
            System.out.println("1 -> Read table");
            System.out.println("2 -> Insert Records");
            System.out.println("3 -> Update Salary");
            System.out.println("4 -> Update Name");
            System.out.println("5 -> Delete Record by Id");
            System.out.println("0 -> Exit");

            System.out.print("\nYour Choice: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    crud.readRecords();
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Salary: ");
                    int salary = scanner.nextInt();
                    crud.insertRecord(id, name, salary);
                    break;
                case 3:
                    System.out.print("Enter ID to Update Salary: ");
                    int id1 = scanner.nextInt();
                    System.out.print("Enter New Salary: ");
                    int updateSalary_ = scanner.nextInt();
                    crud.updateSalary(id1, updateSalary_);
                    break;
                case 4:
                    System.out.print("Enter ID to Update Name: ");
                    int id2 = scanner.nextInt();
                    System.out.print("Enter New Name: ");
                    String updateName = scanner.next();
                    crud.updateName(id2, updateName);
                    break;
                case 5:
                    System.out.print("Enter ID to Delete Record: ");
                    int deleteId = scanner.nextInt();
                    crud.deleteRecord(deleteId);
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Please enter a valid number.");
            }
        }

        scanner.close();
    }
}
