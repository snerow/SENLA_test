package Lab3;

import java.util.ArrayList;

public class Vowels
{
    private String sentence;
    private ArrayList<OurWord> sentence_arr = new ArrayList<>();

    Vowels(String sentence)
    {
        this.sentence = sentence;

        StringBuilder temporary_str = new StringBuilder();
        int temporary_vow = 0;
        for (int i = 0; i < sentence.length(); i++)
        {
            if (!temporary_str.toString().isEmpty() && sentence.charAt(i) == ' ')
            {
                OurWord temporary_arr = new OurWord(temporary_str.toString(), temporary_vow);
                sentence_arr.add(temporary_arr);
                temporary_str = new StringBuilder();
                temporary_vow = 0;
            }
            else if (sentence.charAt(i) != ' ')     //если после предложения есть пробелы - не считаем их
            {
                temporary_str.append(sentence.charAt(i));
                if (isVowels(sentence.charAt(i)))
                {
                    temporary_vow += 1;
                }
            }
        }
        if (!temporary_str.toString().isEmpty())
        {
            OurWord temporary_arr = new OurWord(temporary_str.toString(), temporary_vow);
            sentence_arr.add(temporary_arr);
        }
    }

    public String getStr() {
        return sentence;
    }

    public void setStr(String sentence) {
        this.sentence = sentence;
    }

    public void printWordsAndVowels()
    {
        System.out.println("\nКол-во гласных в словах:");
        for (OurWord ourWord : sentence_arr)
        {
            System.out.println(ourWord.getStr() + "\t - " + ourWord.getVow());
        }
    }

    public void printAllVowels()
    {
        int temp_number = 0;
        for (OurWord ourWord : sentence_arr)
        {
            temp_number += ourWord.getVow();
        }
        System.out.println("\nОбщее кол-во гласных в предложении:\t" + temp_number);
    }

    private boolean isVowels(char str_ch)
    {
        return str_ch == 'а' || str_ch == 'о' || str_ch == 'э' || str_ch == 'е' || str_ch == 'и' ||
                str_ch == 'ы' || str_ch == 'у' || str_ch == 'ё' || str_ch == 'ю' || str_ch == 'я';
    }

    public void sortedWords()
    {
        OurWord[] temporaryMass = new OurWord[sentence_arr.size()];
        for (int i = 0; i < sentence_arr.size(); i++)
        {
            temporaryMass[i] = new OurWord(sentence_arr.get(i).getStr(), sentence_arr.get(i).getVow());
        }

        for (int i = 0; i < temporaryMass.length - 1; i++)
        {
            for (int j = 0; j < temporaryMass.length - i - 1; j++)
            {
                if (temporaryMass[j].getVow() > temporaryMass[j + 1].getVow())
                {
                    temporaryMass[j].reverseValues(temporaryMass[j + 1]);
                }
            }
        }

        for (int i = temporaryMass.length - 1; i >= 0; i--)
        {
            temporaryMass[i].printValues();
        }
    }

    public void firstCapitalVowel()
    {
        for (OurWord ourWord : sentence_arr)
        {
            ourWord.firstCapitalVowel();
            ourWord.printValues();
        }
    }

}
