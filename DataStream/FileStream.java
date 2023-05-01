package DataStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
public class FileStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos= new FileOutputStream("D:\\EclipseWorkspace\\WileyJavaPart1\\details.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBytes("Vandana");
		dos.writeBytes("Female");
		dos.writeBytes("21");
		dos.writeBytes("A");
		
		FileInputStream fis= new FileInputStream("D:\\EclipseWorkspace\\WileyJavaPart1\\details.txt");
		DataIntputStream dis=new DataIntputStream(fis);
		
		int count=fis.available();
		byte[] ba= new byte[count];
		dis.read(ba);
		for(byte bt:ba) {
			System.out.print((char)bt);
		}
		dis.close();
		fis.close();
		
		

	}

}
