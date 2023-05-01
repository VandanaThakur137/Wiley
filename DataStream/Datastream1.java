package DataStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
public class Datastream1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("D:\\EclipseWorkspace\\WileyJavaPart1\\data.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBytes("I am a Programmer");
		dos.flush();
		dos.close();
		
		
		FileInputStream fis=new FileInputStream("D:\\EclipseWorkspace\\WileyJavaPart1\\data.txt");
		DataInputStream dis=new DataInputStream(fis);
		
		int count=fis.available();
		byte[] ba= new byte[count];
		dis.read(ba);
		for(byte bt:ba) {
			System.out.println((char)bt);
		}
		dis.close();
		fis.close();
	}

}
