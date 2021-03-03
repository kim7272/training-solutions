package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    List<State> states = new ArrayList<>();


    public void readStatesFromFile(String fileName) {
        Path path = Path.of(fileName);

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] stringStates = line.split("-");
                states.add(new State(stringStates[0], stringStates[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public List<State> getStates() {
        return new ArrayList<>(states);
    }

    public String findCapitalByStateName(String stateName) {

        for (State state : states) {
            if (state.getStateName().equals(stateName)) {
                return  state.getCapital();
            }
        }
            throw new IllegalArgumentException("No state with this name!");
        }
    }

