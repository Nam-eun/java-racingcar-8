package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputRace {

    public String[] inputName() {

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String name = readLine();
        String[] carNames = name.split(",");

        validateCarName(carNames);

        return carNames;
    }

    public int inputCount() {

        System.out.println("시도할 횟수는 몇 회인가요?");
        String tryCount = readLine();

        validateTryCount(tryCount);

        return Integer.parseInt(tryCount);
    }

    private void validateCarName(String[] carNames) {

        for (String carName : carNames) {
            if (carName.isBlank()) {
                throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
            }

            if (carName.length() > 5) {
                throw new IllegalArgumentException("5글자 이하로 입력해주세요.");
            }
        }

    }

    private void validateTryCount(String tryCount) {

        try {
            Integer.parseInt(tryCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("유효하지 않은 시도 횟수입니다.");
        }
    }
}
