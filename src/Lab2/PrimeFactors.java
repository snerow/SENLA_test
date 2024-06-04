package Lab2;

public class PrimeFactors
{
    private long number;

    PrimeFactors(long number)
    {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void primeFactorsNumber() {
        double num_sqrt = Math.sqrt(number);
        long current_value = number;
        int multiplier = 2;

        while (current_value > 1 && multiplier <= num_sqrt)
        {
            if (current_value % multiplier == 0)
            {
                System.out.print(multiplier + " ");
                current_value /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (current_value != 1)
        {
            System.out.print(current_value);
        }
        System.out.println();
    }

}
