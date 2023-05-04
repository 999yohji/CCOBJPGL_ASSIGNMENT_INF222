package Planets;

import Explorers.Explorer;

public class Earf implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
