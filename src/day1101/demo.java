package day1101;

import java.util.Scanner;

public class demo 
{		
/*
* 显示菜单登录
*/
	Scanner I=new Scanner(System.in);
	public void showLoginMenu()
	{
	System.out.println("\n欢迎使用我行我素购物管理系统");
	System.out.println("\t1.登录系统");
	System.out.println("\t2.退出");
	System.out.println("********************************************8");
	System.out.print("请选择输入数字：");
	}
	/*
	* 显示客户信息管理菜单
	*/
	public void showCustMenu(){
	System.out.println("我行我素购物管理系统> 客户信息管理");
	System.out.println("\t1.显示所有客户信息");
	System.out.println("\t2.添加客户信息");
	System.out.println("\t3.修改客户信息");
	System.out.println("\t4.查询客户信息");
	System.out.println("********************************************8");
	System.out.println("请选择输入数字：");
	boolean con;
	do{
	con = false;	
	int no = I.nextInt();
	if(no == 1){
	System.out.print("执行显示所有客户信息");
	}else if(no == 2){
	System.out.println("执行添加客户信息");
	}else if (no == 3){
	System.out.println("执行修改客户信息");
	}else if(no == 4){
	System.out.println("查询客户信息");
	}else if (no == 0){
	showMainMenu();
	}else{
	System.out.println("您的输入有误！请重新输入！");
	con = true;
	}
	}while(con);
	}
	public void showSendGMenu(){
	System.out.println("我行我素购物管理系统> 真情回馈");
	System.out.println("\t1.幸运大放送");
	System.out.println("\t2.幸运抽奖");
	System.out.println("\t3.生日问候");
	System.out.println("\t4.退出");
	System.out.println("********************************************8");
	System.out.println("请选择输入数字：");
	boolean con;
	do{
	con = false;	
	int no = I.nextInt();
	if(no == 1){
	System.out.print("执行幸运大放送");
	}else if(no == 2){
	System.out.println("执行幸运抽奖");
	}else if (no == 3){
	System.out.println("执行执行生日问候");
	}else if (no == 0){
	showMainMenu();
	}else{
	System.out.println("您的输入有误！请重新输入！");
	con = true;
	}
	}while(con);
	}
	/*
	* 显示主菜单
	*/
	public void showMainMenu(){
	System.out.println("我行我素购物管理系统主菜单");
	System.out.println("\t1. 客户信息管理");
	System.out.println("\t2. 真情回馈");
	System.out.println("*************************************************");
	System.out.println("请选择输入数字或按0返回上一级菜单：");
	boolean con;
	do{
	con = false;	
	int no = I.nextInt();
	if(no == 1){
	showCustMenu();
	}else if (no == 2){
	showSendGMenu();
	}else if (no == 0){
	showLoginMenu();
	}else{
	System.out.print("输入有误，请重新输入数字:");
	con = true;
	}
	}while(con);
	}
	/*
	* 显示真情回馈菜单
	*/
	}
	
