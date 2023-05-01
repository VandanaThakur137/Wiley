package string_classes;

public class StringBufferExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sf = new StringBuffer("Wiley");
		StringBuffer sf1 = new StringBuffer("Wiley");
		StringBuffer sf2 = new StringBuffer("Wiley");
		String ss="Wiley";
		System.out.println(ss.equals(sf));
		System.out.println(ss.equals(sf.toString()));
		sf.append(" Edge");
		System.out.println(sf);
		System.out.println(sf.insert(5,"jj"));
		System.out.println(sf1.reverse());
		System.out.println(sf1.delete(0,3));
		
		
		
		
	}

}
