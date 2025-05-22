package net.synergy2.tester.bec.gen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.synergy2.base.exceptions.SException;
import net.synergy2.db.bec.BecVrsInf;
import net.synergy2.tester.base.RestTest;
import net.synergy2.tester.base.TestUtil;

public class _TBecVrsInf extends RestTest {

    @Override public String getTestTitle () { return "Test BecVrsInf"; }

    @Override protected void setPrerequisites (boolean fullTest) { } // setPrerequisites

    @Override protected List<TestError> run (boolean fullTest) {


        BecVrsInf toPost = BecVrsInf.newInstance ();
        int vrsMaj = 0;
        toPost.setVrsMaj (vrsMaj);
        int vrsMin = 0;
        toPost.setVrsMin (vrsMin);
        int vrsRel = 0;
        toPost.setVrsRel (vrsRel);
        String vrsNam = TestUtil.getSecureCod ();
        toPost.setVrsNam (vrsNam);
        BecVrsInf model = post ("rest/bec/BecVrsInf", toPost, BecVrsInf.class);
        setOutputValue (model);

        if (model != null && fullTest) {
            Long newUid = getSafeLong ("rest/bec/BecVrsInf/newId");
            if (newUid != null) { checkEq (newUid - 1, model.getUid (), "Funzionamento sequence non corretto."); }

            model = getSafe ("rest/bec/BecVrsInf/byId" + "/" + model.getUid (), BecVrsInf.class);
            if (model != null) {

                checkEq (model.getVrsMaj (), vrsMaj, "Inserito valore campo non corretto.");
                checkEq (model.getVrsMin (), vrsMin, "Inserito valore campo non corretto.");
                checkEq (model.getVrsRel (), vrsRel, "Inserito valore campo non corretto.");
                checkEq (model.getVrsNam (), vrsNam, "Inserito valore campo non corretto.");

                postError ("rest/bec/BecVrsInf", toPost, BecVrsInf.class, SException.CODE_EXISTS);

                // Test di update.
                // Modifico il campo vrsMaj.
                BecVrsInf toPutVrsMaj = model.getCopy ();
                int vrsMajUpd = 1;
                toPutVrsMaj.setVrsMaj (vrsMajUpd);
                model = put ("rest/bec/BecVrsInf/all", toPutVrsMaj, BecVrsInf.class);
                // Modifico il campo vrsMin.
                BecVrsInf toPutVrsMin = model.getCopy ();
                int vrsMinUpd = 1;
                toPutVrsMin.setVrsMin (vrsMinUpd);
                model = put ("rest/bec/BecVrsInf/all", toPutVrsMin, BecVrsInf.class);
                // Modifico il campo vrsRel.
                BecVrsInf toPutVrsRel = model.getCopy ();
                int vrsRelUpd = 1;
                toPutVrsRel.setVrsRel (vrsRelUpd);
                model = put ("rest/bec/BecVrsInf/all", toPutVrsRel, BecVrsInf.class);
                // Modifico il campo vrsNam.
                BecVrsInf toPutVrsNam = model.getCopy ();
                String vrsNamUpd = TestUtil.getSecureCod ();
                toPutVrsNam.setVrsNam (vrsNamUpd);
                model = put ("rest/bec/BecVrsInf/all", toPutVrsNam, BecVrsInf.class);

                if (model != null) {
                    model = getSafe ("rest/bec/BecVrsInf/byCode" + "/" + model.getVrsMaj () + "/" + model.getVrsMin () + "/" + model.getVrsRel (), BecVrsInf.class);
                    if (model != null) {
                        Map<String, Object> urlParams = new HashMap<> ();
                        urlParams.put ("complete", true);
                        List<BecVrsInf> activeModelsBefore = getArray ("rest/bec/BecVrsInf/active", urlParams, BecVrsInf.class);

                        delete ("rest/bec/BecVrsInf" + "/" + model.getUid ());

                        List<BecVrsInf> activeModelsAfter = getArray ("rest/bec/BecVrsInf/active", urlParams, BecVrsInf.class);
                        if (checkEq (activeModelsBefore.size (), activeModelsAfter.size () + 1, "Record non eliminato.")) {
                            model = post ("rest/bec/BecVrsInf", toPost, BecVrsInf.class);
                            setOutputValue (model);
                        } // if
                    } // if
                } // if
            } // if
        } // if
        return errorList;
    } // run

} // _TBecVrsInf