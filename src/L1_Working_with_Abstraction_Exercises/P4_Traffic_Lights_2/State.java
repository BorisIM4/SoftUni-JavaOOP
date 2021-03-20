package L1_Working_with_Abstraction_Exercises.P4_Traffic_Lights_2;

import java.util.Arrays;

public class State {
    private String[] state;

    State(String[] tokens) {
        this.setState(tokens);
    }

    private void setState(String[] state) {
        this.state = state;
    }

    private void rotateState(){
        for (int index = 0; index < state.length; index++) {
            String currentLight = this.state[index];

            switch (currentLight) {
                case "RED":
                    this.state[index] = String.valueOf(TrafficLight.GREEN);
                    break;
                case  "GREEN":
                    this.state[index] = String.valueOf(TrafficLight.YELLOW);
                    break;
                case "YELLOW":
                    this.state[index] = String.valueOf(TrafficLight.RED);
                    break;
            }
        }
    }

    public void rotateNTimes(int number) {
        for (int index = 0; index < number; index++) {
            rotateState();
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String light : state) {
            stringBuilder.append(light)
                    .append(" ");
        }
        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString().trim();
    }
}
