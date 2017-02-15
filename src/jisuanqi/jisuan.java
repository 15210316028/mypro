package jisuanqi;

import java.util.Scanner;

import org.apache.log4j.Logger;


public class jisuan implements jia, jian, cheng, chu {
		private double sum=0;
		
	public double getSum() {
			return sum;
		}


		public void setSum(double sum) {
			this.sum = sum;
		}

		public double chengF(double num) throws Exception {
			sum=num;
			return sum;
		}
	public double cheng(double num) throws Exception {
		
		sum=sum*num;
		return sum;
	}

	
	public double jianF(double num) throws Exception {
		
		sum=num;
		return sum;
	}
	public double jian(double num) throws Exception {
		sum=sum-num;
		return sum;
	}
	
	public double jia(double num) throws Exception {
		
		sum=sum+num;
		return sum;
	}


	
	public double chuF(double num) throws Exception {
		sum=num;
		return sum;
	}


	
	public double chu(double num) throws Exception {
		if(num!=0)
		{
			sum=sum/num;
			
		}else
		{
			throw new ArithmeticException("除数不能为零");
		}
		return sum;
		
	}
	
	public void suanfa() throws Exception
	{	Logger log=Logger.getLogger(jisuan.class);
		System.out.println("选择您要的功能(1:+\t2:-\t3:*\t4:/)");
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		switch(num)
		{
		case 1:
			try {
			while(true)
			{
				System.out.println("输入数字");
				double shu=input.nextDouble();
					jia(shu);
			}
			
			} catch (Exception e) {
				
				System.out.println(sum);
			}
			break;
		case 2:
			try {
				System.out.println("输入数字");
				double shu=input.nextDouble();
					jianF(shu);
				while(true)
				{	
					System.out.println("输入数字");
					double shu1=input.nextDouble();
						jian(shu1);
				}
				
				} catch (Exception e) {
					
					System.out.println(sum);
				}
				break;
		case 3:
			try {
				System.out.println("输入数字");
				double shu=input.nextDouble();
					chengF(shu);
				while(true)
				{	
					System.out.println("输入数字");
					double shu1=input.nextDouble();
						cheng(shu1);
				}
				
				} catch (Exception e) {
					
					System.out.println(sum);
				}
				break;
		case 4:
			try {
				System.out.println("输入数字");
				double shu=input.nextDouble();
					chuF(shu);
				while(true)
				{	
					System.out.println("输入数字");
					double shu1=input.nextDouble();
						chu(shu1);
				}
				
				} catch (ArithmeticException e) {
					log.debug("除数不能为零");
					
				}catch(Exception e)
				{
					System.out.println(sum);
				}
				break;
			
		}
	}


	
	


	
	


	
	

}
