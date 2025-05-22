package net.synergy2.tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import net.synergy2.db.bec.Constants;
import net.synergy2.tester.base.ITester;
import net.synergy2.tester.base.Test;

public class BecTester extends ITester {

    private static Map<String, Boolean> m = new HashMap<>();

    static {
        m.put("test_all", false);
        m.put("bec_autogen", true);

        m.put("bec", false);
        // m.put ("becDoc", true);
        // .... inserire qui i test da eseguire
    } // static

    @Override
    public String getModuleCode() {
        return Constants.AppCode.BEC;
    }

    @Override
    public List<Test> getTestList(Properties p) {
        List<Test> list = new ArrayList<>();
        boolean doAll = getProp("test_all", p, m);
        boolean doTestGen = getProp("bec_autogen", p, m) || doAll;
        // if (getProp ("bec", p, m) || doAll) { if (doTestGen) { list.addAll (BecGenTestList.getAutoTestList ()); } }

        // Aggiungere sempre in coda i prossimi test e spostare questo commento alla fine
        return list;
    } // getTestList
}
