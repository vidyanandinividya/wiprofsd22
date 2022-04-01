"use strict";
exports.__esModule = true;
var readlinesync = require("readline-sync");
var employee = /** @class */ (function () {
    function employee(id, username, eamil, password) {
        this.id = id;
        this.username = username;
        this.eamil = eamil;
        this.password = password;
    }
    return employee;
}());
var empInfo = /** @class */ (function () {
    function empInfo() {
        this.employees = [];
        var e1 = new employee(1, "john", "john@gmail.com", "12345");
        var e2 = new employee(2, "jack", "john@gmail.com", "12345");
        this.employees.push(e1);
        this.employees.push(e2);
    }
    empInfo.prototype.add = function () {
        var id = parseInt(readlinesync.question('id : '));
        var name = readlinesync.question('User Name : ');
        var email = readlinesync.question('Email : ');
        var password = readlinesync.question('Password : ');
        this.employees.push(new employee(id, name, email, password));
        this.retrive();
    };
    empInfo.prototype.update = function () {
        var id = parseInt(readlinesync.question('id : '));
        var x = this.employees.find(function (x) { return x.id == id; });
        var newPassword = readlinesync.question("Enter new Password");
        x.password = newPassword;
        console.log("Employee detail updated");
        this.retrive(x.id);
    };
    empInfo.prototype.retrive = function (id) {
        console.log(this.employees);
    };
    empInfo.prototype["delete"] = function () {
        var id = parseInt(readlinesync.question('Enter id of employee to delete : '));
        var x = this.employees.find(function (x) { return x.id == id; });
        var ind = this.employees.indexOf(x);
        this.employees.splice(ind, 1);
        this.retrive();
    };
    return empInfo;
}());
var emp = new empInfo();
var main = function () {
    console.log('Select your Choice');
    console.log('1. Retrive the Employee');
    console.log('2. Add the Employee');
    console.log('3. Update the Employee');
    console.log('4. Delete the Employee');
    console.log('5. Exit');
    var choice = readlinesync.question('Your choice? ');
    switch (choice) {
        case "1":
            emp.retrive();
            main();
            break;
        case '2':
            emp.add();
            main();
            break;
        case '3':
            emp.update();
            main();
            break;
        case '4':
            emp["delete"]();
            main();
            break;
        case '5':
            break;
        default:
            console.log("Invalid choice.");
            main();
    }
};
main();
