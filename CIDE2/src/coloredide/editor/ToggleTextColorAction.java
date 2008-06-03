package coloredide.editor;

import org.eclipse.jface.action.Action;

import coloredide.features.IFeature;

public class ToggleTextColorAction extends Action {

	IFeature feature;
	private ToggleTextColorContext context;

	ToggleTextColorAction(ToggleTextColorContext context, IFeature feature) {
		this.setText(feature.getName());
		this.setEnabled(context.isEnabled());
		this.setChecked(context.isChecked(feature));
		this.feature=feature;
		this.context=context;
	}
	
	@Override
	public void run() {
		context.run(feature,this.isChecked());
	}
}
