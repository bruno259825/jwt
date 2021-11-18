import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { EntidadesService } from 'src/app/services/entidades.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-medit',
  templateUrl: './medit.component.html',
  styleUrls: ['./medit.component.css']
})
export class MeditComponent implements OnInit {

  @Output("emitir") 
  emitir=new EventEmitter<boolean>();
  
  @Input("entidadSeleccionada") entidadSeleccionada:any={}
  constructor() { }

  ngOnInit(): void {
    let tipoContribuyente="";
    let tipoDocumento="";

    if(this.entidadSeleccionada.tipo_contribuyente!=null){
      tipoContribuyente=this.entidadSeleccionada.tipo_contribuyente;
    }

    if(this.entidadSeleccionada.tipo_documento!=null){
      tipoDocumento=this.entidadSeleccionada.tipo_documento;
    }

    Swal.fire({
      title: 'Información',
      html: `
        <p><strong>Número de documento:</strong> ${this.entidadSeleccionada.nro_documento}</p>
        <p><strong>Razón social:</strong> ${this.entidadSeleccionada.razon_social}</p>
        <p><strong>Tipo de contribuyente:</strong> ${tipoContribuyente}</p>
        <p><strong>Tipo de documento:</strong> ${tipoDocumento}</p>
        <p><strong>Nombre comercial:</strong> ${this.entidadSeleccionada.nombre_comercial}</p>
        <p><strong>Teléfono:</strong> ${this.entidadSeleccionada.telefono}</p>
        <p><strong>Dirección:</strong> ${this.entidadSeleccionada.direccion}</p>
        <p><strong>Estado:</strong> ${this.entidadSeleccionada.estado}</p>
      `,​​
    

    }).then((result) => {
    
      this.emitir.emit(result.isConfirmed);
      
    })
  }

}
