import java.util.Scanner;

public class to_do {
    Node head;

    static class Node{
        String task;
        String date;
        Node next;

        Node(String x, String y){
            task = x;
            date = y;
            next = null;
        }
    }

    static void insertTask(to_do list, String x, String y){
        Node newNode = new Node(x, y);
        if(list.head == null){
            list.head = newNode;
        } else {
            newNode.next = list.head;
            list.head = newNode;
        }
    }

    static void deleteTask(to_do list){
        if(list.head == null){
            System.out.printf("Tidak bisa delete task karena kosong!\n");
        } else {
            list.head = list.head.next;
        }
    }

    static void displayTask(to_do list){
        if(list.head == null){
            System.out.printf("Tidak bisa display task karena kosong!\n");
        } else {
            Node temp = list.head;
            System.out.printf("|-----------------|\n");
            while(temp != null){
                System.out.printf("Nama Task : %s\nTanggal : %s\n", temp.task, temp.date);
                System.out.printf("|-----------------|\n");
                temp = temp.next;
            }
        }
    }

    static void inputData(to_do list){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a task and a date\n");

        System.out.printf("Task : ");
        String task = scanner.nextLine();



        System.out.printf("Date : ");
        String date = scanner.nextLine();


        insertTask(list, task, date);

    }

    static void gimmickMainMenu(){
        System.out.printf("|-----------------|\n");
        System.out.printf("1. List task\n");
        System.out.printf("2. Insert task\n");
        System.out.printf("3. Delete task\n");
        System.out.printf("0. End program:)\n");
        System.out.printf("|-----------------|\n");
    }

    static void cases(int choice, to_do list){
        if(choice == 1){
            displayTask(list);
        } else if(choice == 2){
            inputData(list);
        } else if(choice == 3){
            deleteTask(list);
        } else if(choice == 0) {
            System.out.printf("Goodbye!\n");
        } else {
            System.out.printf("Invalid choice~\n");
        }
    }

    public static void main(String[] args) {
        to_do list = new to_do();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        while(choice != 0){
            gimmickMainMenu();
            choice = scanner.nextInt();
            cases(choice, list);
        }


    }


}
