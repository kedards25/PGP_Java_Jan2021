var dateModule=require('./datemodule');
var http=require('http');

http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'});
    res.write('Current Date: '+dateModule.currDate());
    res.end();
}).listen(5000);