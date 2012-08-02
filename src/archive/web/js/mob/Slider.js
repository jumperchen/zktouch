mob.Slider = zk.$extends(mob.Widget, {
	_datas : {
		role : 'fieldcontain'
	},
	$define : {
		type : function() {
			this.rerender();
		},
		name : function() {
			this.rerender();
		},
		value : function() {
			this.rerender();
		},
		min : function() {
			this.rerender();
		},
		max : function() {
			this.rerender();
		},
		dataHighlight : function() {
			this.rerender();
		}
	},
	redraw : function(out) {
		out.push('<input type="', this._type, '" name="', this._name,
				'" value="', this._value, '" min="', this._min, '" max="',
				this._max, '" />');
	},

	bindChildren_ : function() {
		this.$supers(mob.Slider, 'bindChildren_', arguments);

		// FIXME check pagecreate event to handle dynamic add headers.
	}
});