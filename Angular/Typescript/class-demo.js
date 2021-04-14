var Demo = /** @class */ (function () {
    function Demo() {
        this.num = 7;
    }
    Demo.prototype.dispNum = function () {
        console.log("Numeric Value: " + this.num);
    };
    return Demo;
}());
var demo = new Demo();
demo.dispNum();
