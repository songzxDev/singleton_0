/**   
* @Title: SaveAndRead.java 
* @Package cn.songzx.singleton.serial.test.run 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����11:16:53 
* @version V1.0   
*/
package cn.songzx.singleton.serial.test.run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cn.songzx.singleton.serial.test.MySerialObject;

/**
 * @ClassName: SaveAndRead
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����11:16:53
 * 
 */
public class SaveAndRead {
	public static void main(String[] args) {
		try {
			MySerialObject myObject = MySerialObject.getInstance();
			FileOutputStream fosRef = new FileOutputStream(new File("MyObject.txt"));
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
			oosRef.writeObject(myObject);
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("��������������������������������������������������");
		try {
			FileInputStream fisRef = new FileInputStream(new File("MyObject.txt"));
			ObjectInputStream losRef = new ObjectInputStream(fisRef);
			MySerialObject myObject = (MySerialObject) losRef.readObject();
			losRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
