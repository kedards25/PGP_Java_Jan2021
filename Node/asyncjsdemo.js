var async=require('async')
var fs=require('fs')

var sampleTxt="Sample Text written";

async.series([
        function(callback){
        console.log("Making directory");
        fs.mkdir('sampleDir',(err)=>{
            if(err){
            console.log('error while creating directory')
            return callback(err)
        };
            callback();
        });
        },
        function(callback){
            console.log("Writing to file");
            fs.writeFile('.//sampleDir//sampleFile.txt',sampleTxt,(err)=>{
                if(err){
                console.log('error while creating directory')
                return callback(err)
            };
                callback();
            });
            },
            function(callback){
                console.log("Reading file");
                fs.readFile('.//sampleDir//sampleFile.txt','utf8',(err,data)=>{
                    if(err){
                        console.log('error while creating directory')
                        return callback(err)
                    }
                    else
                    {
                        console.log(data)
                    }
                    callback(); 
                });  
                },
                function(callback){
                    console.log("Writing to file");
                    fs.unlink('.//sampleDir//sampleFile.txt',(err)=>{
                        if(err){
                        console.log('error while creating directory')
                        return callback(err)
                    };
                        callback();
                    });
                    },
                    function(callback){
                        console.log("Making directory");
                        fs.rmdir('sampleDir',(err)=>{
                            if(err){
                            console.log('error while creating directory')
                            return callback(err)
                        };
                            callback();
                        });
                        },

],  function(err,data){
    if(err)
    {
        console.log(err)
        throw err;
    }
    // else{
    //     console.log(data)
    // }
    console.log("Done!!")
});