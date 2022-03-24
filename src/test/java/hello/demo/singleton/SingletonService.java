package hello.demo.singleton;

public class SingletonService {

    //클래스 레벨에서 자기 자신인스터스 하나 생성
    private static final SingletonService instance = new SingletonService();

    // public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회
    public static SingletonService getInstance(){
        return instance;
    }

    // 생성자를 private으로 선언하여 외부에서 new를 통해 생성하지 못하게 막음
    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 로직 호출");
    }


}
