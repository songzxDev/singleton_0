/**   
* @Title: MyRun.java 
* @Package cn.songzx.singleton_0.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:14:32 
* @version V1.0   
*/
package cn.songzx.singleton_0.test;

import cn.songzx.singleton_0.extthread.MyThread;

/**
 * @ClassName: MyRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:14:32
 * 
 */
public class MyRunB {

	/**
	 * @Date: 2017��10��8������9:14:32
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
