package org.zkoss.mobile;

import org.zkoss.lang.Objects;

public class Popup extends JQueryMobileElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8631808232287314750L;
	
	public String getZclass() {
		return this._zclass == null ? "zm-popup" : this._zclass;
	}
	
	private String _id;
	
	protected void renderProperties(org.zkoss.zk.ui.sys.ContentRenderer renderer)
	throws java.io.IOException {
		super.renderProperties(renderer);
		
		if( _id != null)
			render(renderer, "id", _id);
		
	}

	/**
	 * @return the _label
	 */
	public String getId() {
		return _id;
	}

	/**
	 * @param _label the _label to set
	 */
	public void setId(String id) {
		if(!Objects.equals(_id, id)){
			this._id = id;
			smartUpdate("id",id);
		}
	}
}
