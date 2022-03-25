package com.application.bussiness.test.controller;

public class Load {
	  static boolean aaa =true;
		
		public static void main(String[] args){
			try {
			Thread t = new Thread(() -> {
				while (aaa) {
					System.out.println("++++++++>");
				}
			});
				t.start();
				Thread.sleep(1000);
				aaa =false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
