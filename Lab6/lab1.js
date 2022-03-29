"use strict";
exports.__esModule = true;
var readlineSync = require("readline-sync");
var employee = /** @class */ (function () {
    function employee(id, username, email, password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    return employee;
}());
var empInfo = /** @class */ (function () {
    function empInfo() {
        this.employees = [];
        var e1 = new employee(1, "john", "john@gmail.com", "12345");
        var e2 = new employee(2, "jack", "jack@gmail.com", "123");
        this.employees.push(e1);
        this.employees.push(e2);
    }
    return empInfo;
}());
var emp = new empInfo();
var main = function () {
    console.log("Select Your Choice");
    console.log("1.Retrieve the Employee");
    console.log("2.Add the Employee");
    console.log("3.Update the Employee");
    console.log("4.Delete the Employee");
    var choice = readlineSync.question('Yous choice?');
    switch (choice) {
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
};
main();
