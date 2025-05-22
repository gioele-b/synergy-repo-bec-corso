package net.synergy2.demo.bec;

import java.util.ArrayList;
import java.util.List;
import net.synergy2.demo.base.Demo;
import net.synergy2.demo.base.IDemoList;
import net.synergy2.demo.bec.demos.BecDemoData;
import net.synergy2.demo.bec.demos.BecOptionsDemo;
import net.synergy2.demo.sys.SysDemoList;
import net.synergy2.demo.util.DemoConfig;

/**
 * Classe che lancia le classi DEMO in ordine per la generazione dei record
 */
public class BecDemoList implements IDemoList {

    @Override
    public List<Demo> getList(DemoConfig cfg) {
        BecDemoData data = new BecDemoData();
        List<Demo> list = new ArrayList<>();
        list.addAll(new SysDemoList().getList(cfg));
        list.add(new BecOptionsDemo(data));
        return list;
    } // getList
}
