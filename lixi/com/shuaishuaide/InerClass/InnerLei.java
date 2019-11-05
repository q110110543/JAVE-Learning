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
	static class InnerClass{//                                 静态内部类
		
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
	class InnerClass2{//                                       成员内部类
		/*
	public static void m3(){//成员内部类不能有静态声明。
			
			System.out.println(s1);
			System.out.println(s2);
			m1();
			m2();
			
		}
	*/	
		public void m4(){//所有静态数据与成员数据都可以访问
			
			System.out.println(s1);
			System.out.println(s2+"haha");
			m1();
			m2();		
		}
	}
//=====================================================================
	public void m5(){// 指定了一方法，类在方法内                                                 局部内部类
		
		int x = 10;//局部变量无private public default protected修饰，类也如此，无权限控制符修饰//必须加final
		
		class InnerClass3{
			
			//public static void m1(){}局部内部类等同于局部变量，且不能有内部静态声明
			
			public void m6(){
				
				System.out.println(x);//局部内部类访问局部变量时，局部变量前必然有final。
			}
			
		}
		
		InnerClass3 inner = new InnerClass3();
		
		inner.m6();//直接调用OuterClass.m5()调用执行m6();真几把复杂。
	}
//=====================================================================
//															      匿名内部类

//直接写程序体会；
	
/*
 * public class Test{
 * 	
 * 	public static void t (CustomerService cs){//此处存在多态//编译期直接检测CustomerService，执行期间传入实现类
 * 
 * 		cs.logout();
 * 	}
 * 
 * 	public static void main(String[] args){
 * 		
 * 		t(new CustomerServiceImpl());  //可以传入实现类，不能直接new 接口，但可以new 实现类
 *		t(new CustomerServiceImpl(){  //匿名内部类的方式实现了接口 
 *			public void logout(){
 *				
 *				System.out.println("匿名内部类已经实现")
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
 * 			System.out.println("安全退出")
 * 		}
 * }
 * 
 * 
 * 
 * 
 */
}


