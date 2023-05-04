package Planets;

import Explorers.Explorer;

public class Youranus implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}