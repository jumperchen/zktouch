package org.zkoss.mobile;

import java.io.IOException;

import org.zkoss.lang.Objects;
import org.zkoss.zk.ui.sys.ContentRenderer;

public class TextInput extends FormElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7332898652273905911L;
	
	private String _type;
	private String _label;
	private String _text;
	
	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);

		render(renderer, "type", _type);
		render(renderer, "label", _label);
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

	public String getLabel() {
		return _label;
	}

	public void setLabel(String _label) {
		if (!Objects.equals(this._label,_label)) {
			this._label = _label;
			smartUpdate("label", _label);
		}
	}

	public String getType() {
		return _type;
	}
	
	public void setType(String type) {

		if (!Objects.equals(this._type,type)) {
			this._type = type;
			smartUpdate("type", _type);
		}
	}

}
