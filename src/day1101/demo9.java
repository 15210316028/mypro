package day1101;

import java.util.Scanner;

public class demo9 {
	public static void main(String[] args) {
	boolean con=true;
	Scanner I = new Scanner(System.in);
	do{
	/*
	* ��ʾ��¼�˵�
	*/
	demo menu = new demo ();
	menu.showLoginMenu();
	int choice = I.nextInt();
	boolean b = true;
	while(b){
	String name = "liu";
	String pwd = "0000";
	System.out.println("�������û�����");
	String name1 = I.next();
	System.out.println("���������룺");
	String pwd1 = I.next();
	if(name.equals(name1)&&pwd.equals(pwd1)){
	System.out.println("��¼�ɹ���"+name);
	b = false;
	}else{
	System.out.println("��û��Ȩ�޽���ϵͳ�������µ�¼��");
	}
	}
	switch(choice){
	case 1:
	menu.showMainMenu();
	break;
	case 2:
	System.out.print("лл����ʹ�ã�");
	con = false;
	break;
	}
	}while(con);
	}
	}
