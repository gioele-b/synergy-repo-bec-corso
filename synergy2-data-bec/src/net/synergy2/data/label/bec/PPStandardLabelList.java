package net.synergy2.data.label.bec;

import java.util.ArrayList;
import java.util.List;
import net.synergy2.data.base.ILabelInstallConfig;
import net.synergy2.data.base.ILabelList;
import net.synergy2.data.base.LabelInstallerUtil;
import net.synergy2.db.sys.tra.SysTraLbl;

public class PPStandardLabelList implements ILabelList {

    @Override
    public List<SysTraLbl> get(final ILabelInstallConfig cfg) throws Exception {
        var u = new LabelInstallerUtil(new ArrayList<>(), cfg);

        // u.add ("codiceLabel", "Label");
        // u.add ("codiceLabel", "Label", "Label corta");

        return u.getList();
    } // get
}
