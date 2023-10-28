package racingcar.model;

import racingcar.util.RandomUtil;

public class Car {
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int REFERENCE_VALUE_MOVING_FORWARD = 4;

    private final String name;
    private Integer forwards;

    public Car(String name) {
        this.name = name;
        this.forwards = 0;
    }

    public void moveForward() {
        int randomNumber = RandomUtil.createRandomNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        if (randomNumber >= REFERENCE_VALUE_MOVING_FORWARD) {
            this.forwards++;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getForwards() {
        return this.forwards;
    }
}
