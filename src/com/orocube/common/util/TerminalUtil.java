package com.orocube.common.util;

import java.util.UUID;
import org.apache.commons.lang.StringUtils;
import java.util.prefs.Preferences;

public class TerminalUtil
{
    private static final String FLUID = "a$@d55#";
    private static String uid;
    
    public static String getSystemUID() {
        return TerminalUtil.uid;
    }
    
    static {
        final Preferences preferences = Preferences.userNodeForPackage(TerminalUtil.class);
        //TerminalUtil.uid = preferences.get("a$@d55#", null);
        TerminalUtil.uid = preferences.get("a$@d55#", null);
        if (StringUtils.isEmpty(TerminalUtil.uid)) {
            preferences.put("a$@d55#", TerminalUtil.uid = UUID.randomUUID().toString());
        }
    }
}
