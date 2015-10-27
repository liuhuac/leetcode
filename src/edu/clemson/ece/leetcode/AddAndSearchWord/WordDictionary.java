package edu.clemson.ece.leetcode.AddAndSearchWord;

public class WordDictionary {
    
    public class Node {
        boolean isLeaf;
        Node[] nodes = new Node[26];
    }

    private Node root = new Node();
    
    // Adds a word into the data structure.
    public void addWord(String word) {
        Node node = root;
        for(char c : word.toCharArray()){
            node.nodes[c-'a'] = new Node();
            node = node.nodes[c-'a'];
        }
        node.isLeaf = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return search(word, root);
    }
    
    public boolean search(String word, Node node) {
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(Node n : node.nodes){
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
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");