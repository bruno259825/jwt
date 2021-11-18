import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-madd',
  templateUrl: './madd.component.html',
  styleUrls: ['./madd.component.css']
})
export class MaddComponent implements OnInit {

  @Output("emitir") 
  emitir=new EventEmitter<boolean>();
  
  constructor() { }

  ngOnInit(): void {

    
    
  }

}
