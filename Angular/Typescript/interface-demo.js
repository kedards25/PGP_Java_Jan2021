var DemoC2 = /** @class */ (function () {
    function DemoC2() {
        this.userNm = 'Shivani';
    }
    DemoC2.prototype.disp = function () {
        console.log("Welcome to typescript");
    };
    DemoC2.prototype.greet = function () {
        console.log("Good Morning: " + this.userNm);
    };
    return DemoC2;
}());
var demoC2 = new DemoC2();
demoC2.greet();
demoC2.disp();
