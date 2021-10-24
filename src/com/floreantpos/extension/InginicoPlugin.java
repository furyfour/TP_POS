package com.floreantpos.extension;

import java.awt.Component;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JDialog;

import net.xeoh.plugins.base.annotations.PluginImplementation;

import com.floreantpos.config.ui.ConfigurationView;
import com.floreantpos.config.ui.InginicoConfigurationView;
import com.floreantpos.ui.views.payment.CardProcessor;

@PluginImplementation
public class InginicoPlugin extends PaymentGatewayPlugin {
	InginicoConfigurationView view;

	public String getProductName() {
		return "Ingenico IWL220 TGI"; //$NON-NLS-1$
	}

	public void initUI() {
	}

	public void initBackoffice() {
	}

	public void initConfigurationView(JDialog dialog) {

	}

	public String getId() {
		return String.valueOf("Inginico".hashCode()); // //$NON-NLS-1$
	}

	@Override
	public String toString() {
		return getProductName();
	}

	@Override
	public ConfigurationView getConfigurationPane() throws Exception {
		if (view == null) {
			view = new InginicoConfigurationView();
			view.initialize();
		}

		return view;
	}

	@Override
	public CardProcessor getProcessor() {
		return null;
	}

	@Override
	public boolean shouldShowCardInputProcessor() {
		return true;
	}

	public List<AbstractAction> getSpecialFunctionActions() {
		return null;
	}

	public void initLicense() {
	}

	public boolean hasValidLicense() {
		return true;
	}

	public String getProductVersion() {
		return null;
	}

	public Component getParent() {
		return null;
	}
}
