// @formatter:off
package net.synergy2.scripts.std.bec;

import net.synergy2.manager.script.IVersionInfo;

public class VersionInfo implements IVersionInfo {
    
    public int majorVersion = 24; // Anno
    public int minorVersion = 1; // Mese - 1
    public int release = 1; // progressivo
    public String name = "Alpha";
    public String icon = "mdi mdi-alpha";
    public String color = "#1976d2";
    
    @Override public int getMajorVersion () { return majorVersion; }
    @Override public int getMinorVersion () { return minorVersion; }
    @Override public int getRelease () { return release; }
    @Override public String getVersionName () { return name; }
    @Override public String getVersionIcon () { return icon; }
    @Override public String getVersionColor () { return color; }
    
}
