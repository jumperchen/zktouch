package org.zkoss.mobile;

import java.io.IOException;

import org.zkoss.lang.Objects;
import org.zkoss.zk.ui.sys.ContentRenderer;

public class Slider extends JQueryMobileElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4622301302776380326L;

	private String _type;
	private String _name;
	private String _value;
	private String _min;
	private String _max;
	private boolean _dataHighlight;

	protected void renderProperties(ContentRenderer renderer)
			throws IOException {
		super.renderProperties(renderer);

		render(renderer, "type", _type);
		render(renderer, "label", _name);
		render(renderer, "value", _value);
		render(renderer, "min", _min);
		render(renderer, "max", _max);
		render(renderer, "dataHighlight", _dataHighlight);

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

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		if (!Objects.equals(this._name, _name)) {
			this._name = _name;
			smartUpdate("label", _name);
		}
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String _value) {
		if (!Objects.equals(this._value, _value)) {
			this._value = _value;
			smartUpdate("value", _value);
		}
	}

	public String getMin() {
		return _min;
	}

	public void setMin(String _min) {
		if (!Objects.equals(this._min, _min)) {
			this._min = _min;
			smartUpdate("min", _min);
		}
	}

	public String getMax() {
		return _max;
	}

	public void setMax(String _max) {
		if (!Objects.equals(this._max, _max)) {
			this._max = _max;
			smartUpdate("max", _max);
		}
	}

	public boolean getDatahighlight() {
		return _dataHighlight;
	}

	public void setDatahighlight(boolean _dataHighlight) {
		if (!Objects.equals(this._dataHighlight, _dataHighlight)) {
			this._dataHighlight = _dataHighlight;
			smartUpdate("dataHighlight", _dataHighlight);
		}
	}

}
