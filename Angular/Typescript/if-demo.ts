class IfDemo
{
    num2:number;

    constructor()
    {
        this.num2=5;
    }

    dispNum():void{
       if(this.num2%2==0)
       {
           console.log("Even");
       }
       else{
           console.log("Odd");
       }
    }

}

var ifDemo=new IfDemo();
ifDemo.dispNum();