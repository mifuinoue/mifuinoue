package com.rhizome.example.main;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	/**
	 * 処理開始位置
	 *
	 * @param args
	 */aaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public static void main(String[] args) {
		display();	//displayメソッド呼び出し
	}
	
	public static void display (){
		System.out.println("システムを開始します");
		System.out.println(""); //改行
		
		System.out.println("1:検索 2:登録 3:更新 4:削除 0:終了");
		int value = sc.nextInt(); //入力値を代入
		while(value != 0){
			System.out.println("指定の番号を入力してください");
			System.out.println("");
			System.out.println("1:検索 2:登録 3:更新 4:削除 0:終了");
			value = sc.nextInt();
		}
		System.out.println("システムを終了します");
		
	}
}
