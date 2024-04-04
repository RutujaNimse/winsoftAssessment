//Write a Java Program to find the duplicate characters in a string
class duplicateCharacters{
	public static void main(String[]args){
		String str=new String("RutujaNimse");
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					System.out.println("duplicate characters in Strings are:"+ch[j]);
					count++;
				}
			}
		}
		System.out.println("duplicate characters count:"+count);
	}
}


