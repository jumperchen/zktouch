package org.zkoss.mobile;

import java.io.IOException;

import org.zkoss.lang.Objects;
import org.zkoss.zk.ui.sys.ContentRenderer;

public class ControlGroup extends JQueryMobileElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5611940980399925339L;

	private String _type;
	private String _label;
//	private String _name;
	private Boolean _value = false;
	private String _text;

	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);
		render(renderer, "type", _type);
		render(renderer, "label", _label);
//		render(renderer, "name", _name);
		render(renderer, "value", _value);
		render(renderer, "text", _text);
	}
	
	public String getText() {
		return _text;
	}

	public void setText(String _text) {
		if (!Objects.equals(this._text,_text)) {
			this._text = _text;
			smartUpdate("text", _text);
		}
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {

		if (!Objects.equals(this._type, type)) {
			this._type = type;
			smartUpdate("type", _type);
		}
	}

	public String getLabel() {
		return _label;
	}

	public void setLabel(String _label) {
		if (!Objects.equals(this._label, _label)) {
			this._label = _label;
			smartUpdate("label", _label);
		}
	}
	
//	public String getName() {
//		return _name;
//	}
//
//	public void setName(String _name) {
//		if (!Objects.equals(this._name, _name)) {
//			this._name = _name;
//			smartUpdate("name", _name);
//		}
//	}


	/**
	 * @return the value
	 */
	public Boolean getValue() {
		return _value;
	}

	/**
	 * @param inline
	 *            the value to set
	 */
	public void setValue(Boolean value) {

		if (!Objects.equals(this._value, value)) {
			this._value = value;
			smartUpdate("value", value);
		}
	}

}
