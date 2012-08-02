mob.TextInput = zk.$extends(mob.Widget, {
	_datas : {
		role : 'fieldcontain'
	},
	$define : {
		type : function() {
			this.rerender();
		},
		label : function() {
			this.rerender();
		},
		text : function() {
			this.rerender();
		}
	},
	redraw : function(out) {
		out.push('<div ',this.domAttrs_(),' >');
		out.push('<label for="', this._label, '">', this._text, ' </label>');
		out.push('<input type="', this._type, '" name="', this._label, '" />');
		out.push('</div>');

	},
	bindChildren_ : function() {
		this.$supers(mob.TextInput, 'bindChildren_', arguments);

		// FIXME check pagecreate event to handle dynamic add headers.
	}
});