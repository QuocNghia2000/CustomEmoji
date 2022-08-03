package github.ankushsachdeva.emojicon.emoji_default;

import java.util.ArrayList;
import java.util.Arrays;

import github.ankushsachdeva.emojicon.EmojiData;

public class EmojiDefault {
    public static final String getEmojiByUnicode(int codePoint) {
        if (Character.charCount(codePoint) == 1) {
            return String.valueOf(codePoint);
        } else {
            return new String(Character.toChars(codePoint));
        }
    }
   
    public final static ArrayList<String> getDataRow0() {
        return new ArrayList<>(Arrays.asList(Nature.DATA));
    }

   
    public final static ArrayList<String> getDataRow1() {
        return new ArrayList<>(Arrays.asList(Objects.DATA));
    }

   
    public final static ArrayList<String> getDataRow2() {
        return new ArrayList<>(Arrays.asList(People.DATA));
    }

   
    public final static ArrayList<String> getDataRow3() {
        return new ArrayList<>(Arrays.asList(Places.DATA));
    }

   
    public final static ArrayList<String> getDataRow4() {
        return new ArrayList<>(Arrays.asList(Symbols.DATA));
    }

   
    public final static ArrayList<String> getDataRow5() {
        return EmojiRow5.getData();
    }

   
    public final static ArrayList<String> getDataRow6() {
        return EmojiRow6.getData();
    }

   
    public final static ArrayList<String> getDataRow7() {
        return EmojiRow7.getData();
    }


    public final static ArrayList<String> getCategories()
    {
        ArrayList<String> temp = new ArrayList<>();
        temp.add(getDataRow0().get(0));
        temp.add(getDataRow1().get(0));
        temp.add(getDataRow2().get(0));
        temp.add(getDataRow3().get(0));
        temp.add(getDataRow4().get(0));
        temp.add(getDataRow5().get(0));
        temp.add(getDataRow6().get(0));
        temp.add(getDataRow7().get(0));
        return temp;
    }
}
