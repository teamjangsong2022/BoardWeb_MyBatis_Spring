package com.springbook.biz.common;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

public class DBConnectionTest {
	@Autowired
	private static BasicDataSource connect ; 

	public static void main(String[] args) {
		
		if (connect == null) {
			System.out.println("DB ���� ����");
		}else {
			System.out.println("DB ���� ����");
		}

	}

}
