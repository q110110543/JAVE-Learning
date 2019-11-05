package com.shuaishuaide.zuoye.HotelManage;

public class Hotel {//����hotel����ֵ�ģ�Room��һ����Ӧ���е�Hotel��
	
	Room[][] rooms;

	public Hotel() {
		
		rooms = new Room[5][5];
		
		for(int i=0;i<rooms.length;i++){
			for(int j = 0; j<rooms[i].length;j++){
				
				if(i==0 || i==1)
					rooms[i][j] = new Room((i+1)*100+j+1+"","���˼�",false);
				
				if(i==2 || i==3)
					rooms[i][j] = new Room((i+1)*100+j+1+"","˫�˼�",false);
				
				if(i==4)
					rooms[i][j] = new Room((i+1)*100+j+1+"","������",false);
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
