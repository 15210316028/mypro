package day1110;

import java.util.Scanner;

public class Text {
	public static void main(String[] zhu) 
	{
		Scanner input=new Scanner(System.in);
		int num;	
		System.out.print("ѡ�������ʽ:");
		String style=input.next();
		ComputerFactory computer=new ComputerFactory();
		Users u=new Users();
		u.brand();
		CPUfactory cf = new CPUfactory();
		System.out.print("ѡ��CPU�ͺ�:��1 A 2 B��");
		num = input.nextInt();
		String cpuName = cf.brandCPU(num);
		EMSfactory ef = new EMSfactory();
		System.out.print("ѡ���ڴ��ͺ�:��1 A 2 B��");
		num = input.nextInt();
		String nc = ef.brandEMS(num);
		HardDiskfactory hf = new HardDiskfactory();
		System.out.print("ѡ��Ӳ���ͺ�:��1 A 2 B��");
		num = input.nextInt();
		String yp = hf.brandHardDisk(num);
		Computer c=computer.computer(style);
		c.setCpuName(cpuName);		
		c.setEmsName(nc);
		c.setHarddiskName(yp);			
		c.computer();
	}
}
