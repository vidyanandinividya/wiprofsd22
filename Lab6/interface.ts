/*interface BasicUser<A=boolean>
{
    name:string;
    age:number;
    isAdmin:A;
}
interface userWithPermission extends BasicUser
{
    permission:string[];
}

const user:BasicUser={
    name:"Nick",
    age:23,
    isAdmin:true,
}
const user2:BasicUser={
    name:"Nick",
    age:23,
    isAdmin:true,
}
const user1:userWithPermission={
    name:"Nick",
    age:23,
    isAdmin:false,
    permission:["manager","operator","instructor"],
}
const userArray:BasicUser[]=[user,user2];
function firstUser(userArray:BasicUser[]):BasicUser
{
    return userArray[0]
}
function getFirst<T>(arr:T[]):T
{
    return arr[0];
}
getFirst<BasicUser>(userArray);*/
type permission="user"|"admin"|"manager";
type BasicUser<A=boolean,p=string[]>=
{
    name:string;
    age:number;
    isAdmin:A;
    permission?:p[];
}
type AdvancedUser=
{
    account:number;
}
type FullUser<A=boolean,p=string[]>=BasicUser<A,p> & AdvancedUser
const user3:FullUser<boolean,permission>={
    name:"nick",
    age:33,
    isAdmin:true,
    account:100,
    permission:["admin"],
}

