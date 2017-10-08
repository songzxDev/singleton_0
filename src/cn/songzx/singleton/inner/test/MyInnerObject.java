/**   
* @Title: MyInnerObject.java 
* @Package cn.songzx.singleton.inner.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����10:10:02 
* @version V1.0   
*/
package cn.songzx.singleton.inner.test;

/**
 * @ClassName: MyInnerObject
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����10:10:02
 * 
 */
public class MyInnerObject {
	// �ڲ��෽ʽ
	private static class MyInnerObjectHandler {
		private static MyInnerObject myObject = new MyInnerObject();
	}

	private MyInnerObject() {

	}

	public static MyInnerObject getInstance() {
		return MyInnerObjectHandler.myObject;
	}
}
