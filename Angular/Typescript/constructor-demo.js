var Demo2 = /** @class */ (function () {
    function Demo2() {
        this.num2 = 5;
    }
    Demo2.prototype.dispNum = function () {
        console.log("Numeric Value: " + this.num2);
    };
    return Demo2;
}());
var demo2 = new Demo2();
demo2.dispNum();
