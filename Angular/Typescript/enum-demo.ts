enum Days{
    'Sun'=0,
    'Mon',
    'Tues',
    'Sat'
}

class EnumDemo{

    dispEnum():void{
        var x:number=Days.Mon;
        var y:number=Days.Sat;

        console.log("Monday: "+x+" Saturday: "+y);
    }
}

var enumDemo=new EnumDemo();
enumDemo.dispEnum();