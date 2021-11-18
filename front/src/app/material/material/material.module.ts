import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatIconModule} from '@angular/material/icon';
import { MatDialogModule } from '@angular/material/dialog';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MatIconModule,
    MatDialogModule
  ],
  exports:[
    MatIconModule
  ]
})
export class MaterialModule { }
