package baseball;

public class Application {
    public static void main(String[] args){
        // TODO: 프로그램 구현
        BaseballService baseballService = new BaseballService();
        BaseballNumber baseballNumber = BaseballNumber.initializeComputerNumber();
        System.out.println(baseballNumber);

    }
}
