package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> registeredSatellites = new ArrayList<>();
    private String registerIdent;

    public void registerSatellite(Satellite satellite){
        if (satellite == null){
            throw new NullPointerException("Parameter must not be null!");
        }
        registeredSatellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        for (Satellite s : registeredSatellites){
            if (s.getRegisterIdent().equals(registerIdent)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
    }

    public String toString(){
        return registeredSatellites.toString();
    }
}
