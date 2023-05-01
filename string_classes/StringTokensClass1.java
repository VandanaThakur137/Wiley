package string_classes;
import java.util.StringTokenizer;
public class StringTokensClass1 {

	public static void main(String[] args) {
		StringTokenizer stz=new StringTokenizer("We, love, Java Programming");
		System.out.println(stz.countTokens());
		while(stz.hasMoreElements()) {
			System.out.println(stz.nextToken().trim());
		}
		//System.out.println(stz.nextToken());
	}

}
