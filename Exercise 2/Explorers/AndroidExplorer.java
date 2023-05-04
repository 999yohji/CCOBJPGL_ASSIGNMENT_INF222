package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("ADR-166 Android scouting for information. Exploration of Mercury commences.");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("ADR-166 Android scouting for information. Exploration of Mars commences.");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("ADR-166 Android scouting for information. Exploration of Saturn commences.");
    }

    @Override
    public void visit(Earf earf) {
        System.out.println("ADR-166 Android scouting for information. Exploration of Earf commences.");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("ADR-166 Android scouting for information. Exploration of Jupiter commences.");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("ADR-166 Android scouting for information. Exploration of Neptune commences.");
    }

    @Override
    public void visit(Youranus youranus) {
        System.out.println("ADR-166 Android scouting for information. Exploration of Youranus (lol) commences.");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("ADR-166 Android scouting for information. Exploration of Venus commences.");
    }
}