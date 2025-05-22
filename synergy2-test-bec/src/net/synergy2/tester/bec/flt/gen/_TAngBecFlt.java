package net.synergy2.tester.bec.flt.gen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.synergy2.base.exceptions.SException;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.db.sys.qry.AngQryDbmTblCol;
import net.synergy2.tester.base.RestTest;
import net.synergy2.tester.base.TestUtil;
import net.synergy2.tester.sys.qry.gen._TAngQryDbmTblCol;

public class _TAngBecFlt extends RestTest {

    @Override public String getTestTitle () { return "Test AngBecFlt"; }

    @Override protected void setPrerequisites (boolean fullTest) {
        addPrerequisites ("TPrePost1", new _TAngQryDbmTblCol ());
        addPrerequisites ("TPreUpd1", new _TAngQryDbmTblCol ());
    } // setPrerequisites

    @Override protected List<TestError> run (boolean fullTest) {

        AngQryDbmTblCol prerequisiteP1 = (AngQryDbmTblCol) getValue ("TPrePost1");
        AngQryDbmTblCol prerequisiteU1 = (AngQryDbmTblCol) getValue ("TPreUpd1");

        AngBecFlt toPost = AngBecFlt.newInstance ();
        long qryDbmTblColUid = prerequisiteP1.getUid ();
        toPost.setQryDbmTblColUid (qryDbmTblColUid);
        String becFltCod = TestUtil.getSecureCod ();
        toPost.setBecFltCod (becFltCod);
        String becFltDsc = "AngBecFltDescrizione";
        toPost.setBecFltDsc (becFltDsc);
        AngBecFlt model = post ("rest/bec/flt/AngBecFlt", toPost, AngBecFlt.class);
        setOutputValue (model);

        if (model != null && fullTest) {
            Long newUid = getSafeLong ("rest/bec/flt/AngBecFlt/newId");
            if (newUid != null) { checkEq (newUid - 1, model.getUid (), "Funzionamento sequence non corretto."); }

            model = getSafe ("rest/bec/flt/AngBecFlt/byId" + "/" + model.getUid (), AngBecFlt.class);
            if (model != null) {

                checkEq (model.getQryDbmTblColUid (), qryDbmTblColUid, "Inserito valore campo non corretto.");
                checkEq (model.getBecFltCod (), becFltCod, "Inserito valore campo non corretto.");
                checkEq (model.getBecFltDsc (), becFltDsc, "Inserito valore campo non corretto.");

                postError ("rest/bec/flt/AngBecFlt", toPost, AngBecFlt.class, SException.CODE_EXISTS);

                // Test di update.
                // Modifico il campo qryDbmTblColUid.
                AngBecFlt toPutQryDbmTblColUid = model.getCopy ();
                long qryDbmTblColUidUpd = prerequisiteU1.getUid ();
                toPutQryDbmTblColUid.setQryDbmTblColUid (qryDbmTblColUidUpd);
                model = put ("rest/bec/flt/AngBecFlt/all", toPutQryDbmTblColUid, AngBecFlt.class);
                // Modifico il campo becFltCod.
                AngBecFlt toPutBecFltCod = model.getCopy ();
                String becFltCodUpd = TestUtil.getSecureCod ();
                toPutBecFltCod.setBecFltCod (becFltCodUpd);
                model = put ("rest/bec/flt/AngBecFlt/all", toPutBecFltCod, AngBecFlt.class);
                // Modifico il campo becFltDsc.
                AngBecFlt toPutBecFltDsc = model.getCopy ();
                String becFltDscUpd = "AngBecFltDescrizioneUpd";
                toPutBecFltDsc.setBecFltDsc (becFltDscUpd);
                model = put ("rest/bec/flt/AngBecFlt/all", toPutBecFltDsc, AngBecFlt.class);

                if (model != null) {
                    model = getSafe ("rest/bec/flt/AngBecFlt/byCode" + "/" + model.getBecFltCod (), AngBecFlt.class);
                    if (model != null) {
                        Map<String, Object> urlParams = new HashMap<> ();
                        urlParams.put ("complete", true);
                        List<AngBecFlt> activeModelsBefore = getArray ("rest/bec/flt/AngBecFlt/active", urlParams, AngBecFlt.class);

                        delete ("rest/bec/flt/AngBecFlt" + "/" + model.getUid ());

                        List<AngBecFlt> activeModelsAfter = getArray ("rest/bec/flt/AngBecFlt/active", urlParams, AngBecFlt.class);
                        if (checkEq (activeModelsBefore.size (), activeModelsAfter.size () + 1, "Record non eliminato.")) {
                            model = post ("rest/bec/flt/AngBecFlt", toPost, AngBecFlt.class);
                            setOutputValue (model);
                        } // if
                    } // if
                } // if
            } // if
        } // if
        return errorList;
    } // run

} // _TAngBecFlt