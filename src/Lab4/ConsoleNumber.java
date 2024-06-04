package Lab4;

public class Lab4_ConsoleNumber
{
    private String number;

    Lab4_ConsoleNumber(String number)
    {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void number_in_console() {
        if (!number.isEmpty()) {
            char[] number_char = new char[number.length()];
            char num_max = number.charAt(0);

            for (int i = 0; i < number.length(); i++) {
                number_char[i] = number.charAt(i);
                if (num_max < number_char[i])
                {
                    num_max = number_char[i];
                }
            }

            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < number.length(); j++) {
                    if (number_char[j] - 48 == 0) {
                        if (num_max == number_char[j])
                            num_0_coolest(i);
                        else
                            num_0(i);
                    }
                    if (number_char[j] - 48 == 1) {
                        if (num_max == number_char[j])
                            num_1_coolest(i);
                        else
                            num_1(i);
                    }
                    if (number_char[j] - 48 == 2) {
                        if (num_max == number_char[j])
                            num_2_coolest(i);
                        else
                            num_2(i);
                    }
                    if (number_char[j] - 48 == 3) {
                        if (num_max == number_char[j])
                            num_3_coolest(i);
                        else
                            num_3(i);
                    }
                    if (number_char[j] - 48 == 4) {
                        if (num_max == number_char[j])
                            num_4_coolest(i);
                        else
                            num_4(i);
                    }
                    if (number_char[j] - 48 == 5) {
                        if (num_max == number_char[j])
                            num_5_coolest(i);
                        else
                            num_5(i);
                    }
                    if (number_char[j] - 48 == 6) {
                        if (num_max == number_char[j])
                            num_6_coolest(i);
                        else
                            num_6(i);
                    }
                    if (number_char[j] - 48 == 7) {
                        if (num_max == number_char[j])
                            num_7_coolest(i);
                        else
                            num_7(i);
                    }
                    if (number_char[j] - 48 == 8) {
                        if (num_max == number_char[j])
                            num_8_coolest(i);
                        else
                            num_8(i);
                    }
                    if (number_char[j] - 48 == 9) {
                        if (num_max == number_char[j])
                            num_9_coolest(i);
                        else
                            num_9(i);
                    }
                }
                System.out.println();
            }
        }
    }

    private void num_0(int i) {
        if (i == 0)
            System.out.print("  ***  ");
        if (i == 1)
            System.out.print(" *   * ");
        if (i == 2)
            System.out.print(" *   * ");
        if (i == 3)
            System.out.print(" *   * ");
        if (i == 4)
            System.out.print(" *   * ");
        if (i == 5)
            System.out.print(" *   * ");
        if (i == 6)
            System.out.print("  ***  ");
    }

    private void num_1(int i) {
        if (i == 0)
            System.out.print("   *   ");
        if (i == 1)
            System.out.print("  **   ");
        if (i == 2)
            System.out.print(" * *   ");
        if (i == 3)
            System.out.print("   *   ");
        if (i == 4)
            System.out.print("   *   ");
        if (i == 5)
            System.out.print("   *   ");
        if (i == 6)
            System.out.print("  ***  ");
    }

    private void num_2(int i) {
        if (i == 0)
            System.out.print("  ***  ");
        if (i == 1)
            System.out.print(" *   * ");
        if (i == 2)
            System.out.print(" *  *  ");
        if (i == 3)
            System.out.print("   *   ");
        if (i == 4)
            System.out.print("  *    ");
        if (i == 5)
            System.out.print(" *     ");
        if (i == 6)
            System.out.print(" ***** ");
    }

    private void num_3(int i) {
        if (i == 0)
            System.out.print("  ***  ");
        if (i == 1)
            System.out.print(" *   * ");
        if (i == 2)
            System.out.print("     * ");
        if (i == 3)
            System.out.print("    *  ");
        if (i == 4)
            System.out.print("     * ");
        if (i == 5)
            System.out.print(" *   * ");
        if (i == 6)
            System.out.print("  ***  ");
    }

    private void num_4(int i) {
        if (i == 0)
            System.out.print("    *  ");
        if (i == 1)
            System.out.print("   **  ");
        if (i == 2)
            System.out.print("  * *  ");
        if (i == 3)
            System.out.print(" *  *  ");
        if (i == 4)
            System.out.print(" ***** ");
        if (i == 5)
            System.out.print("    *  ");
        if (i == 6)
            System.out.print("    *  ");
    }

    private void num_5(int i) {
        if (i == 0)
            System.out.print(" ***** ");
        if (i == 1)
            System.out.print(" *     ");
        if (i == 2)
            System.out.print(" *     ");
        if (i == 3)
            System.out.print("  ***  ");
        if (i == 4)
            System.out.print("     * ");
        if (i == 5)
            System.out.print(" *   * ");
        if (i == 6)
            System.out.print("  ***  ");
    }

    private void num_6(int i) {
        if (i == 0)
            System.out.print("  ***  ");
        if (i == 1)
            System.out.print(" *     ");
        if (i == 2)
            System.out.print(" *     ");
        if (i == 3)
            System.out.print(" ****  ");
        if (i == 4)
            System.out.print(" *   * ");
        if (i == 5)
            System.out.print(" *   * ");
        if (i == 6)
            System.out.print("  ***  ");
    }

    private void num_7(int i) {
        if (i == 0)
            System.out.print(" ***** ");
        if (i == 1)
            System.out.print("     * ");
        if (i == 2)
            System.out.print("    *  ");
        if (i == 3)
            System.out.print("   *   ");
        if (i == 4)
            System.out.print("  *    ");
        if (i == 5)
            System.out.print("  *    ");
        if (i == 6)
            System.out.print("  *    ");
    }

    private void num_8(int i) {
        if (i == 0)
            System.out.print("  ***  ");
        if (i == 1)
            System.out.print(" *   * ");
        if (i == 2)
            System.out.print(" *   * ");
        if (i == 3)
            System.out.print("  ***  ");
        if (i == 4)
            System.out.print(" *   * ");
        if (i == 5)
            System.out.print(" *   * ");
        if (i == 6)
            System.out.print("  ***  ");
    }

    private void num_9(int i) {
        if (i == 0)
            System.out.print("  ***  ");
        if (i == 1)
            System.out.print(" *   * ");
        if (i == 2)
            System.out.print(" *   * ");
        if (i == 3)
            System.out.print("  **** ");
        if (i == 4)
            System.out.print("     * ");
        if (i == 5)
            System.out.print("     * ");
        if (i == 6)
            System.out.print("  ***  ");
    }


    private void num_0_coolest(int i) {
        if (i == 0)
            System.out.print("  000  ");
        if (i == 1)
            System.out.print(" 0   0 ");
        if (i == 2)
            System.out.print(" 0   0 ");
        if (i == 3)
            System.out.print(" 0   0 ");
        if (i == 4)
            System.out.print(" 0   0 ");
        if (i == 5)
            System.out.print(" 0   0 ");
        if (i == 6)
            System.out.print("  000  ");
    }

    private void num_1_coolest(int i) {
        if (i == 0)
            System.out.print("   1   ");
        if (i == 1)
            System.out.print("  11   ");
        if (i == 2)
            System.out.print(" 1 1   ");
        if (i == 3)
            System.out.print("   1   ");
        if (i == 4)
            System.out.print("   1   ");
        if (i == 5)
            System.out.print("   1   ");
        if (i == 6)
            System.out.print("  111  ");
    }

    private void num_2_coolest(int i) {
        if (i == 0)
            System.out.print("  222  ");
        if (i == 1)
            System.out.print(" 2   2 ");
        if (i == 2)
            System.out.print(" 2  2  ");
        if (i == 3)
            System.out.print("   2   ");
        if (i == 4)
            System.out.print("  2    ");
        if (i == 5)
            System.out.print(" 2     ");
        if (i == 6)
            System.out.print(" 22222 ");
    }

    private void num_3_coolest(int i) {
        if (i == 0)
            System.out.print("  333  ");
        if (i == 1)
            System.out.print(" 3   3 ");
        if (i == 2)
            System.out.print("     3 ");
        if (i == 3)
            System.out.print("    3  ");
        if (i == 4)
            System.out.print("     3 ");
        if (i == 5)
            System.out.print(" 3   3 ");
        if (i == 6)
            System.out.print("  333  ");
    }

    private void num_4_coolest(int i) {
        if (i == 0)
            System.out.print("    4  ");
        if (i == 1)
            System.out.print("   44  ");
        if (i == 2)
            System.out.print("  4 4  ");
        if (i == 3)
            System.out.print(" 4  4  ");
        if (i == 4)
            System.out.print(" 44444 ");
        if (i == 5)
            System.out.print("    4  ");
        if (i == 6)
            System.out.print("    4  ");
    }

    private void num_5_coolest(int i) {
        if (i == 0)
            System.out.print(" 55555 ");
        if (i == 1)
            System.out.print(" 5     ");
        if (i == 2)
            System.out.print(" 5     ");
        if (i == 3)
            System.out.print("  555  ");
        if (i == 4)
            System.out.print("     5 ");
        if (i == 5)
            System.out.print(" 5   5 ");
        if (i == 6)
            System.out.print("  555  ");
    }

    private void num_6_coolest(int i) {
        if (i == 0)
            System.out.print("  666  ");
        if (i == 1)
            System.out.print(" 6     ");
        if (i == 2)
            System.out.print(" 6     ");
        if (i == 3)
            System.out.print(" 6666  ");
        if (i == 4)
            System.out.print(" 6   6 ");
        if (i == 5)
            System.out.print(" 6   6 ");
        if (i == 6)
            System.out.print("  666  ");
    }

    private void num_7_coolest(int i) {
        if (i == 0)
            System.out.print(" 77777 ");
        if (i == 1)
            System.out.print("     7 ");
        if (i == 2)
            System.out.print("    7  ");
        if (i == 3)
            System.out.print("   7   ");
        if (i == 4)
            System.out.print("  7    ");
        if (i == 5)
            System.out.print("  7    ");
        if (i == 6)
            System.out.print("  7    ");
    }

    private void num_8_coolest(int i) {
        if (i == 0)
            System.out.print("  888  ");
        if (i == 1)
            System.out.print(" 8   8 ");
        if (i == 2)
            System.out.print(" 8   8 ");
        if (i == 3)
            System.out.print("  888  ");
        if (i == 4)
            System.out.print(" 8   8 ");
        if (i == 5)
            System.out.print(" 8   8 ");
        if (i == 6)
            System.out.print("  888  ");
    }

    private void num_9_coolest(int i) {
        if (i == 0)
            System.out.print("  999  ");
        if (i == 1)
            System.out.print(" 9   9 ");
        if (i == 2)
            System.out.print(" 9   9 ");
        if (i == 3)
            System.out.print("  9999 ");
        if (i == 4)
            System.out.print("     9 ");
        if (i == 5)
            System.out.print("     9 ");
        if (i == 6)
            System.out.print("  999  ");
    }
}
