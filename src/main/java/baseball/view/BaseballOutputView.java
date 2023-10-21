package baseball.view;

public class BaseballOutputView {

    public static void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다");
    }

    public static void printBallAndStrikeCount(int ballCount, int strikeCount) {
        if (ballCount > 0) {
            System.out.print(ballCount + "볼");
            if (strikeCount > 0) {
                System.out.print(" ");
            }
        }
        if (strikeCount > 0) {
            System.out.print(strikeCount + "스트라이크");
        }
        if (ballCount == 0 && strikeCount == 0) {
            System.out.print("낫싱");
        }
        System.out.println();
    }

    public static void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}