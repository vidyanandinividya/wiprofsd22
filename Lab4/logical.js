var a=true, b=false;
var c=4;
//AND
console.log(a&&a); //true
console.log(a&&b); //false
console.log((c>2) && (c<2)); //false
//OR
console.log(a||b); //true
console.log(b||b); //false
console.log((c>2) || (c<2)); //true
//NOT
console.log(!a); //false
console.log(!b); //true
var x;
x= '4' - '2';
console.log(x); //2
x= '4' - 2;
console.log(x);//2
x= 4+true;
console.log(x);//5
x=4+null;
console.log(x);//4
x=4+undefined;
console.log(x); //