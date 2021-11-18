import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  usuario?:any;

  constructor(private authService:AuthService) { 
    this.usuario=this.authService.usuario;
  }

  
  
  ngOnInit(): void {
    this.usuario=this.authService.usuario;
  }

}
