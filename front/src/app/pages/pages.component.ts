import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-pages',
  templateUrl: './pages.component.html',
  styleUrls: ['./pages.component.css']
})
export class PagesComponent implements OnInit {

  constructor(private authService:AuthService,private router: Router,) { }

  ngOnInit(): void {
  }

  cerrarSesion(){
    this.authService.logout();
    this.router.navigateByUrl("login");
  }
}
