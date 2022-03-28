//function declaration
/*function calcAge(birthYear)
{
    return 2022-birthYear;
}
const age=calcAge(1991);
console.log(age);
//Function expression
const calcAge1=function(birthYear)
{
    return new Date().getFullYear()-birthYear;
}
const age1=calcAge1(1990);
console.log(age1);
//Arrow function
const calcAge2=(birthYear)=>{2022-birthYear};
const age2=calcAge2(1989);
console.log(age2);
//()=>{};
let add=(a,b)=>a+b;*/
//callback function calling one function from another
/*function one(call_two)
{
    call_two();
    console.log("The first step");
    
}
function two()
{
    console.log("The second step");
}
one(two);*/
//Function Returning Functions
/*const greet=function(greting)
{
    return function(name)
    {
        console.log(`${greting} ${name}`);
    };
};
const greetHey=greet('Hey');
greetHey('john')
greetHey('Jack')
greet('Hello')('Jonas');
//Arrow function
const greetArr=greeting=>name=>console.log(`${greeting} ${name}`);
greetArr("Hi")("Hary");*/
//IIFE (Immediately Invoked Function Expressions)
/*(function()
{
    console.log("This will never run again");
    var x=10;
})();
(()=>console.log("This will also never run again"))();*/
//function arguments
/*function add()
{
    for(var i=0,result=0;i<arguments.length;i++)
    {
        result+=arguments[i];
    }
    return result;
}
console.log(add(10,20));
console.log(add(20,30,40));
console.log(add(10,"Hi"));
console.log(add(10,20,"Hi"));*/
//clousers function reference variable from outer scope in inner scope
let x; //outerscope variable
const y=function()
{
    const a=12; //inner scope variable
    x=function()
    {
        console.log(a+5);
    };
};
y();
x();
