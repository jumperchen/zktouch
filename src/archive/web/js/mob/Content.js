mob.Content = zk.$extends(mob.Widget,{
	_datas:{
		role:'content'
	},
	$define:{
		label:function(){
			this.rerender();
		}
	},
	redraw: function(out){
		out.push('<div ',this.domAttrs_(),' >');
		
		if(this._label){//FIXME handling escaping
			out.push('<h1> ' , this._label , ' </h1>');
		}
		this.eachChild(function(index,child){ 
			this.redraw(out);
		});
		out.push('</div>');
		
	},
	bindChildren_: function(){
		this.$supers(mob.Content,'bindChildren_', arguments);
		
		//FIXME check pagecreate event to handle dynamic add headers.
	}
});