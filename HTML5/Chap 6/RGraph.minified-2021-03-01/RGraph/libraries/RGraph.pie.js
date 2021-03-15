
RGraph=window.RGraph||{isrgraph:true,isRGraph:true,rgraph:true};RGraph.Pie=function(conf)
{var id=conf.id,canvas=document.getElementById(id),data=conf.data;this.id=id;this.canvas=canvas;this.context=this.canvas.getContext?this.canvas.getContext("2d",{alpha:(typeof id==='object'&&id.alpha===false)?false:true}):null;this.canvas.__object__=this;this.total=0;this.subTotal=0;this.angles=[];this.data=data;this.properties=[];this.type='pie';this.isRGraph=true;this.isrgraph=true;this.rgraph=true;this.coords=[];this.coords.key=[];this.coordsSticks=[];this.coordsText=[];this.uid=RGraph.createUID();this.canvas.uid=this.canvas.uid?this.canvas.uid:RGraph.createUID();this.colorsParsed=false;this.original_colors=[];this.firstDraw=true;this.exploding=null;this.data=RGraph.stringsToNumbers(this.data);this.properties={centerxAdjust:0,centeryAdjust:0,colors:['red','#ccc','#cfc','blue','pink','yellow','black','orange','cyan','purple','#78CAEA','#E284E9','white','blue','#9E7BF6'],colorsStroke:'white',linewidth:3,labels:[],labelsFont:null,labelsSize:null,labelsColor:null,labelsBold:null,labelsItalic:null,labelsOffsetRadius:0,labelsSticks:false,labelsSticksLength:7,labelsSticksColors:null,labelsSticksLinewidth:1,labelsSticksHlength:5,labelsList:true,labelsListLeftOffsetx:0,labelsListLeftOffsety:0,labelsListRightOffsetx:0,labelsListRightOffsety:0,labelsIngraph:null,labelsIngraphColor:null,labelsIngraphFont:null,labelsIngraphSize:null,labelsIngraphBold:null,labelsIngraphItalic:null,labelsIngraphBounding:true,labelsIngraphBoundingFill:'rgba(255,255,255,0.85)',labelsIngraphBoundingStroke:'rgba(0,0,0,0)',labelsIngraphSpecific:null,labelsIngraphUnitsPre:'',labelsIngraphUnitsPost:'',labelsIngraphPoint:'.',labelsIngraphThousand:',',labelsIngraphDecimals:0,labelsIngraphRadius:null,labelsIngraphOffsetRadius:0,labelsCenter:null,labelsCenterSize:26,labelsCenterFont:null,labelsCenterColor:null,labelsCenterItalic:null,labelsCenterBold:null,labelsCenterOffsetx:0,labelsCenterOffsety:0,marginLeft:35,marginRight:35,marginTop:35,marginBottom:35,title:'',titleBackground:null,titleHpos:null,titleVpos:0.5,titleBold:null,titleFont:null,titleSize:null,titleColor:null,titleItalic:null,titleX:null,titleY:null,titleHalign:null,titleValign:null,titleOffsetx:0,titleOffsety:0,shadow:true,shadowColor:'#aaa',shadowOffsetx:0,shadowOffsety:0,shadowBlur:15,textBold:false,textItalic:false,textSize:12,textColor:'black',textFont:'Arial, Verdana, sans-serif',textAccessible:true,textAccessibleOverflow:'visible',textAccessiblePointerevents:false,contextmenu:null,tooltips:[],tooltipsEvent:'onclick',tooltipsEffect:'fade',tooltipsCssClass:'RGraph_tooltip',tooltipsCss:null,tooltipsHighlight:true,tooltipsFormattedThousand:',',tooltipsFormattedPoint:'.',tooltipsFormattedDecimals:0,tooltipsFormattedUnitsPre:'',tooltipsFormattedUnitsPost:'',tooltipsFormattedKeyColors:null,tooltipsFormattedKeyColorsShape:'square',tooltipsFormattedKeyLabels:[],tooltipsFormattedListType:'ul',tooltipsFormattedListItems:null,tooltipsFormattedTableHeaders:null,tooltipsFormattedTableData:null,tooltipsPointer:true,tooltipsPositionStatic:true,highlightStyle:'2d',highlightStyleTwodFill:'rgba(255,255,255,0.7)',highlightStyleTwodStroke:'rgba(255,255,255,0.7)',highlightStyleTwodLinewidth:0,highlightStyleOutlineWidth:null,centerx:null,centery:null,radius:null,border:false,borderColor:'rgba(255,255,255,0.5)',key:null,keyBackground:'white',keyPosition:'graph',keyHalign:'right',keyShadow:false,keyShadowColor:'#666',keyShadowBlur:3,keyShadowOffsetx:2,keyShadowOffsety:2,keyPositionGutterBoxed:false,keyPositionX:null,keyPositionY:null,keyColorShape:'square',keyRounded:true,keyLinewidth:1,keyColors:null,keyInteractive:false,keyInteractiveHighlightChartStroke:'black',keyInteractiveHighlightChartFill:'rgba(255,255,255,0.7)',keyInteractiveHighlightLabel:'rgba(255,0,0,0.2)',keyLabelsColor:null,keyLabelsFont:null,keyLabelsSize:null,keyLabelsBold:null,keyLabelsItalic:null,keyLabelsOffsetx:0,keyLabelsOffsety:0,annotatable:false,annotatableColor:'black',variant:'pie',variantDonutWidth:null,variantThreedDepth:20,exploded:[],effectRoundrobinMultiplier:1,centerpin:null,centerpinFill:'gray',centerpinStroke:'white',origin:0-(Math.PI/2),clearto:'rgba(0,0,0,0)',events:true}
for(var i=0,len=data.length;i<len;i++){this.total+=data[i];this['$'+i]={};}
var properties=this.properties;this.path=RGraph.pathObjectFunction;if(RGraph.Effects&&typeof RGraph.Effects.decorate==='function'){RGraph.Effects.decorate(this);}
this.responsive=RGraph.responsive;this.set=function(name)
{var value=typeof arguments[1]==='undefined'?null:arguments[1];if(arguments.length===1&&typeof arguments[0]==='object'){for(i in arguments[0]){if(typeof i==='string'){this.set(i,arguments[0][i]);}}
return this;}
properties[name]=value;return this;};this.get=function(name)
{return properties[name];};this.draw=function()
{RGraph.fireCustomEvent(this,'onbeforedraw');if(!this.canvas.__rgraph_aa_translated__){this.context.translate(0.5,0.5);this.canvas.__rgraph_aa_translated__=true;}
this.marginLeft=properties.marginLeft;this.marginRight=properties.marginRight;this.marginTop=properties.marginTop;this.marginBottom=properties.marginBottom;this.radius=this.getRadius();this.centerx=(this.graph.width/2)+this.marginLeft+properties.centerxAdjust;this.centery=(this.graph.height/2)+this.marginTop+properties.centeryAdjust;this.subTotal=properties.origin;this.angles=[];this.coordsText=[];if(typeof properties.radius==='number')this.radius=properties.radius;if(typeof properties.centerx==='number')this.centerx=properties.centerx;if(typeof properties.centery==='number')this.centery=properties.centery;if(this.radius<=0){return;}
if(!this.colorsParsed){this.parseColors();this.colorsParsed=true;}
if(properties.variant.indexOf('3d')>0){return this.draw3d();}
RGraph.drawTitle(this,properties.title,(this.canvas.height/2)-this.radius-5,this.centerx,properties.titleSize?properties.titleSize:properties.textSize);this.total=RGraph.arraySum(this.data);var tot=this.total;var data=this.data;for(var i=0,len=this.data.length;i<len;i++){var angle=((data[i]/tot)*RGraph.TWOPI);this.drawSegment(angle,properties.colors[i],i==(len-1),i);}
RGraph.noShadow(this);if(properties.linewidth>0){this.drawBorders();}
var len=this.angles.length;var r=this.radius;for(var action=0;action<2;action+=1){for(var i=0;i<len;i++){this.context.beginPath();var segment=this.angles[i];if(action===1){this.context.strokeStyle=typeof properties.colorsStroke=='object'?properties.colorsStroke[i]:properties.colorsStroke;}
properties.colors[i]?this.context.fillStyle=properties.colors[i]:null;this.context.lineJoin='round';this.context.arc(segment[2],segment[3],r,(segment[0]),(segment[1]),false);if(properties.variant=='donut'){this.context.arc(segment[2],segment[3],typeof properties.variantDonutWidth=='number'?r-properties.variantDonutWidth:r/2,(segment[1]),(segment[0]),true);}else{this.context.lineTo(segment[2],segment[3]);}
this.context.closePath();action===0?this.context.fill():this.context.stroke();}}
if(properties.labelsSticks){this.drawSticks();var strokeStyle=properties.colorsStroke;}
if(properties.labels){this.drawLabels();}
if(properties.centerpin){this.drawCenterpin();}
if(properties.labelsIngraph){this.drawInGraphLabels();}
if(typeof properties.labelsCenter==='string'){this.drawCenterLabel(properties.labelsCenter);}
if(properties.contextmenu){RGraph.showContext(this);}
if(properties.border){this.context.beginPath();this.context.lineWidth=5;this.context.strokeStyle=properties.borderColor;this.context.arc(this.centerx,this.centery,this.radius-2,0,RGraph.TWOPI,0);this.context.stroke();}
if(properties.key&&properties.key.length){RGraph.drawKey(this,properties.key,properties.colors);}
RGraph.noShadow(this);if(properties.resizable){RGraph.allowResizing(this);}
if(properties.events==true){RGraph.installEventListeners(this);}
if(this.firstDraw){this.firstDraw=false;RGraph.fireCustomEvent(this,'onfirstdraw');this.firstDrawFunc();}
RGraph.fireCustomEvent(this,'ondraw');return this;};this.exec=function(func)
{func(this);return this;};this.drawSegment=function(radians,color,last,index)
{var subTotal=this.subTotal;radians=radians*properties.effectRoundrobinMultiplier;this.context.beginPath();color?this.context.fillStyle=color:null;this.context.strokeStyle=properties.colorsStroke;this.context.lineWidth=0;if(properties.shadow){RGraph.setShadow(this,properties.shadowColor,properties.shadowOffsetx,properties.shadowOffsety,properties.shadowBlur);}
if((typeof properties.exploded=='object'&&properties.exploded[index]>0)||typeof properties.exploded=='number'){var explosion=typeof properties.exploded=='number'?properties.exploded:properties.exploded[index];var x=0;var y=0;var h=explosion;var t=subTotal+(radians/2);var x=(Math.cos(t)*explosion);var y=(Math.sin(t)*explosion);var r=this.radius;this.context.moveTo(this.centerx+x,this.centery+y);}else{var x=0;var y=0;var r=this.radius;}
var startAngle=subTotal;var endAngle=((subTotal+radians));this.context.arc(this.centerx+x,this.centery+y,r,startAngle,endAngle,0);if(properties.variant=='donut'){this.context.arc(this.centerx+x,this.centery+y,typeof properties.variantDonutWidth=='number'?r-properties.variantDonutWidth:r/2,endAngle,startAngle,true);}else{this.context.lineTo(this.centerx+x,this.centery+y);}
this.context.closePath();this.angles.push([subTotal,subTotal+radians,this.centerx+x,this.centery+y]);this.context.fill();this.subTotal+=radians;};this.drawLabels=function()
{if(properties.labels.length&&properties.labelsList){return this.drawLabelsList();}
var hAlignment='left',vAlignment='center',labels=properties.labels,context=this.context,font=properties.textFont,bold=properties.labelsBold,text_size=properties.textSize,cx=this.centerx,cy=this.centery,r=this.radius;RGraph.noShadow(this);this.context.fillStyle='black';this.context.beginPath();if(labels&&labels.length){var textConf=RGraph.getTextConf({object:this,prefix:'labels'});for(i=0;i<this.angles.length;++i){var segment=this.angles[i];if(typeof labels[i]!='string'&&typeof labels[i]!='number'){continue;}
this.context.moveTo(cx,cy);var a=segment[0]+((segment[1]-segment[0])/2),angle=((segment[1]-segment[0])/2)+segment[0];if(typeof properties.exploded==='object'&&properties.exploded[i]||typeof properties.exploded=='number'){var t=((segment[1]-segment[0])/2),seperation=typeof properties.exploded=='number'?properties.exploded:properties.exploded[i];var explosion_offsetx=(Math.cos(angle)*seperation),explosion_offsety=(Math.sin(angle)*seperation);}else{var explosion_offsetx=0,explosion_offsety=0;}
if(properties.labelsSticks){explosion_offsetx+=(Math.cos(angle)*(typeof properties.labelsSticksLength==='object'?properties.labelsSticksLength[i]:properties.labelsSticksLength));explosion_offsety+=(Math.sin(angle)*(typeof properties.labelsSticksLength==='object'?properties.labelsSticksLength[i]:properties.labelsSticksLength));}
var x=cx+explosion_offsetx+((r+10+properties.labelsOffsetRadius)*Math.cos(a))+(properties.labelsSticks?(a<RGraph.HALFPI||a>(RGraph.TWOPI+RGraph.HALFPI)?2:-2):0),y=cy+explosion_offsety+(((r+10+properties.labelsOffsetRadius)*Math.sin(a)));if(this.coordsSticks&&this.coordsSticks[i]){var x=this.coordsSticks[i][4][0]+(x<cx?-5:5),y=this.coordsSticks[i][4][1];}
vAlignment='center';hAlignment=x<cx?'right':'left';this.context.fillStyle=properties.textColor;RGraph.text({object:this,font:textConf.font,size:textConf.size,color:textConf.color,bold:textConf.bold,italic:textConf.italic,x:x,y:y,text:labels[i],valign:vAlignment,halign:hAlignment,tag:'labels',cssClass:RGraph.getLabelsCSSClassName({object:this,name:'labelsClass',index:i})});}
this.context.fill();}};this.drawLabelsList=function()
{var segment=this.angles[i],labels=properties.labels,labels_right=[],labels_left=[],left=[],right=[],centerx=this.centerx,centery=this.centery,radius=this.radius,offset=50
for(var i=0;i<this.angles.length;++i){if(RGraph.isNull(this.data[i])){continue;}
var angle=this.angles[i][0]+((this.angles[i][1]-this.angles[i][0])/2),endpoint_inner=RGraph.getRadiusEndPoint(centerx,centery,angle,radius+5),endpoint_outer=RGraph.getRadiusEndPoint(centerx,centery,angle,radius+30),explosion=[(typeof properties.exploded==='number'?properties.exploded:properties.exploded[i]),(Math.cos(angle)*(typeof properties.exploded==='number'?properties.exploded:properties.exploded[i])),(Math.sin(angle)*(typeof properties.exploded==='number'?properties.exploded:properties.exploded[i]))]
var textConf=RGraph.getTextConf({object:this,prefix:'labels'});if(angle>(-1*RGraph.HALFPI)&&angle<RGraph.HALFPI){labels_right.push([i,angle,labels[i]?labels[i]:'',endpoint_inner,endpoint_outer,textConf.color,RGraph.arrayClone(explosion)]);}else{labels_left.push([i,angle,labels[i]?labels[i]:'',endpoint_inner,endpoint_outer,textConf.color,RGraph.arrayClone(explosion)]);}}
var vspace_right=(this.canvas.height-properties.marginTop-properties.marginBottom)/labels_right.length;for(var i=0,y=(properties.marginTop+(vspace_right/2));i<labels_right.length;y+=vspace_right,i++){if(labels_right[i][2]){var x=this.centerx+this.radius+offset,idx=labels_right[i][0],explosionX=labels_right[i][6][0]?labels_right[i][6][1]:0,explosionY=labels_right[i][6][0]?labels_right[i][6][2]:0
var ret=RGraph.text({object:this,font:textConf.font,size:textConf.size,color:textConf.color,bold:textConf.bold,italic:textConf.italic,x:x+explosionX+properties.labelsListRightOffsetx,y:y+explosionY+properties.labelsListRightOffsety,text:labels_right[i][2],valign:'center',halign:'left',tag:'labels',color:labels_right[i][5],cssClass:RGraph.getLabelsCSSClassName({object:this,name:'labelsClass',index:i})});if(ret&&ret.node){ret.node.__index__=labels_right[i][0];}
this.path('lc round lw % b m % % qc % % % % s %',properties.labelsSticksLinewidth,labels_right[i][3][0]+explosionX,labels_right[i][3][1]+explosionY,labels_right[i][4][0]+explosionX,labels_right[i][4][1]+explosionY,ret.x-5,ret.y+(ret.height/2),labels_right[i][5]);this.path('b a % % 2 0 6.2830 false, f %',ret.x-5,ret.y+(ret.height/2),labels_right[i][5]);}}
var vspace_left=(this.canvas.height-properties.marginTop-properties.marginBottom)/labels_left.length
for(var i=(labels_left.length-1),y=(properties.marginTop+(vspace_left/2));i>=0;y+=vspace_left,i--){if(labels_left[i][2]){var x=this.centerx-this.radius-offset,idx=labels_left[i][0],explosionX=labels_left[i][6][0]?labels_left[i][6][1]:0,explosionY=labels_left[i][6][0]?labels_left[i][6][2]:0
var ret=RGraph.text({object:this,font:textConf.font,size:textConf.size,color:textConf.color,bold:textConf.bold,italic:textConf.italic,x:x+explosionX+properties.labelsListLeftOffsetx,y:y+explosionY+properties.labelsListLeftOffsety,text:labels_left[i][2],valign:'center',halign:'right',tag:'labels',cssClass:RGraph.getLabelsCSSClassName({object:this,name:'labelsClass',index:i})});if(ret&&ret.node){ret.node.__index__=labels_left[i][0];}
this.path('lw % b m % % qc % % % % s %',properties.labelsSticksLinewidth,labels_left[i][3][0]+explosionX,labels_left[i][3][1]+explosionY,labels_left[i][4][0]+explosionX,Math.round(labels_left[i][4][1]+explosionY),ret.x+5+ret.width,ret.y+(ret.height/2),labels_left[i][5]);this.path('b a % % 2 0 6.2830 false, f %',ret.x+5+ret.width,ret.y+(ret.height/2),labels_left[i][5]);}}};this.drawSticks=function()
{var offset=properties.linewidth/2,exploded=properties.exploded,sticks=properties.labelsSticks,colors=properties.colors,cx=this.centerx,cy=this.centery,radius=this.radius,points=[],linewidth=properties.labelsSticksLinewidth
for(var i=0,len=this.angles.length;i<len;++i){var segment=this.angles[i];if(typeof sticks==='object'&&!sticks[i]){continue;}
var radians=segment[1]-segment[0];this.context.beginPath();this.context.strokeStyle=typeof properties.labelsSticksColors==='string'?properties.labelsSticksColors:(!RGraph.isNull(properties.labelsSticksColors)?properties.labelsSticksColors[i]:'gray');this.context.lineWidth=linewidth;if(typeof properties.labelsSticksColor==='string'){this.context.strokeStyle=properties.labelsSticksColor;}
var midpoint=(segment[0]+(radians/2));if(typeof exploded==='object'&&exploded[i]){var extra=exploded[i];}else if(typeof exploded==='number'){var extra=exploded;}else{var extra=0;}
var stickLength=typeof properties.labelsSticksLength==='object'?properties.labelsSticksLength[i]:properties.labelsSticksLength;points[0]=RGraph.getRadiusEndPoint(cx,cy,midpoint,radius+extra+offset);points[1]=RGraph.getRadiusEndPoint(cx,cy,midpoint,radius+stickLength+extra-5);points[2]=RGraph.getRadiusEndPoint(cx,cy,midpoint,radius+stickLength+extra+properties.labelsOffsetRadius);points[3]=RGraph.getRadiusEndPoint(cx,cy,midpoint,radius+stickLength+extra+properties.labelsOffsetRadius);points[3][0]+=(points[3][0]>cx?5:-5);points[4]=[points[2][0]+(points[2][0]>cx?5+properties.labelsSticksHlength:-5-properties.labelsSticksHlength),points[2][1]];this.context.moveTo(points[0][0],points[0][1]);this.context.quadraticCurveTo(points[2][0],points[2][1],points[4][0],points[4][1]);this.context.stroke();this.coordsSticks[i]=[points[0],points[1],points[2],points[3],points[4]];}};this.getShape=function(e)
{var accuracy=arguments[1]?arguments[1]:0;var canvas=this.canvas;var context=this.context;var mouseCoords=RGraph.getMouseXY(e);var mouseX=mouseCoords[0];var mouseY=mouseCoords[1];var r=this.radius;var angles=this.angles;for(var i=0,len=angles.length;i<len;++i){this.path('b ss rgba(0,0,0,0) a % % % % % false',angles[i][2],angles[i][3],this.radius,angles[i][0],angles[i][1]);if(this.type==='pie'&&properties.variant.indexOf('donut')!==-1){this.path('a % % % % % true',angles[i][2],angles[i][3],(typeof properties.variantDonutWidth=='number'?this.radius-properties.variantDonutWidth:this.radius/2),angles[i][1],angles[i][0]);}else{this.path('l % %',angles[i][2],angles[i][3]);}
this.path('c');if(!this.context.isPointInPath(mouseX,mouseY)){continue;}
if(angles[i][0]<0)angles[i][0]+=RGraph.TWOPI;if(angles[i][1]>RGraph.TWOPI)angles[i][1]-=RGraph.TWOPI;if(RGraph.parseTooltipText&&properties.tooltips){var tooltip=RGraph.parseTooltipText(properties.tooltips,i);}
return{object:this,x:angles[i][2],y:angles[i][3],radius:this.radius,angleStart:angles[i][0],angleEnd:angles[i][1],index:i,dataset:0,sequentialIndex:i,label:properties.labels&&typeof properties.labels[i]==='string'?properties.labels[i]:null,tooltip:typeof tooltip==='string'?tooltip:null};}
return null;};this.drawBorders=function()
{if(properties.linewidth>0){this.context.lineWidth=properties.linewidth;this.context.strokeStyle=properties.colorsStroke;var r=this.radius;for(var i=0,len=this.angles.length;i<len;++i){var segment=this.angles[i];this.context.beginPath();this.context.arc(segment[2],segment[3],r,(segment[0]),(segment[0]+0.001),0);this.context.arc(segment[2],segment[3],properties.variant=='donut'?(typeof properties.variantDonutWidth=='number'?this.radius-properties.variantDonutWidth:r/2):r,segment[0],segment[0]+0.0001,0);this.context.closePath();this.context.stroke();}}};this.getRadius=function()
{this.graph={width:this.canvas.width-properties.marginLeft-properties.marginRight,height:this.canvas.height-properties.marginTop-properties.marginBottom};if(typeof properties.radius=='number'){this.radius=properties.radius;}else{this.radius=Math.min(this.graph.width,this.graph.height)/2;}
return this.radius;};this.explodeSegment=function(index,size)
{if(typeof this.exploding==='number'&&this.exploding===index){return;}
if(!properties.exploded){properties.exploded=[];}
if(typeof properties.exploded==='number'){var original_explode=properties.exploded;var exploded=properties.exploded;properties.exploded=[];for(var i=0,len=this.data.length;i<len;++i){properties.exploded[i]=exploded;}}
properties.exploded[index]=typeof original_explode=='number'?original_explode:0;this.exploding=index;var delay=RGraph.ISIE&&!RGraph.ISIE10?25:16.666;var obj=this;for(var o=0;o<size;++o){setTimeout(function()
{properties.exploded[index]+=1;RGraph.clear(obj.canvas);RGraph.redrawCanvas(obj.canvas);},o*delay);}
var obj=this;setTimeout(function()
{obj.exploding=null;},size*delay);};this.highlight_segment=function(segment)
{this.context.beginPath();this.context.strokeStyle=properties.highlightStyleTwodStroke;this.context.fillStyle=properties.highlightStyleTwodFill;this.context.moveTo(segment[0],segment[1]);this.context.arc(segment[0],segment[1],segment[2],this.angles[segment[5]][0],this.angles[segment[5]][1],0);this.context.lineTo(segment[0],segment[1]);this.context.closePath();this.context.stroke();this.context.fill();};this.highlight=function(shape)
{if(properties.tooltipsHighlight){if(typeof properties.highlightStyle==='function'){(properties.highlightStyle)(shape);}else if(properties.highlightStyle==='invert'){for(var i=0;i<this.angles.length;++i){if(i!==shape.index){this.path('b lw % m % % a % % % % % false c s % f %',properties.highlightStyleTwodLinewidth,this.angles[i][2],this.angles[i][3],this.angles[i][2],this.angles[i][3],shape.radius,this.angles[i][0],this.angles[i][1],properties.highlightStyleTwodStroke,properties.highlightStyleTwodFill);}}}else if(properties.highlightStyle=='3d'){this.context.lineWidth=1;var extent=2;this.context.beginPath();RGraph.noShadow(this);this.context.fillStyle='rgba(0,0,0,0)';this.context.arc(shape.x,shape.y,shape.radius,shape.angleStart,shape.angleEnd,false);if(properties.variant=='donut'){this.context.arc(shape.x,shape.y,shape.radius/5,shape.angleEnd,shape.angleStart,true);}else{this.context.lineTo(shape.x,shape.y);}
this.context.closePath();this.context.fill();this.context.beginPath();this.context.shadowColor='#666';this.context.shadowBlur=3;this.context.shadowOffsetX=3;this.context.shadowOffsetY=3;this.context.fillStyle=properties.colors[shape.index];this.context.strokeStyle=properties.colorsStroke;this.context.arc(shape.x-extent,shape.y-extent,shape.radius,shape.angleStart,shape.angleEnd,false);if(properties.variant=='donut'){this.context.arc(shape.x-extent,shape.y-extent,shape.radius/2,shape.angleEnd,shape.angleStart,true)}else{this.context.lineTo(shape.x-extent,shape.y-extent);}
this.context.closePath();this.context.stroke();this.context.fill();RGraph.noShadow(this);if(properties.border){this.context.beginPath();this.context.strokeStyle=properties.borderColor;this.context.lineWidth=5;this.context.arc(shape.x-extent,shape.y-extent,shape.radius-2,shape.angleStart,shape.angleEnd,false);this.context.stroke();}}else if(properties.highlightStyle==='outline'){var tooltip=RGraph.Registry.get('tooltip'),index=tooltip.__index__,coords=this.angles[index],color=this.get('colors')[index]
width=this.radius/12.5;if(typeof properties.highlightStyleOutlineWidth==='number'){width=properties.highlightStyleOutlineWidth;}
this.path('ga 0.25 b a % % % % % false a % % % % % true c f % ga 1',coords[2],coords[3],this.radius+2+width,coords[0],coords[1],coords[2],coords[3],this.radius+2,coords[1],coords[0],color);}else{this.context.beginPath();this.context.strokeStyle=properties.highlightStyleTwodStroke;this.context.fillStyle=properties.highlightStyleTwodFill;if(properties.variant.indexOf('donut')>-1){this.context.arc(shape.x,shape.y,shape.radius,shape.angleStart,shape.angleEnd,false);this.context.arc(shape.x,shape.y,typeof properties.variantDonutWidth=='number'?this.radius-properties.variantDonutWidth:shape.radius/2,shape.angleEnd,shape.angleStart,true);}else{this.context.arc(shape.x,shape.y,shape.radius+1,shape.angleStart,shape.angleEnd,false);this.context.lineTo(shape.x,shape.y);}
this.context.closePath();this.context.stroke();this.context.fill();}}};this.getObjectByXY=function(e)
{if(this.getShape(e)){return this;}};this.drawCenterpin=function()
{if(typeof properties.centerpin==='number'&&properties.centerpin>0){var cx=this.centerx;var cy=this.centery;this.context.beginPath();this.context.strokeStyle=properties.centerpinStroke?properties.centerpinStroke:properties.colorsStroke;this.context.fillStyle=properties.centerpinFill?properties.centerpinFill:properties.colorsStroke;this.context.moveTo(cx,cy);this.context.arc(cx,cy,properties.centerpin,0,RGraph.TWOPI,false);this.context.stroke();this.context.fill();}};this.drawInGraphLabels=function()
{var context=this.context;var cx=this.centerx;var cy=this.centery;var radius=properties.labelsIngraphRadius;if(radius<=2&&radius>0){radiusFactor=radius;}else{radiusFactor=0.5;}
if(properties.variant=='donut'){var r=this.radius*(0.5+(radiusFactor*0.5));if(typeof properties.variantDonutWidth=='number'){var r=(this.radius-properties.variantDonutWidth)+(properties.variantDonutWidth/2);}}else{var r=this.radius*radiusFactor;}
if(radius>2){r=radius;}
for(var i=0,len=this.angles.length;i<len;++i){if(typeof properties.exploded=='object'&&typeof properties.exploded[i]=='number'){var explosion=properties.exploded[i];}else if(typeof properties.exploded=='number'){var explosion=parseInt(properties.exploded);}else{var explosion=0;}
var angleStart=this.angles[i][0];var angleEnd=this.angles[i][1];var angleCenter=((angleEnd-angleStart)/2)+angleStart;var coords=RGraph.getRadiusEndPoint(this.centerx,this.centery,angleCenter,r+(explosion?explosion:0)+properties.labelsIngraphOffsetRadius);var x=coords[0];var y=coords[1];var text=properties.labelsIngraphSpecific&&typeof properties.labelsIngraphSpecific[i]=='string'?properties.labelsIngraphSpecific[i]:RGraph.numberFormat({object:this,number:this.data[i].toFixed(properties.labelsIngraphDecimals),unitspre:properties.labelsIngraphUnitsPre,unitspost:properties.labelsIngraphUnitsPost,point:properties.labelsIngraphPoint,thousand:properties.labelsIngraphThousand});if(text){this.context.beginPath();var textConf=RGraph.getTextConf({object:this,prefix:'labelsIngraph'});RGraph.text({object:this,font:textConf.font,size:textConf.size,color:textConf.color,bold:textConf.bold,italic:textConf.italic,x:x,y:y,text:text,valign:'center',halign:'center',bounding:properties.labelsIngraphBounding,boundingFill:properties.labelsIngraphBoundingFill,boundingStroke:properties.labelsIngraphBoundingStroke,tag:'labels.ingraph'});this.context.stroke();}}};this.drawCenterLabel=function(label)
{var textConf=RGraph.getTextConf({object:this,prefix:'labelsCenter'});RGraph.text({object:this,font:textConf.font,size:textConf.size,color:textConf.color,bold:textConf.bold,italic:textConf.italic,x:this.centerx+properties.labelsCenterOffsetx,y:this.centery+properties.labelsCenterOffsety,halign:'center',valign:'center',text:label,bounding:true,boundingFill:'rgba(255,255,255,0.7)',boundingStroke:'rgba(0,0,0,0)',tag:'labels.center'});};this.getAngle=function(value)
{if(value>this.total){return null;}
var angle=(value/this.total)*RGraph.TWOPI;angle+=properties.origin;return angle;};this.parseColors=function()
{if(this.original_colors.length===0){this.original_colors.colors=RGraph.arrayClone(properties.colors);this.original_colors.keyColors=RGraph.arrayClone(properties.keyColors);this.original_colors.colorsStroke=RGraph.arrayClone(properties.colorsStroke);this.original_colors.highlightStroke=RGraph.arrayClone(properties.highlightStroke);this.original_colors.highlightStyleTwodFill=RGraph.arrayClone(properties.highlightStyleTwodFill);this.original_colors.highlightStyleTwodStroke=RGraph.arrayClone(properties.highlightStyleTwodStroke);this.original_colors.labelsIngraphBoundingFill=RGraph.arrayClone(properties.labelsIngraphBoundingFill);this.original_colors.labelsIngraphColor=RGraph.arrayClone(properties.labelsIngraphColor);}
for(var i=0;i<properties.colors.length;++i){properties.colors[i]=this.parseSingleColorForGradient(properties.colors[i]);}
var keyColors=properties.keyColors;if(keyColors){for(var i=0;i<keyColors.length;++i){keyColors[i]=this.parseSingleColorForGradient(keyColors[i]);}}
properties.colorsStroke=this.parseSingleColorForGradient(properties.colorsStroke);properties.highlightStroke=this.parseSingleColorForGradient(properties.highlightStroke);properties.highlightStyleTwodFill=this.parseSingleColorForGradient(properties.highlightStyleTwodFill);properties.highlightStyleTwodStroke=this.parseSingleColorForGradient(properties.highlightStyleTwodStroke);properties.labelsIngraphBoundingFill=this.parseSingleColorForGradient(properties.labelsIngraphBoundingFill);properties.labelsIngraphColor=this.parseSingleColorForGradient(properties.labelsIngraphColor);};this.reset=function()
{};this.parseSingleColorForGradient=function(color)
{if(!color||typeof color!='string'){return color;}
if(color.match(/^gradient\((.*)\)$/i)){if(color.match(/^gradient\(({.*})\)$/i)){return RGraph.parseJSONGradient({object:this,def:RegExp.$1});}
var parts=RegExp.$1.split(':');if(properties.variant=='donut'){var radius_start=typeof properties.variantDonutWidth=='number'?this.radius-properties.variantDonutWidth:this.radius/2;}else{var radius_start=0;}
var grad=this.context.createRadialGradient(this.centerx,this.centery,radius_start,this.centerx,this.centery,Math.min(this.canvas.width-properties.marginLeft-properties.marginRight,this.canvas.height-properties.marginTop-properties.marginBottom)/2);var diff=1/(parts.length-1);grad.addColorStop(0,RGraph.trim(parts[0]));for(var j=1;j<parts.length;++j){grad.addColorStop(j*diff,RGraph.trim(parts[j]));}}
return grad?grad:color;};this.interactiveKeyHighlight=function(index)
{if(this.angles&&this.angles[index]){var segment=this.angles[index];var x=segment[2];var y=segment[3];var start=segment[0];var end=segment[1];this.context.strokeStyle=properties.keyInteractiveHighlightChartStroke;this.context.fillStyle=properties.keyInteractiveHighlightChartFill;this.context.lineWidth=2;this.context.lineJoin='bevel';this.context.beginPath();this.context.moveTo(x,y);this.context.arc(x,y,this.radius,start,end,false);this.context.closePath();this.context.fill();this.context.stroke();}};this.on=function(type,func)
{if(type.substr(0,2)!=='on'){type='on'+type;}
if(typeof this[type]!=='function'){this[type]=func;}else{RGraph.addCustomEventListener(this,type,func);}
return this;};this.firstDrawFunc=function()
{};this.draw3d=function()
{var scaleX=1.5,depth=properties.variantThreedDepth,prop_shadow=properties.shadow,prop_labels=properties.labels,prop_labelsSticks=properties.labelsSticks
this.set({labels:[],labelsSticks:false,strokestyle:'rgba(0,0,0,0)'});this.set({variant:this.get('variant').replace(/3d/,'')});this.context.setTransform(scaleX,0,0,1,(this.canvas.width*(scaleX)-this.canvas.width)* -0.5,0);for(var i=depth;i>0;i-=1){this.set({centeryAdjust:i});if(i===parseInt(depth/2)){this.set({labels:prop_labels,labelsSticks:prop_labelsSticks});}
if(i===0){this.set({shadow:prop_shadow});}
this.draw();this.set('shadow',false);if(i<=parseInt(depth/2)){this.set({labels:[],labelsSticks:false});}
if(i>1){if(properties.variant.indexOf('donut')!==-1){for(var j=0;j<this.angles.length;++j){var x=this.angles[j][2];var y=this.angles[j][3];var r1=this.radius;var r2=this.radius/2;var a1=this.angles[j][0];var a2=this.angles[j][1];this.path('b a % % % % % false a % % % % % true f rgba(0,0,0,0.15)',x,y,r1,a1,a2,x,y,r2,a2,a1);}}else{for(var j=0;j<this.angles.length;++j){var x=this.angles[j][2];var y=this.angles[j][3];var r1=this.radius;var r2=this.radius/2;var a1=this.angles[j][0];var a2=this.angles[j][1];this.path('b m % % a % % % % % false f rgba(0,0,0,0.15)',x,y,x,y,r1+1,a1,a2);}}}}
this.set({variant:this.get('variant')+'3d',shadow:prop_shadow,labels:prop_labels,labelsSticks:prop_labelsSticks});return this;};this.explode=function()
{var obj=this;var opt=arguments[0]?arguments[0]:{};var callback=arguments[1]?arguments[1]:function(){};var frames=opt.frames?opt.frames:30;var frame=0;var maxExplode=Number(typeof opt.radius==='number'?opt.radius:Math.max(this.canvas.width,this.canvas.height));var currentExplode=Number(obj.get('exploded'))||0;var step=(maxExplode-currentExplode)/frames;this.set('labels',null);var iterator=function()
{obj.set('exploded',currentExplode+(step*frame));RGraph.clear(obj.canvas);RGraph.redrawCanvas(obj.canvas);if(frame++<frames){RGraph.Effects.updateCanvas(iterator);}else{callback(obj);}}
iterator();return this;};this.grow=function()
{var obj=this;var canvas=obj.canvas;var opt=arguments[0]?arguments[0]:{};var frames=opt.frames||30;var frame=0;var callback=arguments[1]?arguments[1]:function(){};var radius=obj.getRadius();properties.radius=0;var iterator=function()
{obj.set('radius',(frame/frames)*radius);RGraph.redrawCanvas(canvas);if(frame++<frames){RGraph.Effects.updateCanvas(iterator);}else{RGraph.redrawCanvas(obj.canvas);callback(obj);}};iterator();return this;};this.roundRobin=function()
{var obj=this,opt=arguments[0]||{},callback=arguments[1]||function(){},frame=0,frames=opt.frames||30,radius=obj.getRadius(),labels=obj.get('labels')
obj.set('events',false);obj.set('labels',[]);var iterator=function()
{obj.set('effectRoundrobinMultiplier',RGraph.Effects.getEasingMultiplier(frames,frame));RGraph.redrawCanvas(obj.canvas);if(frame<frames){RGraph.Effects.updateCanvas(iterator);frame++;}else{obj.set({events:true,labels:labels});RGraph.redrawCanvas(obj.canvas);callback(obj);}};iterator();return this;};this.implode=function()
{var obj=this,opt=arguments[0]||{},callback=arguments[1]||function(){},frames=opt.frames||30,frame=0,explodedMax=Math.max(this.canvas.width,this.canvas.height),exploded=explodedMax;function iterator()
{exploded=explodedMax-((frame/frames)*explodedMax);obj.set('exploded',exploded);RGraph.clear(obj.canvas);RGraph.redrawCanvas(obj.canvas);if(frame++<frames){RGraph.Effects.updateCanvas(iterator);}else{RGraph.clear(obj.canvas);RGraph.redrawCanvas(obj.canvas);callback(obj);}}
iterator();return this;};this.tooltipSubstitutions=function(opt)
{return{index:opt.index,dataset:0,sequentialIndex:opt.index,value:this.data[opt.index],values:[this.data[opt.index]]};};this.tooltipsFormattedCustom=function(specific,index,colors)
{var color=colors[specific.index];var label=((typeof properties.tooltipsFormattedKeyLabels==='object'&&typeof properties.tooltipsFormattedKeyLabels[specific.index]==='string')?properties.tooltipsFormattedKeyLabels[specific.index]:'');return{color:color,label:label};};this.positionTooltipStatic=function(args)
{var obj=args.object,e=args.event,tooltip=args.tooltip,index=args.index,canvasXY=RGraph.getCanvasXY(obj.canvas)
segment=this.angles[args.index],angle=((segment[1]-segment[0])/2)+segment[0],multiplier=0.5;if(properties.variant.indexOf('donut')>=0){if(RGraph.isNull(properties.variantDonutWidth)){var radius=(this.radius/2)+(this.radius/4);}else{var radius=(this.radius-properties.variantDonutWidth)+(properties.variantDonutWidth/2);}}else{var radius=this.radius*multiplier;}
var explosion=typeof properties.exploded=='number'?properties.exploded:properties.exploded[index];var endpoint=RGraph.getRadiusEndPoint(this.centerx,this.centery,angle,radius+(explosion||0));if(properties.variant.indexOf('3d')>0){var width=properties.variantDonutWidth==='number'?properties.variantDonutWidth:this.radius/2;endpoint[0]=(endpoint[0]-this.centerx)*1.5+this.centerx;}
args.tooltip.style.left=(canvasXY[0]
+endpoint[0]
-(tooltip.offsetWidth/2)
+obj.properties.tooltipsOffsetx)+'px';args.tooltip.style.top=(canvasXY[1]
+endpoint[1]
-tooltip.offsetHeight
+obj.properties.tooltipsOffsety
-10)+'px';};RGraph.register(this);RGraph.parseObjectStyleConfig(this,conf.options);};