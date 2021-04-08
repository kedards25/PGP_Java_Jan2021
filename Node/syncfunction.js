var inputfile=require('fs')
var data=inputfile.readFileSync('myfile.txt','utf-8');
console.log(data);
console.log('done!!');
