package edu.clemson.ece.leetcode.ImplementTrie;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    // Initialize your data structure here.
    boolean isEnd;
    Map<Character, TrieNode> map;
    public TrieNode() {
        map = new HashMap<>();
        isEnd = false;
    }
}
//Your Trie object will be instantiated and called as such:
//Trie trie = new Trie();
//trie.insert("somestring");
//trie.search("key");
public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode cur = root;
        for(int i=0; i<word.length(); i++){
            Character c = word.charAt(i);
            if(!cur.map.containsKey(c)){
                TrieNode tn = new TrieNode();
                cur.map.put(c, tn);
                cur = tn;
            } else {
                cur = cur.map.get(c);
            }
        }
        cur.isEnd = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode cur = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(!cur.map.containsKey(c)){
                return false;
            } else {
                cur = cur.map.get(c);
            }
        }
        return cur.isEnd;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(int i=0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            if(!cur.map.containsKey(c)){
                return false;
            } else {
                cur = cur.map.get(c);
            }
        }
        return true;
    }
}
