import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'parentchildapp';
  data={
    name:"John",
    age:33,
    email:"john@gmail.com"
  };
  
}
