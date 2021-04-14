class DemoP1
{
    userNm:string='Anjali';
}

class DemoC1 extends DemoP1{
    greet():void{
        console.log("Good Morning: "+this.userNm)
    }
}

var demoC1=new DemoC1();
demoC1.greet();