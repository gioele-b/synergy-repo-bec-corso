package net.synergy2.db.bec.uif.route;

import net.synergy2.db.sys.uif.route.ISynergyRoute;

public enum BecRoute implements ISynergyRoute {
    BEC_FILTER_BASE_PATH("bec-filters");

    private final String url;

    BecRoute(String type) {
        this.url = type;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return url;
    }
}
