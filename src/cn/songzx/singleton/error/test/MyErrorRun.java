/**   
* @Title: MyErrorRun.java 
* @Package cn.songzx.singleton.error.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:38:04 
* @version V1.0   
*/
package cn.songzx.singleton.error.test;

import cn.songzx.singleton.error.extthread.MyErrorThread;

/**
 * @ClassName: MyErrorRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:38:04
 * 
 */
public class MyErrorRun {

	/**
	 * @Date: 2017��10��8������9:38:04
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyErrorThread t1 = new MyErrorThread();
		MyErrorThread t2 = new MyErrorThread();
		MyErrorThread t3 = new MyErrorThread();
		// ����̨��ӡ������hasCode��˵���������������󣬲����ǵ�����
		t1.start();
		t2.start();
		t3.start();
	}

}
