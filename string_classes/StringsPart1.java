package string_classes;

public class StringsPart1 {

	public static void main(String[] args) {
		String str1="Wiley";
		String str2="Wiley";
		String str3=new String("Wiley");
		String str4=new String("Wiley");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
		String s="I am a java Developer";
		String s2=" Python";
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.concat(s2));
		System.out.println(s.replace("D","d"));
		System.out.println(s);
		
		String fn="V";
		String mn="S";
		String ln="T";
		String fullname=fn.concat(" ").concat(mn).concat(" ").concat(ln);//chaining
		System.out.println(fullname);
		
		String[] arr=s.split("java");
		System.out.println(arr);
		for(String a: arr) {
			System.out.println(a);
		}
		String input1=" Mobile ";
		System.out.println(input1.trim());
		System.out.println(input1);
		System.out.println(input1.substring(0,4));
		System.out.println(input1.toUpperCase());
		System.out.println(input1.toLowerCase());
		

	}

}
