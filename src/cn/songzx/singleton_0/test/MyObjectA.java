/**   
* @Title: MyObjectA.java 
* @Package cn.songzx.singleton_0.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:17:16 
* @version V1.0   
*/
package cn.songzx.singleton_0.test;

/**
 * @ClassName: MyObjectA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:17:16
 * 
 */
public class MyObjectA {
	private static MyObjectA myObject;

	private MyObjectA() {

	}
	
	public static MyObjectA getInstance() {
		if(myObject != null) {// �ӳټ���
			
		}else {
			myObject = new MyObjectA();
		}
		return myObject;
	}
}
