package com.floreantpos.extension;

import javax.swing.AbstractAction;
import java.util.List;
import javax.swing.JDialog;
import net.xeoh.plugins.base.Plugin;

public interface FloreantPlugin extends Plugin
{
    String getId();
    
    boolean requireLicense();
    
    boolean hasValidLicense();
    
    void initLicense();
    
    void initUI();
    
    void initBackoffice();
    
    void initConfigurationView(final JDialog p0);
    
    List<AbstractAction> getSpecialFunctionActions();
}
