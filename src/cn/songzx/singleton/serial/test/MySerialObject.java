/**   
* @Title: MySerialObject.java 
* @Package cn.songzx.singleton.serial.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����11:13:38 
* @version V1.0   
*/
package cn.songzx.singleton.serial.test;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @ClassName: MySerialObject
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����11:13:38
 * 
 */
public class MySerialObject implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	 */
	private static final long serialVersionUID = 9039559827725899001L;

	// �ڲ��෽ʽ
	private static class MySerialObjectHandler {
		private static final MySerialObject myObject = new MySerialObject();
	}

	private MySerialObject() {

	}

	public static MySerialObject getInstance() {
		return MySerialObjectHandler.myObject;
	}

	protected Object readResolve() throws ObjectStreamException {
		System.out.println("������readResolve ������");
		return MySerialObjectHandler.myObject;
	}

}
