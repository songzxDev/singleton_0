/**   
* @Title: MyEnumRun.java 
* @Package cn.songzx.singleton.enums.test.run 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����11:52:20 
* @version V1.0   
*/
package cn.songzx.singleton.enums.test.run;

import cn.songzx.singleton.enums.extthread.MyEnumThread;

/**
 * @ClassName: MyEnumRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����11:52:20
 * 
 */
public class MyEnumRun {

	/**
	 * @Date: 2017��10��8������11:52:20
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyEnumThread t1 = new MyEnumThread();
		MyEnumThread t2 = new MyEnumThread();
		MyEnumThread t3 = new MyEnumThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
