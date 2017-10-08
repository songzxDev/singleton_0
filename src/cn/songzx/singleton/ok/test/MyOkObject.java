/**   
* @Title: MyOkObject.java 
* @Package cn.songzx.singleton.ok 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����9:41:42 
* @version V1.0   
*/
package cn.songzx.singleton.ok.test;

/**
 * @ClassName: MyOkObject
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����9:41:42
 * 
 */
public class MyOkObject {
	private static MyOkObject myObject;

	private MyOkObject() {
	}

	// ����ͬ������Ч��̫���ˣ�������������
	synchronized public static MyOkObject getInstance() {
		try {
			if (myObject != null) {

			} else {
				// ģ���ڴ�������֮ǰ��һЩ׼������
				Thread.sleep(3000L);
				myObject = new MyOkObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

	public static MyOkObject getInstanceA() {
		synchronized (MyOkObject.class) {
			try {
				// ����д������������Ч��һ����Ч�ʵͣ�ȫ����������
				if (myObject != null) {

				} else {
					// ģ���ڴ�������֮ǰ��һЩ׼������
					Thread.sleep(3000L);
					myObject = new MyOkObject();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return myObject;
		}
	}

	public static MyOkObject getInstanceB() {
		// ���ĳЩ��Ҫ�Ĵ�����е�����ͬ��
		try {
			if (myObject != null) {

			} else {
				// ģ���ڴ�������֮ǰ��һЩ׼������
				Thread.sleep(3000L);
				// ��Ȼ���ִ������������ǻ��Ǵ��ڷ��̰߳�ȫ����
				synchronized (MyOkObject.class) {
					myObject = new MyOkObject();
				}

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myObject;
	}
	
}
