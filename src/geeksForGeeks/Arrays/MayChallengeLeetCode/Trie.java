package geeksForGeeks.Arrays.MayChallengeLeetCode;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private class TrieNode {
        Map<Character, TrieNode> node;
        boolean isEnd;

        public TrieNode() {
            this.node = new HashMap<>();
            this.isEnd = false;
        }
    }

       private final TrieNode root;
        public Trie() {
          root=  new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode current=root;
            for (int i=0;i<word.length();i++){
                TrieNode newNode=current.node.get(word.charAt(i));
                if(newNode==null){
                    newNode=new TrieNode();
                    current.node.put(word.charAt(i),newNode);
                }
                current=current.node.get(word.charAt(i));
            }
            current.isEnd=true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode current=root;
            for (int i=0;i<word.length();i++){
                TrieNode found=current.node.get(word.charAt(i));
                if(found!=null){
                    current=found;
                }
                else{
                    return false;
                }
            }
           return current.isEnd;

        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode current=root;
            for (int i=0;i<prefix.length();i++){
                TrieNode found=current.node.get(prefix.charAt(i));
                if(found!=null){
                    current=found;
                }
                else{
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        Trie obj=new Trie();
        obj.insert("abc");
        System.out.println(obj.search("abc"));
        System.out.println(obj.startsWith("b"));
    }

}
