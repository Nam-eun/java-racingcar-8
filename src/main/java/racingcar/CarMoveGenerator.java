package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class CarMoveGenerator {

    public List<Integer> startGame(String[] carName, int tryCount) {

        int carCount = carName.length;
        List<Integer> carMoveCounts = new ArrayList<>(carCount);

        System.out.println("실행 결과");

        for (int carIndex = 0; carIndex < carCount; carIndex++) {
            carMoveCounts.add(0);
        }

        for (int round = 0; round < tryCount; round++) {
            moveCars(carMoveCounts, carCount);
            printRoundResult(carName, carMoveCounts, carCount);
            System.out.println();
        }

        return carMoveCounts;
    }

    private void moveCars(List<Integer> carMoveCounts, int carCount) {
        for (int carIndex = 0; carIndex < carCount; carIndex++) {
            if (canMove()) {
                int updatedMoveCount = carMoveCounts.get(carIndex) + 1;
                carMoveCounts.set(carIndex, updatedMoveCount);
            }
        }
    }

    private boolean canMove() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        return randomNumber >= 4;
    }

    private void printRoundResult(String[] carName, List<Integer> carMoveCounts, int carCount) {
        for (int carIndex = 0; carIndex < carCount; carIndex++) {
            System.out.println(carName[carIndex] + " : " + "-".repeat(carMoveCounts.get(carIndex)));
        }
    }
}
