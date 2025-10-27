package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        var inputRace = new InputRace();
        var carMoveGenerator = new CarMoveGenerator();

        String[] carName = inputRace.inputName();
        int count = inputRace.inputCount();

        List<Integer> move = carMoveGenerator.startGame(carName, count);


    }
}
