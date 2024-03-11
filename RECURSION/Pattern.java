//public class Pattern {
//    public static void main(String[] args) {
//        print(5);
//        triangle(4, 0);
//    }
//
//    /*
//    *
//    * *
//    * * *
//    * * * *
//     */
//    private static void triangle(int r, int c){
//        if(r == 1){
//            return;
//        }
//
//    }
//    private static void print(int n) {
//        if(n==0) {
//            return;
//        }
//        else {
//            printLine(n);
//            print(n-1);
//        }
//    }
//
//    public static void printLine(int n){
//        if(n==1){
//            System.out.print("*\n");
//            return;
//        }
//        else {
//            System.out.print("* ");
//            printLine(n-1);
//        }
//    }
//
//}

// Question: 2
/*
Write a program to build ticketing software for a Zoo using Object Oriented Programming. If you are not familiar or
comfortable with object-oriented programming, we suggest you give this article a quick read to ensure you
understand it before you attempt it.
It should have the following features:

1. When the guests arrive at the entrance gate, the person at the ticketing counter should input the number of
guests and age of each guest. The pricing depends on the age as follows:
a. If age <= 2 years, entrance price is INR 0.
b. If age > 2 and < 18 years, entrance price is INR 100.
c. If age >= 18 and < 60 years, entrance price is INR 500.
d. If age >= 60 years, entrance price is INR 300.
Your software should issue an entrance ticket and display the total charges on the ticket based on the
number of guests and their age.

2. Before entering the Zoo, the security personnel should be able to validate the ticket i.e., they should be able
to see the guests and their age associated with the ticket and manually verify the guests who are trying to
enter the Zoo.
Your software should be able to take an issued ticket and display ticket details (a line for each guest on
the ticket - person, age) so security personnel can confirm the guests before letting them enter the Zoo.
Ex: If a ticket was issued for 2 guest (age 23 and 25), it should display:
Guest 1 (age: 23)
Guest 2 (age: 25)
*/

/*
Time Complexity    -> O(n) // n = number of tickets
Space Complexity   -> O(n)
*/

import java.util.*;
//public class Pattern {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//
//        while (flag) {
//
//            System.out.println("Choose an option :");
//            System.out.println("1. Buy tickets ");
//            System.out.println("2. Exit");
//
//            int ope = sc.nextInt();
//
//            if (ope == 1) {
//
//                List<Zoo> al = new ArrayList<>();
//                int sum = 0;
//
//                System.out.print("Number of Visitors : ");
//                int n = sc.nextInt();
//                for (int i = 0; i < n; i++) {
//                    System.out.print("\nEnter Name : ");
//                    String name = sc.next();
//                    System.out.print("Enter age : ");
//                    int age = sc.nextInt();
//                    sum += calculateFare(age);
//                    Zoo ticket = new Zoo(name, age);
//                    al.add(ticket);
//
//                }
//
//                System.out.println("\nTicket Details :\n");
//                for (Zoo ticket : al) {
//                    System.out.println(ticket.getName() +  "     " + ticket.getAge());
//                }
//                System.out.println("\nTotal Amount to be Paid." + sum);
//
//            } else if (ope == 2) {
//                flag = false;
//            } else {
//                System.out.println("\nOops!, Come again!!!");
//            }
//
//        }
//
//        System.out.println("\nThanks for Visiting!!!");
//    }
//
//
//    public static int calculateFare(int age) {
//        if (age <= 2)
//            return 0;
//        else if (age < 18)
//            return 100;
//        else if (age < 60)
//            return 500;
//        else
//            return 300;
//    }
//}
//
//
//class Zoo{
//
//    String name;
//    int age;
//
//    Zoo(String name, int age){
//        this.age  = age;
//        this.name = name;
//    }
//
//    String getName(){
//        return this.name;
//    }
//
//    int getAge(){
//        return this.age;
//    }
//}

class Pattern {

    public static void main(String[] args) {
        System.out.println(solve(6, 2, new int[]{1, 7, 8, 2, 3, 9}, new int[]{2, 1}));
    }



        public static long solve(int N, int M, int[] A, int[] B) {
            long profit = 0;

            // Sort the groups in decreasing order of their size.
            Arrays.sort(B);

            // Iterate over the groups in this order, assigning each group to the cheapest available seats that can accommodate them.
            int[] seats = new int[N];
            for (int i = M-1; i >= 0; i--) {
                int groupSize = B[i];
                int cheapestSeat = 0;
                while (cheapestSeat < N && seats[cheapestSeat] == 1) {
                    cheapestSeat++;
                }

                // If there are enough seats available for the group, assign them to the group and update the profit.
                if (cheapestSeat + groupSize <= N) {
                    for (int j = cheapestSeat; j < cheapestSeat + groupSize; j++) {
                        seats[j] = 1;
                    }
                    profit += A[cheapestSeat] - groupSize;
                }
            }

            return profit;
        }
}