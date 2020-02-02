import io.reactivex.rxjava3.core.Observable;

/** HelloRxJava 클래스 설명
 *
 * --> Hello RxJava3!! 출력해보기(RxJava를 사용한 첫 실습 코드)
 *      1. emit() 이라는 HelloRxJava 클래스의 멤버 함수 만들기
 *      이 함수는 Hello RxJava3!! 를 출력하는 기능을 담고 있음
 *      2. main함수에서 HelloRxJava 객체를 생성하고 멤버함수인 emit()함수 호출하기
 * */
public class HelloRxJava {

    public void emit(){
        Observable.just("Helllo", "RxJava3!!").subscribe(System.out::println);
    }

    public static void main(String[] args) {
        HelloRxJava helloRxJava = new HelloRxJava();
        helloRxJava.emit();
    }
}
