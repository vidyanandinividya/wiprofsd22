import { Component, ɵɵpureFunction1 } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'childparentapp';
  name="";
  fn1(data:any)
{
  console.log(data);
  this.name=data.name;
}
}
