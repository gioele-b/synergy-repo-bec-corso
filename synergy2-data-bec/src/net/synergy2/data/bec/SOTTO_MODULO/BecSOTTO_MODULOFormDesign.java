package net.synergy2.data.bec.SOTTO_MODULO;

import java.util.Arrays;
import java.util.List;
import net.synergy2.data.sys.installer.formDesign.base.IFormDesignInstaller;
import net.synergy2.db.sys.uif.SysFrmDsg;
import net.synergy2.db.sys.uif.SysFrmDsgFld;
import net.synergy2.db.sys.uif.SysFrmDsgInstaller;
import net.synergy2.db.sys.uif.SysFrmDsgTab;

public class BecSOTTO_MODULOFormDesign implements IFormDesignInstaller {

    @Override
    public List<SysFrmDsgInstaller> getFormDesignList(
        IDbmColUidGetter colUidGetter,
        ISTranslator sTranslator
    ) throws Exception {
        return Arrays.asList();
    } // getFormDesignList
}
