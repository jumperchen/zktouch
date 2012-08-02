package org.zkoss.mobile;

import java.io.IOException;

import org.zkoss.lang.Objects;
import org.zkoss.zk.ui.sys.ContentRenderer;

public class Content extends JQueryMobileElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4383764589637109891L;
	
	private String _label;

	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);

		render(renderer, "label", _label);
	}
	
	public String getZclass() {
		return this._zclass == null ? "zm-content" : this._zclass;
	}

	public String getLabel() {
		return _label;
	}
	
	public void setLabel(String label) {

		if (!Objects.equals(this._label,label)) {
			this._label = label;
			smartUpdate("caption", _label);
		}
	}
}
