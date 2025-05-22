package net.synergy2.tester.bec.flt.gen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.db.sys.AngLng;
import net.synergy2.db.sys.AngLngImpl;
import net.synergy2.tester.base.RestTest;

public class _TAngBecFltLng extends RestTest {

    @Override public String getTestTitle () { return "Test AngBecFltLng"; }

    @Override protected void setPrerequisites (boolean fullTest) {
        addPrerequisites ("TPrq", new _TAngBecFlt ());
    } // setPrerequisites

    @Override protected List<TestError> run (boolean fullTest) {

        AngBecFlt record = (AngBecFlt) getValue ("TPrq");

        Map<String, Object> urlParams = new HashMap<> ();
        urlParams.put ("lngUid", getAlternateLanguageUid ());
        record = getSafe ("rest/bec/flt/AngBecFlt/byId/" + record.getUid (), urlParams, AngBecFlt.class);
        if (record != null) {

            AngBecFlt copy = record.getCopy ();
            copy.setBecFltDsc ("AngBecFltDescrizioneTra");
            record = put ("rest/bec/flt/AngBecFlt/all", urlParams, copy, null, AngBecFlt.class);

            if (record != null) {
                List<AngLng> languages = getArray ("rest/bec/flt/AngBecFlt/tra/" + record.getUid (), null, AngLng.class, null);
                if (checkNotNull (languages, "Lista lingue trovata")) {
                    int nTranslations = 0;
                    for (AngLng _language : languages) {
                        var language = (AngLngImpl) _language;
                        if (language.getAngBecFltLst () != null && language.getAngBecFltLst ().size () == 1) { nTranslations++; }
                    } // for
                    checkEq (nTranslations, 2, "Due traduzioni trovate");
                } // if
            } // if
        } // if

        return errorList;
    } // run

} // _TAngBecFltLng