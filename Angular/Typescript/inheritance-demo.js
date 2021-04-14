var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var DemoP1 = /** @class */ (function () {
    function DemoP1() {
        this.userNm = 'Anjali';
    }
    return DemoP1;
}());
var DemoC1 = /** @class */ (function (_super) {
    __extends(DemoC1, _super);
    function DemoC1() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    DemoC1.prototype.greet = function () {
        console.log("Good Morning: " + this.userNm);
    };
    return DemoC1;
}(DemoP1));
var demoC1 = new DemoC1();
demoC1.greet();
