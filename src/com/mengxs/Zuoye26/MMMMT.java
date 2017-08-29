package com.mengxs.Zuoye26;

public class MMMMT {

	  public static void main(String[] args) {
		  
		          final Print business = new Print();
		 
		          new Thread(new Runnable() {
		              public void run() {
		                  for(int i=1;i<53;i+=2) {
		                      business.print_A(i);
		                  }
		              }
		          }).start();
		 
		          new Thread(new Runnable() {
		              public void run() {
		                  for(char i='A';i<='Z';i+=1) {
		                      business.print_B(i);
		                  }
		              }
		          }).start();
		 
		      }
		  }
		  class Print {
		 
		      private boolean flag = true;
		 
		      public synchronized void print_A (int a) {
		          while(!flag) {
		              try {
		                  this.wait();
		              } catch (InterruptedException e) {
		                  // TODO Auto-generated catch block
		                  e.printStackTrace();
		              }
		          }
		          System.out.println(a);
		          System.out.println(a+1);
		          flag = false;
		          this.notify();
		      }
		 
		      public synchronized void print_B (char a) {
		          while(flag) {
		              try {
		                  this.wait();
		              } catch (InterruptedException e) {
		                  // TODO Auto-generated catch block
		                  e.printStackTrace();
		              }
		          }
		         
		          System.out.println(a);
		          flag = true;
		          this.notify();
		      }
		  
		  }

