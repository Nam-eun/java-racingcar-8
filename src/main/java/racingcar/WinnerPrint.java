package racingcar;

import java.util.ArrayList;
import java.util.List;

public class WinnerPrint {

    public void winnerResult(List<Integer> winnersIndex, String[] carNames) {

        List<String> winners = new ArrayList<>();

        for (int winnerIndex : winnersIndex) {
            winners.add(carNames[winnerIndex]);
        }

        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
