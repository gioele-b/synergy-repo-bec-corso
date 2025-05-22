package net.synergy2.data.bec;

import net.synergy2.data.sys.installer.formDesign.base.IFormDesignInstaller.IDbmColUidGetter;
import net.synergy2.data.sys.installer.formDesign.base.IFormDesignInstaller.ISTranslator;
import net.synergy2.db.sys.uif.SysFrmDsg;

/**
 * Classe che contiene la lista delle form design modificate da iniettare
 */
public class BecFormDesignInjection {

    public void injectFormDesign(
        SysFrmDsg formDesign,
        IDbmColUidGetter colUidGetter,
        ISTranslator sTranslate
    ) throws Exception {
        switch (formDesign.getDsgCod()) {
            default:
                return;
        } // switch - case
    } // injectFormDesign
}
