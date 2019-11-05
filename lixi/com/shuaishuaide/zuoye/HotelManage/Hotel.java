package com.shuaishuaide.zuoye.HotelManage;

public class Hotel {//是在hotel处赋值的，Room这一类适应所有的Hotel类
	
	Room[][] rooms;

	public Hotel() {
		
		rooms = new Room[5][5];
		
		for(int i=0;i<rooms.length;i++){
			for(int j = 0; j<rooms[i].length;j++){
				
				if(i==0 || i==1)
					rooms[i][j] = new Room((i+1)*100+j+1+"","单人间",false);
				
				if(i==2 || i==3)
					rooms[i][j] = new Room((i+1)*100+j+1+"","双人间",false);
				
				if(i==4)
					rooms[i][j] = new Room((i+1)*100+j+1+"","豪华间",false);
			}
		}
	}
	public void print(){
		
		for(int i = 0;i<rooms.length;i++){
			
			for(int j =0; j<rooms[i].length;j++){
				System.out.print(rooms[i][j] + "  ");
			}
			
			System.out.println();
		}
	}
	
	public void order(String no){
		
		for(int i=0;i<rooms.length;i++){
			for(int j = 0; j<rooms[i].length;j++){
			
				if(rooms[i][j].getNo().equals(no)){
					
					rooms[i][j].setUse(true);
					return;
					
				}				
			}
		}
	}
	
}
