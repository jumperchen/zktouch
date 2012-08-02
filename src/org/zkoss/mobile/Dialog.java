package org.zkoss.mobile;

import java.io.IOException;

import org.zkoss.zk.ui.sys.ContentRenderer;

public class Dialog extends JQueryMobileElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4555885261990490707L;
	
	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);
	}
	
	public String getZclass() {
		return this._zclass == null ? "zm-dialog" : this._zclass;
	}

}
