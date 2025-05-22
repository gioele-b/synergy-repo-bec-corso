package net.synergy2.data.label.bec;

import java.util.ArrayList;
import java.util.List;
import net.synergy2.data.base.ILabelInstallConfig;
import net.synergy2.data.base.ILabelList;
import net.synergy2.db.sys.tra.SysTraLbl;

public class BecStandardLabelList implements ILabelList {

    @Override
    public List<SysTraLbl> get(ILabelInstallConfig cfg) throws Exception {
        List<SysTraLbl> r = new ArrayList<>();
        r.addAll(new AAStandardLabelList().get(cfg));
        r.addAll(new BBStandardLabelList().get(cfg));
        r.addAll(new CCStandardLabelList().get(cfg));
        r.addAll(new DDStandardLabelList().get(cfg));
        r.addAll(new EEStandardLabelList().get(cfg));
        r.addAll(new FFStandardLabelList().get(cfg));
        r.addAll(new GGStandardLabelList().get(cfg));
        r.addAll(new HHStandardLabelList().get(cfg));
        r.addAll(new IIStandardLabelList().get(cfg));
        r.addAll(new JJStandardLabelList().get(cfg));
        r.addAll(new KKStandardLabelList().get(cfg));
        r.addAll(new LLStandardLabelList().get(cfg));
        r.addAll(new MMStandardLabelList().get(cfg));
        r.addAll(new NNStandardLabelList().get(cfg));
        r.addAll(new OOStandardLabelList().get(cfg));
        r.addAll(new PPStandardLabelList().get(cfg));
        r.addAll(new QQStandardLabelList().get(cfg));
        r.addAll(new RRStandardLabelList().get(cfg));
        r.addAll(new SSStandardLabelList().get(cfg));
        r.addAll(new TTStandardLabelList().get(cfg));
        r.addAll(new UUStandardLabelList().get(cfg));
        r.addAll(new VVStandardLabelList().get(cfg));
        r.addAll(new WWStandardLabelList().get(cfg));
        r.addAll(new ZZStandardLabelList().get(cfg));
        return r;
    }
}
