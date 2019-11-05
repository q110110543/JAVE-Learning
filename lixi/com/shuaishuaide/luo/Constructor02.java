package com.shuaishuaide.luo;

public class Constructor02 {

	public static void main(String[] args) {
                                                            
		Account act1 = new Account();                       
                                                            
		act1.setActno("11111");                             
                                                            
		System.out.println("’À∫≈ " + act1.getActno());         
		System.out.println("”‡∂Ó£∫" + act1.getBalance());      
                                                               
		Account act2 = new Account("110");                     
                                                               
		System.out.println("’À∫≈ " + act2.getActno());         
		System.out.println("”‡∂Ó£∫" + act2.getBalance());      
                                                            
		Account act3 = new Account("110", 100.1);           
                                                            
		System.out.println("’À∫≈:" + act3.getActno());      
		System.out.println("”‡∂Ó:" + act3.getBalance());    
         
	}                                                       

}
 