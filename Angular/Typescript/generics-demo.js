var GenericsDemo = /** @class */ (function () {
    function GenericsDemo() {
    }
    GenericsDemo.prototype.add = function (n1, n2) {
        return n1 + n2;
    };
    return GenericsDemo;
}());
var genericDemo = new GenericsDemo();
var sum = genericDemo.add(5, 7);
console.log("Sum of numbers: " + sum);
var genericDemo2 = new GenericsDemo();
var statement = genericDemo2.add('Good ', 'Morning');
console.log("Greeting: " + statement);
