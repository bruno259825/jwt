import { Component, OnInit, Output,EventEmitter } from '@angular/core';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-mdel',
  templateUrl: './mdel.component.html',
  styleUrls: ['./mdel.component.css']
})
export class MdelComponent implements OnInit {

  @Output("emitir") 
  emitir=new EventEmitter<boolean>();
  
  constructor() { }

  ngOnInit(): void {

    Swal.fire({
      title: '¿Estás seguro?',
      text: "Eliminar entidad",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#d33',
      cancelButtonColor: 'rgb(200, 180, 180);',
      confirmButtonText: 'Eliminar'

    }).then((result) => {
      
      this.emitir.emit(result.isConfirmed);
      
    })


  }

}
