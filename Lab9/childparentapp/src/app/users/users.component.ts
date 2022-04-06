import { Component, OnInit ,Output,EventEmitter} from '@angular/core';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
@Output() parentFunction:EventEmitter<any>=new EventEmitter()
  constructor() {

   }
  ngOnInit(): void {
    
  }
sendData()
{
  let data={name:"John"}
  this.parentFunction.emit(data);
}
}
