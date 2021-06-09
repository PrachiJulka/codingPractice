package geeksForGeeks.Arrays.leetCode;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary {


        private class Words{
            Map<Character,Words> wordsTrie;
            boolean isEnd;

            public Words(){
                wordsTrie=new HashMap<>();
                isEnd=false;
            }
        }

        Words root;
        /** Initialize your data structure here. */
        public WordDictionary() {
            root=new Words();
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            Words current=root;
            for(int i=0;i<word.length();i++){
                Words newNode=current.wordsTrie.get(word.charAt(i));
                System.out.println(newNode);
                if(newNode==null){
                    newNode=new Words();
                    current.wordsTrie.put(word.charAt(i),newNode);
                }
                current=current.wordsTrie.get(word.charAt(i));
            }
            current.isEnd=true;
        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            Words current=root;
            boolean flag=false;
            for(int i=0;i<word.length();i++) {
                flag=false;
                while (i<=word.length()-1 &&     word.charAt(i) == '.') {
                    i++;
                    flag=true;
                }
                if(flag) {
                    if (i <= word.length() - 1) {
                        for (Character c : current.wordsTrie.keySet()) {
                            Words w = current.wordsTrie.get(c);
                            if (w.wordsTrie.containsKey(word.charAt(i))) {
                                current = w;
                                break;
                            }
                        }
                    }
                    else
                        return true;
                }

                if (i <= word.length() - 1) {
                    Words node = current.wordsTrie.get(word.charAt(i));
                    if (node == null)
                        return false;
                    else
                        current = node;
                }


            }
            return current.isEnd;
        }

    public static void main(String[] args) {
        WordDictionary obj=new WordDictionary();
        obj.addWord("ran");
        obj.addWord("rune");
        obj.addWord("runner");
        obj.addWord("runs");
        obj.addWord("add");
        obj.addWord("adds");
        obj.addWord("adder");
        obj.addWord("addee");
        System.out.println(obj.search("r.n"));
        System.out.println(obj.search("ru.n.e"));
        System.out.println(obj.search("add"));
        System.out.println(obj.search("add."));

        System.out.println(obj.search("....e."));


    }
    }

