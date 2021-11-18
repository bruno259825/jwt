import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formularioLogin: FormGroup = this.fb.group({
    username:    ['', [ Validators.required]],
    password: ['', [ Validators.required, Validators.minLength(1) ]],
  });

  constructor( private fb: FormBuilder,
               private router: Router, 
               private authService: AuthService) { }
  

  login() {
  
    const { username, password } = this.formularioLogin.value;

    this.authService.login( username, password )
      .subscribe( user => {
        this.router.navigate(['/paginas/perfil']);
      },e=>console.log);
  }

  ngOnInit(): void {
    
  }

}
