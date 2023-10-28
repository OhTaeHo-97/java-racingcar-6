package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.constant.ErrorMessage;

public class InputView {
    private final String DELIMITER = ",";

    public List<String> getCarNames() {
        try {
            String carNamesRawData = Console.readLine();

            validateNull(carNamesRawData);

            String[] splitCarNamesByComma = carNamesRawData.split(DELIMITER);
            return carNamesArrToList(splitCarNamesByComma);
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_INPUT_EXCEPTION.getMessage());
        }
    }

    private void validateNull(String data) {
        if (data == null) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_INPUT_EXCEPTION.getMessage());
        }
    }

    private List<String> carNamesArrToList(String[] splitCarNamesByComma) {
        List<String> carNames = new ArrayList<>();
        for (int idx = 0; idx < splitCarNamesByComma.length; idx++) {
            validateCarNameLength(splitCarNamesByComma[idx]);
            carNames.add(splitCarNamesByComma[idx]);
        }

        return carNames;
    }

    private void validateCarNameLength(String carName) {
        if (carName.length() > 5 || carName.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_LENGTH_EXCEPTION.getMessage());
        }
    }
}
