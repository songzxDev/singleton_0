/**   
* @Title: MyErrorObject.java 
* @Package cn.songzx.singleton.error.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:28:03 
* @version V1.0   
*/
package cn.songzx.singleton.error.test;

/**
 * @ClassName: MyErrorObject
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:28:03
 * 
 */
public class MyErrorObject {
	private static MyErrorObject myObject;

	private MyErrorObject() {

	}

	public static MyErrorObject getInstance() {
		try {
			if (myObject != null) {

			} else {
				// ģ���ڴ�������֮ǰ��һЩ׼������
				Thread.sleep(3000L);
				myObject = new MyErrorObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
