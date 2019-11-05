package com.shuaishuaide.Thread.DingShiQi;

import java.util.*;
import java.text.*;

public class logTimerTask extends TimerTask{
	public void run(){
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
}
