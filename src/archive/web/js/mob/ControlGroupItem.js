mob.ControlGroupItem = zk.$extends(mob.Widget, {
	_datas : {
	},
	$define : {
//		type : function() {
//			this.rerender();
//		},
//		label : function() {
//			this.rerender();
//		},
//		value : function() {
//			this.rerender();
//		},
	},
	redraw : function(out, index) {
//		out.push('<label for="', this.parent._label ,'-', index, '">', this.parent._label, '</label>');
		out.push('<label for="', this.parent._label ,'-', index, '">');
		this.eachChild(function(index,child){
			this.redraw(out);
		});
		out.push('</label>');
		out.push('<input type="', this.parent._type, '" name="', this.parent._label,'" id="', this.parent._label ,'-', index, '">');
//		out.push('<label for="hello">hello</label>');
//		out.push('<input type="checkbox" name="hello" id="hello">');
//		this.eachChild(function(index,child){
//			this.redraw(out);
//		});
	}
});