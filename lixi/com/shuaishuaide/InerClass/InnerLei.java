package com.shuaishuaide.InerClass;

public class InnerLei {

	private static String s1 = "s1";
	
	private String s2 = "s2";
	
	private static void m1(){
		System.out.println("m1-ok");
	}
	
	private  void m2(){
		System.out.println("m2-ok");
	}
//=====================================================================	
	static class InnerClass{//                                 ��̬�ڲ���
		
		public static void m3(){
			
			System.out.println(s1);
			//System.out.println(s2);
			m1();
			//m2();
			
		}
		
		public void m4(){
			
			System.out.println(s1);
			//System.out.println(s2);
			m1();
			//m2();		
		}
	}
//=====================================================================	
	class InnerClass2{//                                       ��Ա�ڲ���
		/*
	public static void m3(){//��Ա�ڲ��಻���о�̬������
			
			System.out.println(s1);
			System.out.println(s2);
			m1();
			m2();
			
		}
	*/	
		public void m4(){//���о�̬�������Ա���ݶ����Է���
			
			System.out.println(s1);
			System.out.println(s2+"haha");
			m1();
			m2();		
		}
	}
//=====================================================================
	public void m5(){// ָ����һ���������ڷ�����                                                 �ֲ��ڲ���
		
		int x = 10;//�ֲ�������private public default protected���Σ���Ҳ��ˣ���Ȩ�޿��Ʒ�����//�����final
		
		class InnerClass3{
			
			//public static void m1(){}�ֲ��ڲ����ͬ�ھֲ��������Ҳ������ڲ���̬����
			
			public void m6(){
				
				System.out.println(x);//�ֲ��ڲ�����ʾֲ�����ʱ���ֲ�����ǰ��Ȼ��final��
			}
			
		}
		
		InnerClass3 inner = new InnerClass3();
		
		inner.m6();//ֱ�ӵ���OuterClass.m5()����ִ��m6();�漸�Ѹ��ӡ�
	}
//=====================================================================
//															      �����ڲ���

//ֱ��д������᣻
	
/*
 * public class Test{
 * 	
 * 	public static void t (CustomerService cs){//�˴����ڶ�̬//������ֱ�Ӽ��CustomerService��ִ���ڼ䴫��ʵ����
 * 
 * 		cs.logout();
 * 	}
 * 
 * 	public static void main(String[] args){
 * 		
 * 		t(new CustomerServiceImpl());  //���Դ���ʵ���࣬����ֱ��new �ӿڣ�������new ʵ����
 *		t(new CustomerServiceImpl(){  //�����ڲ���ķ�ʽʵ���˽ӿ� 
 *			public void logout(){
 *				
 *				System.out.println("�����ڲ����Ѿ�ʵ��")
 *			}
 *		});
 * }
 * 
 * 
 * 
 * }
 * 
 * Interface CustomerService{
 * 
 * 		void logout();
 * }
 * 
 * class CustomerServiceImpl implements CustomerService{
 * 
 * 		public void logout(){
 * 			System.out.println("��ȫ�˳�")
 * 		}
 * }
 * 
 * 
 * 
 * 
 */
}


