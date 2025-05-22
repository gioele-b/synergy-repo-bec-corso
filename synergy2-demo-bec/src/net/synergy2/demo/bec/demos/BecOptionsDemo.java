package net.synergy2.demo.bec.demos;

import net.synergy2.db.sys.opt.SynergyOptions;
import net.synergy2.demo.base.Demo;
import net.synergy2.rest.client.ResponseException;

/** Classe DEMO per le opzioni globali BEC */
public class BecOptionsDemo extends Demo {

    @SuppressWarnings("unused")
    private BecDemoData data;

    /**
     * Crea una nuova istanza impostando i dati
     *
     * @param data Dati demo generati in precedenza
     */
    public BecOptionsDemo(BecDemoData data) {
        this.data = data;
    } // BecOptionsDemo

    @Override
    protected String getDemoTitle() {
        return "Bec Demo - Options";
    } // getDemoTitle

    @Override
    protected void run(boolean updateIfExists) throws ResponseException {
        SynergyOptions options = get(
            "spec/sys/opt/SynergyOptions",
            SynergyOptions.class
        );

        // Sostituisco l'eventuale url angular con url tomcat
        // String clientUrl = options.sysOptions.getCliUrl ();
        // if (!ObjectUtil.exist (clientUrl) || Objects.equals (clientUrl, "http://localhost:4200/synergy")) {
        //     options.sysOptions.setCliUrl ("http://localhost:8080/synergy");
        // } // if

        put("spec/sys/opt/SynergyOptions", options, SynergyOptions.class);
    } // run
}
