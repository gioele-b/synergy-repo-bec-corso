package net.synergy2.data.bec.flt;

import java.util.Arrays;
import java.util.List;
import net.synergy2.data.sys.installer.formDesign.base.IFormDesignInstaller;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.bec.flt.AngBecFltImpl.AngBecFltFields;
import net.synergy2.db.sys.uif.SysFrmDsg;
import net.synergy2.db.sys.uif.SysFrmDsgFld;
import net.synergy2.db.sys.uif.SysFrmDsgInstaller;
import net.synergy2.db.sys.uif.SysFrmDsgTab;

public class BecFltFormDesign implements IFormDesignInstaller {

    @Override
    public List<SysFrmDsgInstaller> getFormDesignList(
        IDbmColUidGetter colUidGetter,
        ISTranslator sTranslator
    ) throws Exception {
        return Arrays.asList(getBecFilterForm(colUidGetter, sTranslator));
    }

    private SysFrmDsgInstaller getBecFilterForm(
        IDbmColUidGetter colUidGetter,
        ISTranslator sTranslate
    ) throws Exception {
        var design = SysFrmDsg.newInstance()
            .setDsgCod("becFilterForm")
            .setDsgDsc("Filtro");
        design.addDsgTabLst(
            SysFrmDsgTab.create(
                "becFlt",
                sTranslate.getByCode("filtro")
            ).setDsgFldLst(
                Arrays.asList(
                    SysFrmDsgFld.buildString("becFltCod").setDbmColUid(
                        colUidGetter.getByName(
                            SAlias.AngBecFlt,
                            AngBecFltFields.BecFltCod
                        )
                    ),
                    SysFrmDsgFld.buildString("becFltDsc").setDbmColUid(
                        colUidGetter.getByName(
                            SAlias.AngBecFlt,
                            AngBecFltFields.BecFltDsc
                        )
                    ),
                    SysFrmDsgFld.buildInquiring("qryDbmTblColUid").setDbmColUid(
                        colUidGetter.getByName(
                            SAlias.AngBecFlt,
                            AngBecFltFields.QryDbmTblColUid
                        )
                    )
                )
            )
        );
        return new SysFrmDsgInstaller(design);
    }
}
