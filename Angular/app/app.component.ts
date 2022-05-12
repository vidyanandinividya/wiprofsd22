import { Component } from '@angular/core';
import {FormGroup,FormControl,FormBuilder,Validators} from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'w3-d3-lab';
  constructor(private fb:FormBuilder,private registrationService:RegistrationService) {}
  registrationForm=this.fb.group({
    username:[''],
    emailid:[''],
    address:this.fb.group({
      city:[''],
      state:[''],
      postalcode:['']
    })
  })
}
