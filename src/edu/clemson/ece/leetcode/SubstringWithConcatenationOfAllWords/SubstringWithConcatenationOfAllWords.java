package edu.clemson.ece.leetcode.SubstringWithConcatenationOfAllWords;

public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> freq = new HashMap<>();
        for(String w : words){
            if(freq.containsKey(w)){
                freq.put(w, freq.get(w)+1);
            } else {
                freq.put(w, 1);
            }
        }
        
        List<Integer> res = new ArrayList<>();
        int wordLen = words[0].length();
        
        for(int i=0; i<wordLen; i++){
            
            Map<String, Integer> tmp = new HashMap<>();
            int count = 0; /* count how many words are used */
            int starting = i;
            
            for(int j=i; j<=s.length()-wordLen; j += wordLen){
                String word = s.substring(j,j+wordLen);
                if(freq.containsKey(word)){
                    /* add word to tmp map */
                    if(tmp.containsKey(word)){
                        tmp.put(word, tmp.get(word)+1);
                    } else {
                        tmp.put(word, 1);
                    }
                    
                    count++;
                    
                    if(tmp.get(word)>freq.get(word)){
                        while(tmp.get(word)>freq.get(word)){
                            String str = s.substring(starting,starting+wordLen);
                            tmp.put(str, tmp.get(str)-1);
                            starting += wordLen;
                            count--;
                        }
                    }
                    
                    if(count==words.length){
                        res.add(starting);
                        
                    }
                } else {
                    tmp.clear(); /* reset parameters */
                    count = 0;
                    starting = j + wordLen;
                }
            }
        }
        
        return res;
    }
}
