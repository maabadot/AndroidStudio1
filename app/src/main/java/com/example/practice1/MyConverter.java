package com.example.practice1;

public class MyConverter
{
    public String convertNumber(int i)
    {
        String s = "", sRes = "";
        String[] arr1 = {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] arr2 = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] arr3 = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

        if (i >= 0 && i <20)
        {
            sRes = arr1[i];
            String capitalized = sRes.substring(0, 1).toUpperCase() + sRes.substring(1).toLowerCase();
            //myViewHolder.myEvenTextView.setText(capitalized + s);
        }

        else if (i >= 19 && i < 99)
        {
            sRes += arr2[Character.getNumericValue(s.charAt(0)) - 1];
            sRes += " ";
            if (Character.getNumericValue(s.charAt(1)) != 0)
            {
                sRes += arr1[Character.getNumericValue(s.charAt(1)) - 1];
            }
            String capitalized = sRes.substring(0, 1).toUpperCase() + sRes.substring(1).toLowerCase();
            //myViewHolder.myEvenTextView.setText(capitalized + s);
        }

        else if (i >= 100 && i < 999)
        {
            sRes += arr3[Character.getNumericValue(s.charAt(0)) - 1];
            sRes += " ";
            if (Character.getNumericValue(s.charAt(1)) != 0)
            {
                sRes += arr2[Character.getNumericValue(s.charAt(1)) - 1];
            }
            sRes += " ";
            if (Character.getNumericValue(s.charAt(2)) != 0)
            {
                sRes += arr3[Character.getNumericValue(s.charAt(2)) - 1];
            }
        }

        else if (i == 1000000)
        {
            //myViewHolder.myEvenTextView.setText("Миллион");
        }

        s += String.valueOf(i);
        return (s);
    }

}
