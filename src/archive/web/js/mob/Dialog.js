mob.Dialog = zk.$extends(mob.Widget, {
	_datas : {},
	$define : {},
	dataInit_ : function() {
		this.$supers(mob.Dialog, 'dataInit_', arguments);
		this.data("role", "dialog");
	},
	redraw : function(out) {
		out.push('<div ', this.domAttrs_(), ' >');
		console.log(out);
		this.eachChild(function(index, child) {
			this.redraw(out);
		});
		out.push('</div>');
		console.log(out.join());
	},
	domAttrs_ : function(no) {
		var res = [ this.$supers(mob.Dialog, 'domAttrs_', arguments) ];
		// res.push(this.domDataAttrs_(no));
		return res.join("");
	},
	domClass_ : function() {
		var sup = this.$supers(mob.Dialog, 'domClass_', arguments);
		// console.log("domClass");
		// console.log(sup);
		/*
		 * if(!this._active) { return sup ; } else { return sup + "
		 * ui-page-active"; }
		 */
	}
});