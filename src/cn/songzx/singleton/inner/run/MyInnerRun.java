/**   
* @Title: MyInnerRun.java 
* @Package cn.songzx.singleton.inner.run 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����10:13:30 
* @version V1.0   
*/
package cn.songzx.singleton.inner.run;

import cn.songzx.singleton.inner.extthread.MyInnerThread;

/**
 * @ClassName: MyInnerRun
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����10:13:30
 * 
 */
public class MyInnerRun {

	/**
	 * @Date: 2017��10��8������10:13:30
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		MyInnerThread t1 = new MyInnerThread();
		MyInnerThread t2 = new MyInnerThread();
		MyInnerThread t3 = new MyInnerThread();
		t1.start();
		t2.start();
		t3.start();
	}

}
