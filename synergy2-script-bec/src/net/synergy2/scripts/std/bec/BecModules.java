// @formatter:off
package net.synergy2.scripts.std.bec;

import net.synergy2.manager.script.ModuleDef;

public class BecModules {

    public static ModuleDef getMBecFlt () { 
        return ModuleDef.create ("bec.flt", false).setDescription ("Filtri").addDependency("sys.qry"); 
    }

    public static ModuleDef getMBecVrt () { 
        return ModuleDef.create ("bec.vrt", false).setDescription ("Virtuali");
    }

}
