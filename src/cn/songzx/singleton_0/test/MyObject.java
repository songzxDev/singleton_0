/**   
* @Title: MyObject.java 
* @Package cn.songzx.singleton_0.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:09:25 
* @version V1.0   
*/
package cn.songzx.singleton_0.test;

/**
 * @ClassName: MyObject
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:09:25
 * 
 */
public class MyObject {

	private static MyObject myObject = new MyObject();// �������أ�����ģʽ

	private MyObject() {
	}

	public static MyObject getInstance() {
		/*
		 * �˴���汾Ϊ��������
		 * 
		 * �˰汾�����ȱ���ǲ���������ʵ������
		 * 
		 * ��ΪgetInstance() ����û��ͬ��
		 * 
		 * �����п��ܳ��ַ��̰߳�ȫ����
		 */
		return myObject;
	}
}
