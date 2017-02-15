package day1110;

import java.util.Scanner;

public class Text {
	public static void main(String[] zhu) 
	{
		Scanner input=new Scanner(System.in);
		int num;	
		System.out.print("选择电脑样式:");
		String style=input.next();
		ComputerFactory computer=new ComputerFactory();
		Users u=new Users();
		u.brand();
		CPUfactory cf = new CPUfactory();
		System.out.print("选择CPU型号:（1 A 2 B）");
		num = input.nextInt();
		String cpuName = cf.brandCPU(num);
		EMSfactory ef = new EMSfactory();
		System.out.print("选择内存型号:（1 A 2 B）");
		num = input.nextInt();
		String nc = ef.brandEMS(num);
		HardDiskfactory hf = new HardDiskfactory();
		System.out.print("选择硬盘型号:（1 A 2 B）");
		num = input.nextInt();
		String yp = hf.brandHardDisk(num);
		Computer c=computer.computer(style);
		c.setCpuName(cpuName);		
		c.setEmsName(nc);
		c.setHarddiskName(yp);			
		c.computer();
	}
}
