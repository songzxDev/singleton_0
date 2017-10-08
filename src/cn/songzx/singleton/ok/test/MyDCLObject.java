/**   
* @Title: MyDCLObject.java 
* @Package cn.songzx.singleton.ok.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��10��8�� ����10:00:44 
* @version V1.0   
*/
package cn.songzx.singleton.ok.test;

/**
 * @ClassName: MyDCLObject
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��10��8�� ����10:00:44
 * 
 */
public class MyDCLObject {
	private volatile static MyDCLObject myObject;

	private MyDCLObject() {
	}

	/**
	 * 
	 * @Date: 2017��10��8������10:03:41
	 * @Title: getInstance
	 * @Description: TODO(�˰汾�Ĵ���Ϊ˫�ؼ�� Double-Check-Locking)
	 * @return
	 * @return MyDCLObject ����ֵ����
	 */
	public static MyDCLObject getInstance() {
		try {
			if (myObject != null) {
				System.out.println("�����NULL��������");
			} else {
				// ģ���ڴ�������֮ǰ��һЩ׼���Թ���
				Thread.sleep(3000L);
				synchronized (MyDCLObject.class) {
					if (myObject == null) {
						myObject = new MyDCLObject();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
