import * as readlineSync from 'readline-sync';
class employee
{
    id:number;
    username:string;
    email:string;
    password:string;
    constructor(id:number,username:string,email:string,password:string)
    {
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
    }
}
class empInfo
{
    employees:employee[]=[];
    constructor()
    {
        const e1=new employee(1,"john","john@gmail.com","12345");
        const e2=new employee(2,"jack","jack@gmail.com","123");
        this.employees.push(e1);
        this.employees.push(e2);
        
    }
    add()
    {

    }
    update()
    {

    }
    retrieve(id?:number)
    {

    }
    delete()
    {

    }
}
var emp=new empInfo();
const main=function()
{
    console.log("Select Your Choice");
    console.log("1.Retrieve the Employee");
    console.log("2.Add the Employee");
    console.log("3.Update the Employee");
    console.log("4.Delete the Employee");
    var choice=readlineSync.question('Yous choice?');
    switch(choice)
    {
        case '1':
            //emp.retrive();
            break;
        case '2':
            //emp.add();
            break;
        case '3':
           // emp.update();
            break;
        case '4':
           // emp.delete();
            break;
        default:
            console.log('Invalid choice');
    }
    main();
}
main();