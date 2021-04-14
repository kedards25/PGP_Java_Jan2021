var IfDemo = /** @class */ (function () {
    function IfDemo() {
        this.num2 = 5;
    }
    IfDemo.prototype.dispNum = function () {
        if (this.num2 % 2 == 0) {
            console.log("Even");
        }
        else {
            console.log("Odd");
        }
    };
    return IfDemo;
}());
var ifDemo = new IfDemo();
ifDemo.dispNum();
