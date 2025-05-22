package net.synergy2.logic.bec;

import net.synergy2.base.types.SSingletonHolder;

public class BecLogic {

    protected BecLogic () {}

    private static class Singleton {
        private static final SSingletonHolder<BecLogic> INSTANCE = new SSingletonHolder<> (BecLogic.class);
    } // Singleton

    public static BecLogic get () { return Singleton.INSTANCE.get (); }
    
} // BecLogic    
