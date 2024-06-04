package Lab1;

public class SumNumbers {
    private String str;

    SumNumbers(String str)
    {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public long sumNumbersInStr()
    {
        long sum_of_numbers = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))           //проверяем, является ли i-ый символ строки числом
                sum_of_numbers += str.charAt(i) - 48;      //вычитаем 48, потому что именно с 48-ой позиции начинаются числа в UNICODE
        }
        return sum_of_numbers;
    }

}
