/**   
* @Title: MyStaticRun.java 
* @Package cn.songzx.singleton.stati.test.run 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����11:37:06 
* @version V1.0   
*/
package cn.songzx.singleton.stati.test.run;

import cn.songzx.singleton.stati.extthread.MyStaticThread;

/**
 * @ClassName: MyStaticRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����11:37:06
 * 
 */
public class MyStaticRun {

	/**
	 * @Date: 2017��10��8������11:37:06
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyStaticThread t1 = new MyStaticThread();
		MyStaticThread t2 = new MyStaticThread();
		MyStaticThread t3 = new MyStaticThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
