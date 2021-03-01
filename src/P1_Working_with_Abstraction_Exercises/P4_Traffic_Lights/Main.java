package P1_Working_with_Abstraction_Exercises.P4_Traffic_Lights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String[] initialTrafficLightsState = bufferedReader.readLine().split("\\s+");
        int numebrOfUpdates = Integer.parseInt(bufferedReader.readLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String state : initialTrafficLightsState) {
            TrafficLight trafficLight = new TrafficLight(TrafficLightState.valueOf(state));
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < numebrOfUpdates; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }
}
