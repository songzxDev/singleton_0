/**   
* @Title: MyStaticObject.java 
* @Package cn.songzx.singleton.stati.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����11:33:48 
* @version V1.0   
*/
package cn.songzx.singleton.stati.test;

/**
 * @ClassName: MyStaticObject
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����11:33:48
 * 
 */
public class MyStaticObject {
	private static MyStaticObject instance = null;

	private MyStaticObject() {
	}

	static {
		instance = new MyStaticObject();
	}

	public static MyStaticObject getInstance() {
		return instance;
	}
}
