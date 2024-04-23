public class CountingWords {
    public int prefixCount(String[] words, String pref) {
        int out = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].contains(pref)){
                String s = words[i].substring(0, pref.length());
                if(s.equals(pref)){
                    out++;
                }
            }
        }
        return out;
    }
}
