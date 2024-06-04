package Lab2;

public class Lab2_PrimeFactors
{
    private long number;

    Lab2_PrimeFactors(long number)
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
        long currentValue = number;
        int multiplier = 2;

        while (currentValue > 1 && multiplier <= num_sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
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
        if (currentValue != 1)
        {
            System.out.print(currentValue);
        }
        System.out.println();
    }
}
