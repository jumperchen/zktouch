mob.ControlGroup = zk.$extends(mob.Widget, {
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
		value : function() {
			this.rerender();
		},
		text:function(){
			this.rerender();
		}
	},
	redraw : function(out) {
		out.push('<div ', this.domAttrs_(), ' >');
		out.push('<fieldset data-role="controlgroup">');
		out.push('<legend>');
		out.push(this._text);
		out.push('</legend>');
		// recursively write check box elements
		this.eachChild(function(index,child){
			this.redraw(out, index);
		});
		out.push('</fieldset>');
		out.push('</div>');
	},
	bindChildren_ : function() {
		this.$supers(mob.ControlGroup, 'bindChildren_', arguments);

		// FIXME check pagecreate event to handle dynamic add headers.
	}
});