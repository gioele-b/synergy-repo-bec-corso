package net.synergy2.db.bec;

import net.synergy2.db.bec.abstracts._DBecVrsInf;

public class BecVrsInfDao extends _DBecVrsInf {
    protected BecVrsInfDao () { super (); }
    public static BecVrsInfDao get () { return (BecVrsInfDao) _DBecVrsInf.get (); } // get
} // BecVrsInfDao
