package racingcar;

import java.util.ArrayList;
import java.util.List;

public class WinnerCalculator {

    public List<Integer> winnerResult(List<Integer> carMoveCounts) {

        List<Integer> winners = new ArrayList<>();
        int maxMoveCount = 0;

        for (int carIndex = 0; carIndex < carMoveCounts.size(); carIndex++) {

            int carMoveCount = carMoveCounts.get(carIndex);

            if (carMoveCount > maxMoveCount) {
                winners.clear();
                maxMoveCount = carMoveCount;
                winners.add(carIndex);
            } else if (carMoveCount == maxMoveCount) {
                winners.add(carIndex);
            }
        }
        return winners;
    }
}
