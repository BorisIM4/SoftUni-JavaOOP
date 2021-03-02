package L1_Working_with_Abstraction_Exercises.P4_Traffic_Lights;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight(TrafficLightState initialState) {
        this.state = initialState;
    }

    public void update() {
        //Update state
        switch (this.state){
            case RED:
                this.state = TrafficLightState.GREEN;
                break;
            case GREEN:
                this.state = TrafficLightState.YELLOW;
                break;
            case YELLOW:
                this.state = TrafficLightState.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return this.state.toString();
    }
}
