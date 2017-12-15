package study.Misc;

/*Write a program that prints the numbers from 1 to 100, but
for multiples of three  print “Fizz” instead of the number and
for multiples of five print “Buzz”.
For numbers which are multiples of both three and five, print “FizzBuzz”.*/

public class FizzBuzz {
    public static void main(String[] args) {

        //Newbie's path
        for (int i = 1; i <= 100; i++) {
            int residue3 = i % 3;
            int residue5 = i % 5;
            if (0 == residue3 && 0 == residue5) {
                System.out.print("FizzBuzz ");
            } else if (0 == residue3) System.out.print("Fizz ");
            else if (0 == residue5) System.out.print("Buzz ");
            else System.out.print(i + " ");
        }

        //Normal path
        for (int i = 1; i <= 100; System.out.println(), i++) {
            if (0 == i % 3) System.out.print("Fizz");
            if (0 == i % 5) System.out.print("Buzz");
            if (0 != i % 3 && 0 != i % 5) System.out.print(i);
        }

        //Shortest path
        for (short i = 1; i <= 100; i++) {
            System.out.println(i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i % 15 == 0 ? "FizzBuzz": String.valueOf(i));
        }

        //Boolean path
        for (int i = 1; i < 101; i++) {
            boolean residue3 = i % 3 == 0;
            boolean residue5 = i % 5 == 0;
            if (residue3) System.out.print("Fizz");
            if (residue5) System.out.print("Buzz");
            if (!residue3 && !residue5) System.out.print(i);
            System.out.print(" ");
        }

        //Flag path
        for (short i = 1; i < 101; i++) {
            boolean flag = false;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                flag = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                flag = true;
            }
            if (!flag) System.out.print(i);
            System.out.println();
        }

        //Indian path
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        for (int i = 0; i <= array.length - 1; i++) {
            Integer arrayElement = array[i];
            int residue = 0;
            if (arrayElement % 3 == 0) residue = 1;
            if (arrayElement % 5 == 0) residue = 2;
            if (arrayElement % 3 == 0 && i % 5 == 0) residue = 3;
            String print = "";
            switch (residue) {
                case 0:
                    print = arrayElement.toString() + " ";
                    break;
                case 1:
                    print = "Fizz ";
                    break;
                case 2:
                    print = "Buzz ";
                    break;
                case 3:
                    print = "FizzBuzz ";
                    break;
            }
            System.out.print(print);
        }

        //Chinese path
        System.out.print("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz");

    }
}
