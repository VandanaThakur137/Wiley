package string_classes;

public class StringbuilderExmpl {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("Wiley ");
		sb.append("Edge");
		System.out.println(sb);
		StringBuilder logmsg=new StringBuilder();
		long time=System.currentTimeMillis();
		logmsg.append("[").append(time).append("]");
		logmsg.append(" User").append(": ").append("Name").append(" Successfully Login");
		System.out.println(logmsg.toString());
		
	}

}
