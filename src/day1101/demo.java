package day1101;

import java.util.Scanner;

public class demo 
{		
/*
* ��ʾ�˵���¼
*/
	Scanner I=new Scanner(System.in);
	public void showLoginMenu()
	{
	System.out.println("\n��ӭʹ���������ع������ϵͳ");
	System.out.println("\t1.��¼ϵͳ");
	System.out.println("\t2.�˳�");
	System.out.println("********************************************8");
	System.out.print("��ѡ���������֣�");
	}
	/*
	* ��ʾ�ͻ���Ϣ����˵�
	*/
	public void showCustMenu(){
	System.out.println("�������ع������ϵͳ> �ͻ���Ϣ����");
	System.out.println("\t1.��ʾ���пͻ���Ϣ");
	System.out.println("\t2.��ӿͻ���Ϣ");
	System.out.println("\t3.�޸Ŀͻ���Ϣ");
	System.out.println("\t4.��ѯ�ͻ���Ϣ");
	System.out.println("********************************************8");
	System.out.println("��ѡ���������֣�");
	boolean con;
	do{
	con = false;	
	int no = I.nextInt();
	if(no == 1){
	System.out.print("ִ����ʾ���пͻ���Ϣ");
	}else if(no == 2){
	System.out.println("ִ����ӿͻ���Ϣ");
	}else if (no == 3){
	System.out.println("ִ���޸Ŀͻ���Ϣ");
	}else if(no == 4){
	System.out.println("��ѯ�ͻ���Ϣ");
	}else if (no == 0){
	showMainMenu();
	}else{
	System.out.println("���������������������룡");
	con = true;
	}
	}while(con);
	}
	public void showSendGMenu(){
	System.out.println("�������ع������ϵͳ> �������");
	System.out.println("\t1.���˴����");
	System.out.println("\t2.���˳齱");
	System.out.println("\t3.�����ʺ�");
	System.out.println("\t4.�˳�");
	System.out.println("********************************************8");
	System.out.println("��ѡ���������֣�");
	boolean con;
	do{
	con = false;	
	int no = I.nextInt();
	if(no == 1){
	System.out.print("ִ�����˴����");
	}else if(no == 2){
	System.out.println("ִ�����˳齱");
	}else if (no == 3){
	System.out.println("ִ��ִ�������ʺ�");
	}else if (no == 0){
	showMainMenu();
	}else{
	System.out.println("���������������������룡");
	con = true;
	}
	}while(con);
	}
	/*
	* ��ʾ���˵�
	*/
	public void showMainMenu(){
	System.out.println("�������ع������ϵͳ���˵�");
	System.out.println("\t1. �ͻ���Ϣ����");
	System.out.println("\t2. �������");
	System.out.println("*************************************************");
	System.out.println("��ѡ���������ֻ�0������һ���˵���");
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
	System.out.print("����������������������:");
	con = true;
	}
	}while(con);
	}
	/*
	* ��ʾ��������˵�
	*/
	}
	
