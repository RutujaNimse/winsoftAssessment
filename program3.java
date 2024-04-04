//Write a Java Program to count the number of words in a string using hashmap.

import java.util.HashMap;
import java.util.Map;
class WordCounter{
	public static void main(String[]args){
		String str=new String("My name is Rutuja");
		String[]words=str.split(" ");
		Map<String,Integer>wordCountMap=new HashMap<>();

		for(String word:words){
			if(wordCountMap.containsKey(word)){
				wordCountMap.put(word,wordCountMap.get(word)+1);
			}else{
				wordCountMap.put(word,1);
			}
		}
		System.out.println("Word count in the string is:"+wordCountMap.size());
	}
}


