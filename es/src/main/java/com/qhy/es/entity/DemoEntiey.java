package com.qhy.es.entity;

import java.util.concurrent.locks.LockSupport;

import lombok.Data;
/**
 * 
 * @author 12423
 *
 */
@Data
public class DemoEntiey {
	static volatile ThreadLocal<String> threadLoacl = new ThreadLocal<String>();
	private String dataId;
	
	private String username;
	
	private String userId;
	
	
	public static void main(String[] args) {
		/**
		 * 同步锁
		 */
	    synchronized (DemoEntiey.class) {
	    	
	    }
	    
	    threadLoacl.set("main ");
	    System.out.println("----->>>>" + threadLoacl.get());
	    Thread currentThread = Thread.currentThread();
		Thread  t =  new Thread(()->  {
	    	 threadLoacl.set("子线程");
	    	 System.out.println("----->>>>" + threadLoacl.get());
	    	 System.out.println("----->>>>" + threadLoacl.get());
	    	 try {
				Thread.sleep(3000L);
				LockSupport.unpark(currentThread);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    });
		   t.start();
	  LockSupport.park();
	}

}
