package api.collection;

import java.util.ArrayList;
import java.util.List;

import api.object.Product;

/**
 * 객체를 요소(Element)로 저장하는 컬렉션(Collection)
 * 
 * @author Byun
 *
 */
public class ListTest {

	public static void main(String[] args) {
		/*----------------------------------------------
		ArrayList 배열의 단점을 개선한 리스트 구현 클래스
		
		1. 처음 생성할 때 크기가 고정되는 것.
		2. 데이터 추가시 동적으로 크기 변경이 불가능 한 것
		3. 데이터 삭제시 빈 인덱스 처리가 안되는 것.
		
		등을 개선
		-------------------------------------------------
		*/

		// 1. 선언
		List list;

		// 2. 초기화
		list = new ArrayList();

		// 3. 사용
		// (1) 리스트에 아이템 추가
		System.out.println(list.add("1st Item"));
		System.out.println(list.add(2)); // auto-boxing
		System.out.println(list.add(new Double(3.0)));
		System.out.println(list.add(new Boolean(true)));
		System.out.println(list.add(false)); // auto-boxing
		/*-----------------------------------------------------------------
		auto-boxing : 컬렉션에 기본형 데이터 추가시 자동으로 객체형 데이터로 포장(Wrapper클래스 작동)되는 기능
				     1.5 버전부터 지원
		-----------------------------------------------------------------------------------
		auto-unboxing : 컬렉션에서 포장된 기본형 데이터를 뽑아냈을 떄 형변환 없이 바로 기본형 변수에 저장하는 기능
						1.5 버전부터 지원
		*/
		int two = (Integer) list.get(1);
		// 사용자 정의 타입 객체도 추가
		Product product = new Product("P001", "MS-아크 터치 마우스", 51800, 5);
		System.out.println(list.add(product));

		// 동일한 데이터 추가 시도
		System.out.println("=====동일한 데이터 추가 시도=====");
		System.out.println(list.add("1st Item"));

		// (2) list 내용 출력
		System.out.println("====list의 내용 직접 출력=====");
		System.out.println(list);

		System.out.println("=====list를 foreach로 출력=====");
		for (Object obj : list) {
			System.out.println(obj);
		}

		System.out.println("====index를 사용하는 for로 출력====");
		for (int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}

		// (3) 리스트에 들어있는 객체가 Product 타입이면 입고 기능을 쓰고 싶다.
		for (Object obj : list) {
			if (obj instanceof Product) {
				Product prod = (Product) obj;
				prod.buy(100);

				prod.print();
			}
		}
	}

}
