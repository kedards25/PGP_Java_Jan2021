//following approach does not work
// function show(usr:string):void{
//     console.log("Good Morning: "+usr);
// }
// function show(num:number):void{
//     console.log("value : "+num);
// }
// function show():void{
//     console.log("Welcome Here");
// }
// show('Kedar');
// show(5);
// show();
//hence we can use 'any' data type to work with various data types
function show(usr) {
    console.log("Sample Message: " + usr);
}
show('Kedar');
show(5);
