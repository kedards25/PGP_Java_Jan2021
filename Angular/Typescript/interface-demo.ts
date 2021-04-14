interface DemoP2
{
    userNm:string;

    //methods are abstract
    //that means methods are without body
    disp():void;
}

class DemoC2 implements DemoP2{

    userNm:string='Shivani';

    disp(): void {
        console.log("Welcome to typescript");
    }

    greet():void{
        console.log("Good Morning: "+this.userNm)
    }
}

var demoC2=new DemoC2();
demoC2.greet();
demoC2.disp();