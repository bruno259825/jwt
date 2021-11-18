import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { PagesComponent } from './pages/pages.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { ProfileComponent } from './pages/profile/profile.component';
import { EntidadesComponent } from './pages/entidades/entidades.component';
import { MaterialModule } from './material/material/material.module';
import { MeditComponent } from './modal/medit/medit.component';
import { MdelComponent } from './modal/mdel/mdel.component';
import { MaddComponent } from './modal/madd/madd.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    PagesComponent,
    ProfileComponent,
    EntidadesComponent,
    MeditComponent,
    MdelComponent,
    MaddComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
