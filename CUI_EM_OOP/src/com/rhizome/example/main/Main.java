package com.rhizome.example.main;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	/**
	 * �����J�n�ʒu
	 *
	 * @param args
	 */aaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public static void main(String[] args) {
		display();	//display���\�b�h�Ăяo��
	}
	
	public static void display (){
		System.out.println("�V�X�e�����J�n���܂�");
		System.out.println(""); //���s
		
		System.out.println("1:���� 2:�o�^ 3:�X�V 4:�폜 0:�I��");
		int value = sc.nextInt(); //���͒l����
		while(value != 0){
			System.out.println("�w��̔ԍ�����͂��Ă�������");
			System.out.println("");
			System.out.println("1:���� 2:�o�^ 3:�X�V 4:�폜 0:�I��");
			value = sc.nextInt();
		}
		System.out.println("�V�X�e�����I�����܂�");
		
	}
}
