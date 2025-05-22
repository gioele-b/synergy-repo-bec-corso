package net.synergy2.data.bec;

import java.util.Arrays;
import java.util.List;
import net.synergy2.data.bec.flt.BecFltFormDesign;
import net.synergy2.data.sys.installer.formDesign.base.IFormDesignInstaller;

/**
 * Classe che contiene la lista delle form design nel progetto: bec
 */
public class BecFormDesignList {

    /**
     * Restituisce la lista di tutte le form design bec
     *
     * @return La lista delle form design da installare
     */
    public static List<IFormDesignInstaller> get() {
        return Arrays.asList(new BecFltFormDesign());
    }
}
