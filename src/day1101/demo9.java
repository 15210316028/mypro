package day1101;

import java.util.Scanner;

public class demo9 {
	public static void main(String[] args) {
	boolean con=true;
	Scanner I = new Scanner(System.in);
	do{
	/*
	* 显示登录菜单
	*/
	demo menu = new demo ();
	menu.showLoginMenu();
	int choice = I.nextInt();
	boolean b = true;
	while(b){
	String name = "liu";
	String pwd = "0000";
	System.out.println("请输入用户名：");
	String name1 = I.next();
	System.out.println("请输入密码：");
	String pwd1 = I.next();
	if(name.equals(name1)&&pwd.equals(pwd1)){
	System.out.println("登录成功："+name);
	b = false;
	}else{
	System.out.println("您没有权限进入系统，请重新登录！");
	}
	}
	switch(choice){
	case 1:
	menu.showMainMenu();
	break;
	case 2:
	System.out.print("谢谢您的使用！");
	con = false;
	break;
	}
	}while(con);
	}
	}
