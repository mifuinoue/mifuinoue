package com.rhizome.example.data;

public abstract class BaseData {
	/**
	 * インスタンスのフィールドの値をタブ区切りで連結して返却
	 * @return タブ区切り文字列
	 */
	public abstract String toString();

	/**
	 * インスタンスのフィールドの値をカンマ区切りで連結して返却
	 * @return CSV形式文字列
	 */
	public abstract String toCSV();

	/**
	 * ファイルの主キーの値を取得
	 * @return 主キーの値
	 */
	public abstract String getPrimaryKeyValue();

}
