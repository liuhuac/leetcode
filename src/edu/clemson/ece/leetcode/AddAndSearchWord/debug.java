package edu.clemson.ece.leetcode.AddAndSearchWord;

public class debug {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordDictionary wd = new WordDictionary();
		wd.addWord("a");
		wd.addWord("a");
		wd.search(".");
		wd.search("a");
		wd.search("aa");
		wd.search("a");
		wd.search(".a");
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(Node n : node.nodes){
                    if(n==null) continue;
                    if(search(word.substring(i+1), n)){
                        return true;
                    } 
                }
                return false;
            } else {
                if(node.nodes[c-'a']==null){
                    return false;
                } else {
                    return search(word.substring(i+1), node.nodes[c-'a']);
                }
            }
        }
        return false;

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(Node n : node.nodes){
                    if(n==null) continue;
                    if(search(word.substring(i+1), n)){
                        return true;
                    } 
                }
                return false;
            } else {
                if(node.nodes[c-'a']==null){
                    return false;
                } else {
                    return search(word.substring(i+1), node.nodes[c-'a']);
                }
            }
        }
        return false;

        if(word.length()==0) return node.isLeaf;
        char c = word.charAt(0);
        if(c=='.'){
            for(Node n : node.nodes){
                if(n==null) continue;
                if(search(word.substring(1), n)) return true;
            }
        } else {
            if(node.nodes[c-'a']!=null) return search(word.substring(1), node.nodes[c-'a']);
        }
        return false;
    
		wd.search("a.");
	}

}
