package chapter3;

import java.util.Random;
import java.util.UUID;

public class Package3 {

	public static void main(String[] args) {
		
		// Random 클래스 : 난수를 생성하는 클래스
		Random random = new Random();
		System.out.println(random.nextInt());
		// 범위 제약
		System.out.println(random.nextInt(3)); // 0 ~ 2까지의 난수 생성, 넣은 숫자만큼의 난수를 생성
		System.out.println(random.nextInt(3) + 1); // 1 ~ 3까지의 난수 생성
		
		// SEED 지정
		random = new Random(1); // 뽑을 난수 갯수
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(45));
		
		// UUID : 고유한 식별자를 만들기 위해 사용하는 랜덤한 문자열
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid); // 3c36f9ad-acbe-4f50-be92-483a5f81ffa5 이런 형태임

	}

}
