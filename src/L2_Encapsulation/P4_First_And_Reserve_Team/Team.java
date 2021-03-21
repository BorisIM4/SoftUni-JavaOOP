package L2_Encapsulation.P4_First_And_Reserve_Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String teamName;
    private List<Person> firstTeam;
    private List<Person> secondTeam;

    public Team(String name) {
        this.setName(name);
        this.firstTeam = new ArrayList<>();
        this.secondTeam = new ArrayList<>();
    }

    private void setName(String name) {
        this.teamName = name;
    }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Person person) {
        int currentPersonAge = person.getAge();
        if (currentPersonAge < 40) {
            firstTeam.add(person);
        } else {
            secondTeam.add(person);
        }
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getSecondTeam() {
        return Collections.unmodifiableList(this.secondTeam);
    }
}
