var Days;
(function (Days) {
    Days[Days["Sun"] = 0] = "Sun";
    Days[Days["Mon"] = 1] = "Mon";
    Days[Days["Tues"] = 2] = "Tues";
    Days[Days["Sat"] = 3] = "Sat";
})(Days || (Days = {}));
var EnumDemo = /** @class */ (function () {
    function EnumDemo() {
    }
    EnumDemo.prototype.dispEnum = function () {
        var x = Days.Mon;
        var y = Days.Sat;
        console.log("Monday: " + x + " Saturday: " + y);
    };
    return EnumDemo;
}());
var enumDemo = new EnumDemo();
enumDemo.dispEnum();
