package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "Hello Java !!!";
		// 지정을 하게될 경우 지정된 기준으로 공백을 토큰한다.
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		// 아무것도 지정하지 않으면 공백의 기준으로 토큰을 지정한다.
		System.out.println("토큰수 : " + cnt);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// 상당히 유용하게 쓸때가 있다.
		str = "TO|김의연|안녕하세요";
		StringTokenizer st2 = new StringTokenizer(str, "|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("기능 : " + protocol);
		System.out.println("누구에게 : " + to);
		System.out.println("보내는 메세지 : " + msg);

		System.out.println(UUID.randomUUID());

	}
}
