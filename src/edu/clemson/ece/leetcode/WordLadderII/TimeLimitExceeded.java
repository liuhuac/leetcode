package edu.clemson.ece.leetcode.WordLadderII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dict = new HashSet<>(Arrays.asList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"));
		TimeLimitExceeded tle = new TimeLimitExceeded();
		tle.findLadders("qa", "sq", dict);
	}
	public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> ans = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        dict.add(end);
        cur.add(start);
        findLadders(ans, cur, start, end, dict, 1);
        return ans;
    }
    public void findLadders(List<List<String>> ans, List<String> cur, String start, String end, Set<String> dict, int step) {
        if(ans.size()>0){
            if(step>ans.get(0).size()-1) return;
        }
        for(int i=0; i<start.length(); i++){
            for(char j='a'; j<='z'; j++){
                String next = start.substring(0,i) + j + start.substring(i+1);
                if(end.equals(next)){
                    cur.add(next);
                    ans.add(new ArrayList<String>(cur));
                    cur.remove(next);
                    return;
                }
                if(!start.equals(next)&&dict.contains(next)){
                    dict.remove(next);
                    cur.add(next);
                    findLadders(ans, cur, next, end, dict, ++step);
                    cur.remove(cur.size()-1);
                    dict.add(next);
                    step--;
                }
            }
        }
    }
}
