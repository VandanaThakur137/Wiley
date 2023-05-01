package string_classes;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class BOStream {

	public static void main(String[] args) throws Exception{
		
	/*	FileOutputStream fos=new FileOutputStream("G:\\myfileexample\\data1.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s="I am a Programmer";
		byte[] b=s.getBytes();
		
		try {
			bos.write(b);
			bos.flush();
			bos.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		FileInputStream fis=new FileInputStream("D:\\EclipseWorkspace\\WileyJavaPart1\\data12.txt");
		BufferedInputStream bis =new BufferedInputStream(fis);
		int i;
		/*while(bis.read()!=-1) {
			System.out.println((char)i);
			//i++;
		}*/
		bis.close();
		fis.close();

	}

}
