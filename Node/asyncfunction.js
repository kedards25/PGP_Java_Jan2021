var inputFile=require('fs');
var data=inputFile.readFile(
                        'myfile.txt',
                        'utf-8',
                        function(err,data){
                            if(err)
                            {
                                console.log("Error Occurred: "+err);
                            }
                            else{
                                console.log(data)
                            }
});
console.log("done!!")