//datatypes
/*let x:number;
let y:string;
let z:boolean;
x=10;
console.log(x);
//function
//example 1
type mathFunc=(a:number,b:number)=>number;
//const add=(a:number,b:number):number=>a+b;
//const mul=(a:number,b:number):number=>a*b;
const add:mathFunc=(a,b)=>a+b;
const mul:mathFunc=(a,b)=>a*b;
console.log(add(2,3));
console.log(mul(10,20));
//example 2
type calc=(a:number,b:number,c:string)=>number;
const calculator:calc=(a,b,choice)=>{
 if(choice=="add")
 {
     return a+b;
 }
 else if(choice=="minus")
 {
     return a-b;
 }
 else
 {
     return 0;
 }
}
console.log(calculator(10,2,"minus"));*/
//type example
/*type User=
{
    name:string;
    age:number;
    isAdmin:boolean;
    permission?:string[];
}
const user:User={
    name:"John",
    age:23,
    isAdmin:true,
}
const user1:User={
    name:"Jack",
    age:33,
    isAdmin:true,
    permission:["manager","instructor","admin"],
}
console.log(user);*/

//class
class student
{
   readonly fname:string;
   private age:number;
    public lname:string;
    constructor(fname:string,age:number,lname:string)
    {
        this.fname=fname;
        this.age=age;
        this.lname=lname;
    }
    getInfo()
    {
        return `name ${this.fname} ${this.lname} and age ${this.age}`;
    }
}
const s1=new student("john",23,"thomas");
const s2=new student("jack",34,"thomas");
const students=[s1,s2];


//console.log(s1);
//console.log(s2);
students.forEach(st=>{
    console.log(st.getInfo());
})
