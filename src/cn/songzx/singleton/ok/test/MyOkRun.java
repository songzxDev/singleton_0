/**   
* @Title: MyOkRun.java 
* @Package cn.songzx.singleton.ok.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:48:19 
* @version V1.0   
*/
package cn.songzx.singleton.ok.test;

import cn.songzx.singleton.ok.extthread.MyOkThread;

/**
 * @ClassName: MyOkRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:48:19
 * 
 */
public class MyOkRun {

	/**
	 * @Date: 2017��10��8������9:48:19
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyOkThread t1 = new MyOkThread();
		MyOkThread t2 = new MyOkThread();
		MyOkThread t3 = new MyOkThread();
		/*
		 * �˷�������ͬ��synchronized�ؼ��ֵõ���ͬʵ���Ķ��󣬵����ַ���������Ч�ʷǳ����£���ͬ��
		 * 
		 * ���еģ���һ���߳���Ҫȡ�ö��󣬱������һ���߳��ͷ���֮�󣬲ſ��Լ������С�
		 */
		t1.start();
		t2.start();
		t3.start();
	}

}
