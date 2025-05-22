package net.synergy2.logic.bec.vrt;

import net.synergy2.base.types.SSingletonHolder;

public class BecVrtLogic {

    protected BecVrtLogic () {}

    private static class Singleton {
        private static final SSingletonHolder<BecVrtLogic> INSTANCE = new SSingletonHolder<> (BecVrtLogic.class);
    } // Singleton

    public static BecVrtLogic get () { return Singleton.INSTANCE.get (); }
    
} // BecVrtLogic    
