package com.rhizome.example.data;

public class EmployeeData extends BaseData {
	/** 社員ID */
	private String idEmployee;
	/** 社員名 */
	private String nmEmployee;
	/** 社員名カナ */
	private String knEmployee;
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	private String password;
	/** 役職ID */
	private String idDepartment;

	/**
	 * @return 社員ID
	 */
	public String getIdEmployee() {
		return idEmployee;
	}

	/**
	 * @param idEmployee 社員ID
	 */
	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}

	/**
	 * @return 社員名
	 */
	public String getNmEmployee() {
		return nmEmployee;
	}

	/**
	 * @param nmEmployee 社員名
	 */
	public void setNmEmployee(String nmEmployee) {
		this.nmEmployee = nmEmployee;
	}

	/**
	 * @return 社員名カナ
	 */
	public String getKnEmployee() {
		return knEmployee;
	}

	/**
	 * @param knEmployee 社員名カナ
	 */
	public void setKnEmployee(String knEmployee) {
		this.knEmployee = knEmployee;
	}

	/**
	 * @return メールアドレス
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress メールアドレス
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return 役職ID
	 */
	public String getIdDepartment() {
		return idDepartment;
	}

	/**
	 * @param idDepartment 役職ID
	 */
	public void setIdDepartment(String idDepartment) {
		this.idDepartment = idDepartment;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return getIdEmployee() + "\t" + getNmEmployee() + "\t" + getKnEmployee() + "\t"
				+ getMailAddress() + "\t" + getPassword() + "\t" + getIdDepartment();

	}

	@Override
	public String toCSV() {
		return getIdEmployee() + "," + getNmEmployee() + "," + getKnEmployee() + ","
				+ getMailAddress() + "," + getPassword() + "," + getIdDepartment();
	}

	@Override
	public String getPrimaryKeyValue() {
		return idEmployee;

	}

}
