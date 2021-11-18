import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { of, Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { environment } from '../../environments/environment';
import { AuthResponse } from './../models/auth-response';
import { LoginObject } from './../models/login-object.model';

@Injectable({
  providedIn: 'root'
})

export class AuthService {

  constructor( private http: HttpClient ) { }

  private baseUrl: string = environment.baseUrl;
  private _usuario!: LoginObject;

  get usuario() {
    return { ...this._usuario };
  }


  login( username: string, password: string ) {

    const url  = `${ this.baseUrl }/login`;
    const body = { username, password };

    return this.http.post<any>( url, body )
      .pipe(
        tap( (resp:any) => {
          localStorage.setItem('token',`${resp.data.objects.token.substring(7)}`);
        }),
        map((resp:any)=>resp.data.objects),
        catchError( err => of(false) )
      );
  }

  validarToken(): Observable<boolean> {

    const url = `${ this.baseUrl }/refrescar`;

    const headers = new HttpHeaders().set("Authorization",`${localStorage.getItem('token')}`);

    return this.http.post<AuthResponse>( url,null, { headers } )
        .pipe(
          map( (resp:any) => {
            localStorage.setItem('token',`${resp.data.objects.token.substring(7)}` );
            this._usuario = resp.data.objects
            return true;
          }),
          catchError( err => of(false) )
        );

  }

  logout() {
    const url  = `${ this.baseUrl }/auth/logout`;

    const headers = new HttpHeaders().set("Authorization",`${localStorage.getItem('token')}`);

    this.http.post<any>( url,null, { headers }  );

    localStorage.clear();
  }

}
