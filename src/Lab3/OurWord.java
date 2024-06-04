package Lab3;

public class OurWord {
    private String str;
    private int vowels;

    OurWord(String str, int vowels)
    {
        this.str = str;
        this.vowels = vowels;
    }
    OurWord() {}

    public void setStr(String str) {
        this.str = str;
    }
    public void setVow(int vowels) {
        this.vowels = vowels;
    }

    public String getStr() {
        return str;
    }
    public int getVow() {
        return vowels;
    }

    public void printValues()
    {
        System.out.println(this.str + "\t - " + this.vowels);
    }

    private boolean isVowels(char str_ch)
    {
        return str_ch == 'а' || str_ch == 'о' || str_ch == 'э' || str_ch == 'е' || str_ch == 'и' ||
                str_ch == 'ы' || str_ch == 'у' || str_ch == 'ё' || str_ch == 'ю' || str_ch == 'я';
    }

    private char replacingToCapital(char str_ch)
    {
        if (str_ch == 'а')
            return 'А';
        if (str_ch == 'о')
            return 'О';
        if (str_ch == 'э')
            return 'Э';
        if (str_ch == 'е')
            return 'Е';
        if (str_ch == 'и')
            return 'И';
        if (str_ch == 'ы')
            return 'Ы';
        if (str_ch == 'у')
            return 'У';
        if (str_ch == 'ё')
            return 'Ё';
        if (str_ch == 'ю')
            return 'Ю';
        return 'Я';
    }

    public void reverseValues(OurWord second_word)
    {
        String second_word_str = second_word.str;;
        int second_word_vowels = second_word.vowels;
        second_word.str = str;
        second_word.vowels = vowels;
        str = second_word_str;
        vowels = second_word_vowels;
    }

    public void firstCapitalVowel()
    {
        boolean isFirst = true;

        if (vowels > 0)
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (isVowels(str.charAt(i)) && isFirst)
                {
                    char[] c = str.toCharArray();
                    c[i] = replacingToCapital(str.charAt(i));
                    str = new String(c);
                    isFirst = false;
                }
            }
        }
    }
}
