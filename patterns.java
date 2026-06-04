import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== DSA Patterns Selector ===");
            System.out.println("1. Pattern 1 (Square Star)");
            System.out.println("2. Pattern 2 (Increasing Number Triangle Starting at 2)");
            System.out.println("3. Pattern 3 (Star Pyramid)");
            System.out.println("4. Pattern 4 (Inverted Star Pyramid)");
            System.out.println("5. Pattern 5 (Diamond Star)");
            System.out.println("6. Pattern 6 (Half Diamond Star)");
            System.out.println("7. Pattern 7 (Alternating 1 and 0 Triangle)");
            System.out.println("8. Pattern 8 (Number Crown)");
            System.out.println("9. Pattern 9 (Floyd's Triangle)");
            System.out.println("10. Pattern 10 (Continuous Alphabet Triangle)");
            System.out.println("11. Pattern 11 (Alphabet Triangle Row-wise starting A)");
            System.out.println("12. Pattern 12 (Inverted Alphabet Triangle starting A)");
            System.out.println("13. Pattern 13 (Alphabet Repeating Character Triangle)");
            System.out.println("14. Pattern 14 (Alphabet Centered Pyramid)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-14): ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice input. Exiting.");
                break;
            }
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            if (choice < 1 || choice > 14) {
                System.out.println("Invalid pattern option. Please choose a number between 0 and 14.");
                continue;
            }
            
            System.out.print("Enter the size (n): ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid size input. Please enter an integer.");
                sc.next(); // clear the invalid input
                continue;
            }
            int n = sc.nextInt();
            
            System.out.println("\n--- Pattern " + choice + " Output (n = " + n + ") ---");
            runPattern(choice, n);
            System.out.println("---------------------------------------");
        }
        sc.close();
    }

    public static void runPattern(int choice, int n) {
        switch (choice) {
            case 1:
                pattern1(n);
                break;
            case 2:
                pattern2(n);
                break;
            case 3:
                pattern3(n);
                break;
            case 4:
                pattern4(n);
                break;
            case 5:
                pattern5(n);
                break;
            case 6:
                pattern6(n);
                break;
            case 7:
                pattern7(n);
                break;
            case 8:
                pattern8(n);
                break;
            case 9:
                pattern9(n);
                break;
            case 10:
                pattern10(n);
                break;
            case 11:
                pattern11(n);
                break;
            case 12:
                pattern12(n);
                break;
            case 13:
                pattern13(n);
                break;
            case 14:
                pattern14(n);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // 1. Square Star Pattern
    public static void pattern1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2. Increasing Number Triangle Starting at 2 (prints j+1)
    public static void pattern2(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    // 3. Star Pyramid
    public static void pattern3(int n) {
        for(int i = 0; i < n; i++) {
            // spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 4. Inverted Star Pyramid
    public static void pattern4(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Diamond Star
    public static void pattern5(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Half Diamond Star
    public static void pattern6(int n) {
        for(int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if(i > n) {
                stars = 2 * n - i;
            }
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7. Alternating 1 and 0 Triangle
    public static void pattern7(int n) {
        for(int i = 0; i < n; i++) {
            int l;
            if(i % 2 == 0)
                l = 1;
            else
                l = 0;
            for(int j = 0; j <= i; j++) {
                System.out.print(l);
                l = 1 - l;
            }
            System.out.println();
        }
    }

    // 8. Number Crown
    public static void pattern8(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for(int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for(int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    // 9. Floyd's Triangle
    public static void pattern9(int n) {
        int a = 1;
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    // 10. Continuous Alphabet Triangle (A, B C, D E F...)
    public static void pattern10(int n) {
        char a = 'A';
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    // 11. Alphabet Triangle Row-wise starting A (A, A B, A B C...)
    public static void pattern11(int n) {
        for(int i = 0; i <= n; i++) {
            char a = 'A';
            for(int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    // 12. Inverted Alphabet Triangle starting A (A B C, A B...)
    public static void pattern12(int n) {
        for(int i = 0; i <= n; i++) {
            char a = 'A';
            for(int j = 0; j <= n - i - 1; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    // 13. Alphabet Repeating Character Triangle (A, BB, CCC...)
    public static void pattern13(int n) {
        for(int i = 0; i < n; i++) {
            char a = (char)('A' + i);
            for(int j = 0; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

    // 14. Alphabet Centered Pyramid
    public static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            // characters
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < (2 * i + 1) / 2) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}