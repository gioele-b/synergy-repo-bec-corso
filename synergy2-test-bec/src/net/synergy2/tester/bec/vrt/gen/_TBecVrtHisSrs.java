package net.synergy2.tester.bec.vrt.gen;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.synergy2.base.exceptions.SException;
import net.synergy2.db.bec.vrt.BecVrtHisSrs;
import net.synergy2.tester.base.RestTest;
import net.synergy2.tester.base.TestUtil;

public class _TBecVrtHisSrs extends RestTest {

    @Override public String getTestTitle () { return "Test BecVrtHisSrs"; }

    @Override protected void setPrerequisites (boolean fullTest) { } // setPrerequisites

    @Override protected List<TestError> run (boolean fullTest) {


        BecVrtHisSrs toPost = BecVrtHisSrs.newInstance ();
        long uid = 0;
        toPost.setUid (uid);
        String itmCod = TestUtil.getSecureCod ();
        toPost.setItmCod (itmCod);
        String itmDsc = "BecVrtHisSrsDescrizione";
        toPost.setItmDsc (itmDsc);
        String cusCod = TestUtil.getSecureCod ();
        toPost.setCusCod (cusCod);
        String cusDsc = "BecVrtHisSrsDescrizione";
        toPost.setCusDsc (cusDsc);
        int month = 0;
        toPost.setMonth (month);
        BigDecimal qta = BigDecimal.valueOf (0);
        toPost.setQta (qta);
        BecVrtHisSrs model = post ("rest/bec/vrt/BecVrtHisSrs", toPost, BecVrtHisSrs.class);
        setOutputValue (model);

        if (model != null && fullTest) {


            model = getSafe ("rest/bec/vrt/BecVrtHisSrs/byId" + "/" + model.getUid (), BecVrtHisSrs.class);
            if (model != null) {

                checkEq (model.getUid (), uid, "Inserito valore campo non corretto.");
                checkEq (model.getItmCod (), itmCod, "Inserito valore campo non corretto.");
                checkEq (model.getItmDsc (), itmDsc, "Inserito valore campo non corretto.");
                checkEq (model.getCusCod (), cusCod, "Inserito valore campo non corretto.");
                checkEq (model.getCusDsc (), cusDsc, "Inserito valore campo non corretto.");
                checkEq (model.getMonth (), month, "Inserito valore campo non corretto.");
                checkEq (model.getQta (), qta, "Inserito valore campo non corretto.");

                postError ("rest/bec/vrt/BecVrtHisSrs", toPost, BecVrtHisSrs.class, SException.CODE_EXISTS);

                // Test di update.
                // Modifico il campo itmCod.
                BecVrtHisSrs toPutItmCod = model.getCopy ();
                String itmCodUpd = TestUtil.getSecureCod ();
                toPutItmCod.setItmCod (itmCodUpd);
                model = put ("rest/bec/vrt/BecVrtHisSrs/all", toPutItmCod, BecVrtHisSrs.class);
                // Modifico il campo itmDsc.
                BecVrtHisSrs toPutItmDsc = model.getCopy ();
                String itmDscUpd = "BecVrtHisSrsDescrizioneUpd";
                toPutItmDsc.setItmDsc (itmDscUpd);
                model = put ("rest/bec/vrt/BecVrtHisSrs/all", toPutItmDsc, BecVrtHisSrs.class);
                // Modifico il campo cusCod.
                BecVrtHisSrs toPutCusCod = model.getCopy ();
                String cusCodUpd = TestUtil.getSecureCod ();
                toPutCusCod.setCusCod (cusCodUpd);
                model = put ("rest/bec/vrt/BecVrtHisSrs/all", toPutCusCod, BecVrtHisSrs.class);
                // Modifico il campo cusDsc.
                BecVrtHisSrs toPutCusDsc = model.getCopy ();
                String cusDscUpd = "BecVrtHisSrsDescrizioneUpd";
                toPutCusDsc.setCusDsc (cusDscUpd);
                model = put ("rest/bec/vrt/BecVrtHisSrs/all", toPutCusDsc, BecVrtHisSrs.class);
                // Modifico il campo month.
                BecVrtHisSrs toPutMonth = model.getCopy ();
                int monthUpd = 1;
                toPutMonth.setMonth (monthUpd);
                model = put ("rest/bec/vrt/BecVrtHisSrs/all", toPutMonth, BecVrtHisSrs.class);
                // Modifico il campo qta.
                BecVrtHisSrs toPutQta = model.getCopy ();
                BigDecimal qtaUpd = BigDecimal.valueOf (1);
                toPutQta.setQta (qtaUpd);
                model = put ("rest/bec/vrt/BecVrtHisSrs/all", toPutQta, BecVrtHisSrs.class);

                if (model != null) {
                    model = getSafe ("rest/bec/vrt/BecVrtHisSrs/byCode" + "/" + model.getItmCod () + "/" + model.getCusCod (), BecVrtHisSrs.class);
                    if (model != null) {
                        Map<String, Object> urlParams = new HashMap<> ();
                        urlParams.put ("complete", true);
                        List<BecVrtHisSrs> activeModelsBefore = getArray ("rest/bec/vrt/BecVrtHisSrs/active", urlParams, BecVrtHisSrs.class);

                        delete ("rest/bec/vrt/BecVrtHisSrs" + "/" + model.getUid ());

                        List<BecVrtHisSrs> activeModelsAfter = getArray ("rest/bec/vrt/BecVrtHisSrs/active", urlParams, BecVrtHisSrs.class);
                        if (checkEq (activeModelsBefore.size (), activeModelsAfter.size () + 1, "Record non eliminato.")) {
                            model = post ("rest/bec/vrt/BecVrtHisSrs", toPost, BecVrtHisSrs.class);
                            setOutputValue (model);
                        } // if
                    } // if
                } // if
            } // if
        } // if
        return errorList;
    } // run

} // _TBecVrtHisSrs