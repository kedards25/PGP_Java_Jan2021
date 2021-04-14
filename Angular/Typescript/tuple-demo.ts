//tuple supports values of multiple types
//whereas array supports values of single data type
var tuple_demo=[25,'fruits',56.25];

console.log("Initial size: "+tuple_demo.length);

tuple_demo.push('test');        //element will be appended in tuple_demo

console.log(tuple_demo[0]);
console.log(tuple_demo[1]);
console.log(tuple_demo[2]);
console.log(tuple_demo[3]);

console.log("After addition of an element: "+tuple_demo.length);

console.log(tuple_demo.pop()+" has been popped out of tuple");

console.log("After removal of an element: "+tuple_demo.length);
