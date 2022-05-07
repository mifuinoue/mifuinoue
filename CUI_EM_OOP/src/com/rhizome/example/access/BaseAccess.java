package com.rhizome.example.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.rhizome.example.data.BaseData;

public abstract class BaseAccess {

	/** 対象ファイル */
	File targetFile;

	/**
	 * 引数のファイルパスでファイルオブジェクトを生成して、
	 * 対象ファイルフィールドを初期化します
	 * @param filePath ファイルパス（例："file/aaa.csv" 相対パス指定）
	 */
	protected BaseAccess(String filePath) {
		this.targetFile = new File(filePath);
	}

	/**
	 * 対象ファイルの中を全件読み込んで、
	 * Listの形式で返却します
	 * @return 読み込み結果リスト（要素(String)の内容は対象ファイルの1行ごとの文字列）
	 * @throws FileNotFoundException 対象ファイルが見つからない場合
	 */
	protected List<String> readData() throws FileNotFoundException {
		List<String> lineList = new ArrayList<>();
		try (Scanner scanner = new Scanner(this.targetFile)) {
			while (scanner.hasNext()) {
				String lineData = scanner.nextLine();
				lineList.add(lineData);
			}
		}
		return lineList;
	}

	/**
	 * 対象ファイルにBaseDataの中身のCSV表現を追記します
	 * @param data 追加データ
	 * @throws IOException 対象ファイルが開けない場合や書き込めない場合
	 */
	protected void addData(BaseData data) throws IOException {
		//ファイル追記処理
		try (FileWriter fw = new FileWriter(this.targetFile, true);
				BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write(data.toCSV());
			bw.newLine();
			bw.flush();
		}
	}

	/**
	 * 対象ファイルの内容を更新対象リストの内容に上書きします
	 * @param list 更新対象リスト
	 * @throws IOException 対象ファイルが開けない場合や書き込めない場合
	 */
	protected void updateData(List<BaseData> list) throws IOException {
		//ファイル上書き処理
		try (FileWriter fw = new FileWriter(this.targetFile, false);
				BufferedWriter bw = new BufferedWriter(fw)) {
			for (BaseData data : list) {
				bw.write(data.toCSV());
				bw.newLine();
			}
			bw.flush();

		}

	}

	/**
	 * ファイルの情報を全件取得する
	 * 利用メソッド：readData()
	 * @return 検索結果
	 * @throws FileNotFoundException
	 */
	public abstract List<BaseData> selectAll() throws FileNotFoundException;

	/**
	 * ファイルの主キーが指定されたkeyに合致する情報を取得する
	 * 利用メソッド：readData()
	 * @param key 検索対象のキー
	 * @return 検索結果
	 * @throws FileNotFoundException
	 */
	public abstract List<BaseData> selectById(String key) throws FileNotFoundException;

	/**
	 * ファイルに指定データを追加する
	 * 利用メソッド：addData()
	 * @param data 追加対象データ
	 * @throws IOException
	 */
	public abstract void insert(BaseData data) throws IOException;

	/**
	 * ファイルの指定データと主キーが一致する行を更新する
	 * 利用メソッド：updateData()
	 * @param data 更新対象データ
	 * @throws IOException
	 */
	public abstract void update(BaseData data) throws IOException;

	/**
	 * ファイルから主キーが指定されたkeyに合致する行を削除する
	 * 利用メソッド：updateData()
	 * @param key 削除対象のキー
	 * @throws IOException
	 */
	public abstract void delete(String key) throws IOException;
}
