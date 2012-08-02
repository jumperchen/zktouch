mob.Popup = zk.$extends(mob.Widget,{
	_datas:{
		role:'popup'
	},
	$define:{
	},
	redraw: function(out){
		out.push('<div ',this.domAttrs_(),' >');
		this.eachChild(function(index,child){ 
			this.redraw(out);
		});
		out.push('</div>');
	},
	bindChildren_: function(){
		this.$supers(mob.Dialog,'bindChildren_', arguments);
		
		//FIXME check pagecreate event to handle dynamic add headers.
	}
});