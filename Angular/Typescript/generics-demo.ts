class GenericsDemo<T>{
    add<T>(n1:T,n2):T
    {
        return n1+n2;
    }
}

let genericDemo=new GenericsDemo();
let sum=genericDemo.add<number>(5,7);
console.log("Sum of numbers: "+sum);

let genericDemo2=new GenericsDemo();
let statement=genericDemo2.add<string>('Good ','Morning');
console.log("Greeting: "+statement);