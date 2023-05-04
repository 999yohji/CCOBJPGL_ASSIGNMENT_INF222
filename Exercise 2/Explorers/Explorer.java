package Explorers;

import Planets.Earf;
import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Jupiter;
import Planets.Neptune;
import Planets.Youranus;
import Planets.Venus;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Earf earf);

    void visit(Jupiter jupiter);

    void visit(Neptune neptune);

    void visit(Youranus youranus);

    void visit(Venus Venus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}