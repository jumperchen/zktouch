package org.zkoss.mobile;

import java.io.IOException;

import org.zkoss.lang.Objects;
import org.zkoss.zk.ui.sys.ContentRenderer;

public class ControlGroupItem extends JQueryMobileElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6313011766083458375L;
	
//	private String _type;
//	private String _label;
//	private String _class;
	private String _value;

	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);
//		render(renderer, "type", _type);
//		render(renderer, "label", _label);
//		render(renderer, "class", _class);
		render(renderer, "value", _value);
	}

//	public String getType() {
//		return _type;
//	}
//
//	public void setType(String type) {
//		if (!Objects.equals(this._type, type)) {
//			this._type = type;
//			smartUpdate("type", _type);
//		}
//	}

//	public String getLabel() {
//		return _label;
//	}
//
//	public void setLabel(String _label) {
//		if (!Objects.equals(this._label, _label)) {
//			this._label = _label;
//			smartUpdate("label", _label);
//		}
//	}
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return _value;
	}

	/**
	 * @param inline
	 *            the value to set
	 */
	public void setValue(String value) {

		if (!Objects.equals(this._value, value)) {
			this._value = value;
			smartUpdate("value", value);
		}
	}

}
