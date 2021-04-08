var http=require('http');
//var server=http.createServer(function(req,res){
var server=http.createServer((req,res)=>{
    var sampleJSON={
        name :'Priyamvada',
        addr :'Marol',
        qualification :'graduate'
    }
    res.writeHead(200,{'content-type' :'application/json'});
    res.write(JSON.stringify(sampleJSON));
    res.end();
});
server.listen(5000)

