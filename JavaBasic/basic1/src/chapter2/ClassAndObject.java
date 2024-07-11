package chapter2;

// 클래스 : 공통된 속성(필드)과 기능(메서드)을 정의해둔 것
// [접근제어자] class 클래스명 { 속성, 기능 }
class ExampleClass1 {
	// 속성 : 클래스가 가질 수 있는 정보나 상태
	//      일반적으로 변수로 표현
	int attribute1;
	double attribute2;
	
	// 기능 : 클래스가 가질 수 있는 행동이나 작업 (메서드)
	// [접근제어자] 반환타입 메서드명 (매개변수타입 매개변수명[, ...])
	// {메서드 기능 구현}
	int method1 (int arg1) {
		// 기능 구현
		// 반환타입이 void가 아니면 반드시 return으로 결과값을 반환해야 함.
		return 0;
	}
}

// 스마트폰 
// = 속성 =
// - 제조사 String
// - 제조일자 String 
// - 모델명 String
// - 전화번호 String
// - 어플 리스트 String[]
// - 전원상태 boolean
// = 기능 =
// - 스마트폰 정보 보기 
// - 전화 걸기
// - 어플 설치
// - 문자 보내기
// - 전원 누르기

class SmartPhone {
	
	// 속성 정의
	String manufacturer;
	String manufactureDate;
	String modelName;
	String telNumber;
	String[] appList = new String[0]; // 어플 리스트 배열 0으로 초기화
	boolean powerStatus;
	
	// 기능 구현
	// 스마트폰 정보 보기
	void printInformation () {
		System.out.println("===== 정보 =====");
		System.out.println("제조사 : " + manufacturer);
		System.out.println("제조날짜 : " + manufactureDate);
		System.out.println("모델명 : " + modelName);
		System.out.println("전화번호 : " + telNumber);
	}
	
	// 전화 걸기
	void call (String toTelNumber) {
		System.out.println(telNumber + "가" + toTelNumber + "로 전화를 겁니다.");
	}
	
	// 어플 설치
	void appInstall (String appName) {
		// 원래 배열에 +1로 늘리기
		String[] newAppList = new String[appList.length + 1];
		
		// 앱리스트 길이만큼 돌면서 앱리스트 인덱스를 새로운 앱리스트 인덱스에 넣어줌.
		for (int index = 0; index < appList.length; index++) {
			newAppList[index] = appList[index];
		}
		
		// 인자로 받을 앱이름을 새리스트로 추가
		newAppList[newAppList.length - 1] = appName;
		// 새 앱리스트를 기존 앱리스트에 할당
		appList = newAppList;
	}
	
	// 문자 보내기
	void sendMessage (String toTelNumber, String message) {
		System.out.println(telNumber + "가" + toTelNumber + "에게" + message + "를 전송했습니다.");
	}
	
	// 전원 누르기
	void pressPowerButton () {
		powerStatus = !powerStatus;
	}
	
}

public class ClassAndObject {

	public static void main(String[] args) {
		
	}

}









