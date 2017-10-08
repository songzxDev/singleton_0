/**   
* @Title: MySerialObject.java 
* @Package cn.songzx.singleton.serial.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月8日 上午11:13:38 
* @version V1.0   
*/
package cn.songzx.singleton.serial.test;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @ClassName: MySerialObject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月8日 上午11:13:38
 * 
 */
public class MySerialObject implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 9039559827725899001L;

	// 内部类方式
	private static class MySerialObjectHandler {
		private static final MySerialObject myObject = new MySerialObject();
	}

	private MySerialObject() {

	}

	public static MySerialObject getInstance() {
		return MySerialObjectHandler.myObject;
	}

	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了readResolve 方法！");
		return MySerialObjectHandler.myObject;
	}

}
