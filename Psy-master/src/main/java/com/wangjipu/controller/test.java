package com.wangjipu.controller;


public class test {
	public static void main(String[] args) {
		
		long start=System.currentTimeMillis(); //获取开始时间
		int[] array={-12,-5,14,5,0,-16};
		//closestTargetValue(-10	,array);
		trailingZeros(105);
	    //要测试的程序或方法
	long end=System.currentTimeMillis(); //获取结束时间
	 
	System.out.println("程序运行时间： "+(end-start)+"ms"); 
		
	}
	 public static int aplusb(int n, int m) {
		 int target =n-m;
	        int res=0;
	        int[] money= {100,50,20,10,5,2,1};
	         for (int i = 0; i < money.length; i++) {
	        	  if (target>=money[i]){
	        		  //除数，余数
	        		  int cs =target/money[i];
	        		  int ys =target%money[i];
	        		  target-=cs*money[i];
	        		  res+=cs;
	        		  if(target==0) {
	        			 break;
	        		  }
		            } 
			}
	        System.out.println(res);
	        return res;
	 }
	 
	 public static int closestTargetValue(int target, int[] array) {
		 //获取两个数
		int num1 = 0;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				// 排序获取最大值
				if (array[i] < array[i + 1]) {
					num1 = array[i];
					array[i] = array[i + 1];
					array[i + 1] = num1;
				}
			}
		}
		int num = 0;
		while (array[num] > target) {
			num++;
		}

		if(target>0) {
			for (int i = 0; i < array.length; i++) {
				if (target > array[num] + array[num + i]) {
					num1 = array[num] + array[num + i];
					break;
				}
			}
		}else {
			num=array.length-1;
			for (int i = 0; i < array.length; i++) {
				if (target < array[num] + array[num - i]) {
					num1 = array[num] + array[num - i];
					break;
				}
			}
		}
		
		

		System.out.println(num1);
		return num1;
	}

	 //阶乘
	 public static long trailingZeros(long n) {
	        // write your code here, try to do it without arithmetic operators.
		 	/*long sum = 1;
	        for(long i=n;i>0;i--){
	            sum=sum*i;    
	        }
	        System.out.println(sum);
	        */
		 	long count =  0;
		 	for(long i=n;i>0;i--) {
		 		if(i%5==0) {
		 			count++;
		 		}
		 	}
		 	System.out.println(count);
	        return count;
	    }
}
